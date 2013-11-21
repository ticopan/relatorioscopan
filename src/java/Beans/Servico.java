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
@Table(name = "Servico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servico.findAll", query = "SELECT s FROM Servico s"),
    @NamedQuery(name = "Servico.findBySerCodigo", query = "SELECT s FROM Servico s WHERE s.serCodigo = :serCodigo"),
    @NamedQuery(name = "Servico.findBySerNome", query = "SELECT s FROM Servico s WHERE s.serNome = :serNome"),
    @NamedQuery(name = "Servico.findBySerLogin", query = "SELECT s FROM Servico s WHERE s.serLogin = :serLogin"),
    @NamedQuery(name = "Servico.findBySerSenha", query = "SELECT s FROM Servico s WHERE s.serSenha = :serSenha"),
    @NamedQuery(name = "Servico.findBySerUsuario", query = "SELECT s FROM Servico s WHERE s.serUsuario = :serUsuario"),
    @NamedQuery(name = "Servico.findBySerCadastro", query = "SELECT s FROM Servico s WHERE s.serCadastro = :serCadastro")})
public class Servico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "ser_Codigo")
    private String serCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ser_Nome")
    private String serNome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ser_Login")
    private String serLogin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ser_Senha")
    private String serSenha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ser_Usuario")
    private String serUsuario;
    @Column(name = "ser_Cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date serCadastro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servico")
    private List<LocalServico> localServicoList;

    public Servico() {
    }

    public Servico(String serCodigo) {
        this.serCodigo = serCodigo;
    }

    public Servico(String serCodigo, String serNome, String serLogin, String serSenha, String serUsuario) {
        this.serCodigo = serCodigo;
        this.serNome = serNome;
        this.serLogin = serLogin;
        this.serSenha = serSenha;
        this.serUsuario = serUsuario;
    }

    public String getSerCodigo() {
        return serCodigo;
    }

    public void setSerCodigo(String serCodigo) {
        this.serCodigo = serCodigo;
    }

    public String getSerNome() {
        return serNome;
    }

    public void setSerNome(String serNome) {
        this.serNome = serNome;
    }

    public String getSerLogin() {
        return serLogin;
    }

    public void setSerLogin(String serLogin) {
        this.serLogin = serLogin;
    }

    public String getSerSenha() {
        return serSenha;
    }

    public void setSerSenha(String serSenha) {
        this.serSenha = serSenha;
    }

    public String getSerUsuario() {
        return serUsuario;
    }

    public void setSerUsuario(String serUsuario) {
        this.serUsuario = serUsuario;
    }

    public Date getSerCadastro() {
        return serCadastro;
    }

    public void setSerCadastro(Date serCadastro) {
        this.serCadastro = serCadastro;
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
        hash += (serCodigo != null ? serCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servico)) {
            return false;
        }
        Servico other = (Servico) object;
        if ((this.serCodigo == null && other.serCodigo != null) || (this.serCodigo != null && !this.serCodigo.equals(other.serCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Servico[ serCodigo=" + serCodigo + " ]";
    }
    
}
