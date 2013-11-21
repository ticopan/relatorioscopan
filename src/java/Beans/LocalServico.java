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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LocalServico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LocalServico.findAll", query = "SELECT l FROM LocalServico l"),
    @NamedQuery(name = "LocalServico.findByLocCodigo", query = "SELECT l FROM LocalServico l WHERE l.localServicoPK.locCodigo = :locCodigo"),
    @NamedQuery(name = "LocalServico.findBySerCodigo", query = "SELECT l FROM LocalServico l WHERE l.localServicoPK.serCodigo = :serCodigo"),
    @NamedQuery(name = "LocalServico.findByLseUsuario", query = "SELECT l FROM LocalServico l WHERE l.lseUsuario = :lseUsuario"),
    @NamedQuery(name = "LocalServico.findByLseCadastro", query = "SELECT l FROM LocalServico l WHERE l.lseCadastro = :lseCadastro")})
public class LocalServico implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LocalServicoPK localServicoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "lse_Usuario")
    private String lseUsuario;
    @Column(name = "lse_Cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lseCadastro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "localServico")
    private List<Boletim> boletimList;
    @JoinColumn(name = "ser_Codigo", referencedColumnName = "ser_Codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Servico servico;
    @JoinColumn(name = "loc_Codigo", referencedColumnName = "loc_Codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Local local;

    public LocalServico() {
    }

    public LocalServico(LocalServicoPK localServicoPK) {
        this.localServicoPK = localServicoPK;
    }

    public LocalServico(LocalServicoPK localServicoPK, String lseUsuario) {
        this.localServicoPK = localServicoPK;
        this.lseUsuario = lseUsuario;
    }

    public LocalServico(String locCodigo, String serCodigo) {
        this.localServicoPK = new LocalServicoPK(locCodigo, serCodigo);
    }

    public LocalServicoPK getLocalServicoPK() {
        return localServicoPK;
    }

    public void setLocalServicoPK(LocalServicoPK localServicoPK) {
        this.localServicoPK = localServicoPK;
    }

    public String getLseUsuario() {
        return lseUsuario;
    }

    public void setLseUsuario(String lseUsuario) {
        this.lseUsuario = lseUsuario;
    }

    public Date getLseCadastro() {
        return lseCadastro;
    }

    public void setLseCadastro(Date lseCadastro) {
        this.lseCadastro = lseCadastro;
    }

    @XmlTransient
    public List<Boletim> getBoletimList() {
        return boletimList;
    }

    public void setBoletimList(List<Boletim> boletimList) {
        this.boletimList = boletimList;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (localServicoPK != null ? localServicoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocalServico)) {
            return false;
        }
        LocalServico other = (LocalServico) object;
        if ((this.localServicoPK == null && other.localServicoPK != null) || (this.localServicoPK != null && !this.localServicoPK.equals(other.localServicoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.LocalServico[ localServicoPK=" + localServicoPK + " ]";
    }
    
}
