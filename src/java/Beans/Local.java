/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kleysson
 */
@Entity
@Table(name = "Local")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Local.findAll", query = "SELECT l FROM Local l"),
    @NamedQuery(name = "Local.findByLocCodigo", query = "SELECT l FROM Local l WHERE l.locCodigo = :locCodigo"),
    @NamedQuery(name = "Local.findByLocNome", query = "SELECT l FROM Local l WHERE l.locNome = :locNome"),
    @NamedQuery(name = "Local.findByLocUsuario", query = "SELECT l FROM Local l WHERE l.locUsuario = :locUsuario"),
    @NamedQuery(name = "Local.findByLocCadastro", query = "SELECT l FROM Local l WHERE l.locCadastro = :locCadastro")})
public class Local implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "loc_Codigo")
    private String locCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "loc_Nome")
    private String locNome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "loc_Usuario")
    private String locUsuario;
    @Column(name = "loc_Cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date locCadastro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "local")
    private List<LocalServico> localServicoList;

    public Local() {
    }

    public Local(String locCodigo) {
        this.locCodigo = locCodigo;
    }

    public Local(String locCodigo, String locNome, String locUsuario) {
        this.locCodigo = locCodigo;
        this.locNome = locNome;
        this.locUsuario = locUsuario;
    }

    public String getLocCodigo() {
        return locCodigo;
    }

    public void setLocCodigo(String locCodigo) {
        this.locCodigo = locCodigo;
    }

    public String getLocNome() {
        return locNome;
    }

    public void setLocNome(String locNome) {
        this.locNome = locNome;
    }

    public String getLocUsuario() {
        return locUsuario;
    }

    public void setLocUsuario(String locUsuario) {
        this.locUsuario = locUsuario;
    }

    public Date getLocCadastro() {
        return locCadastro;
    }

    public void setLocCadastro(Date locCadastro) {
        this.locCadastro = locCadastro;
    }

    @XmlTransient
    public List<LocalServico> getLocalServicoList() {
        return localServicoList;
    }

    public void setLocalServicoList(List<LocalServico> localServicoList) {
        this.localServicoList = localServicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locCodigo != null ? locCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Local)) {
            return false;
        }
        Local other = (Local) object;
        if ((this.locCodigo == null && other.locCodigo != null) || (this.locCodigo != null && !this.locCodigo.equals(other.locCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Local[ locCodigo=" + locCodigo + " ]";
    }
    
}
