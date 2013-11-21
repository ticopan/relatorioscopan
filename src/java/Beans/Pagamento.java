/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "Pagamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagamento.findAll", query = "SELECT p FROM Pagamento p"),
    @NamedQuery(name = "Pagamento.findByPagCodigo", query = "SELECT p FROM Pagamento p WHERE p.pagCodigo = :pagCodigo"),
    @NamedQuery(name = "Pagamento.findByPagBase", query = "SELECT p FROM Pagamento p WHERE p.pagBase = :pagBase"),
    @NamedQuery(name = "Pagamento.findByPagGeracao", query = "SELECT p FROM Pagamento p WHERE p.pagGeracao = :pagGeracao"),
    @NamedQuery(name = "Pagamento.findByPagSituacao", query = "SELECT p FROM Pagamento p WHERE p.pagSituacao = :pagSituacao"),
    @NamedQuery(name = "Pagamento.findByPagAutorizacao", query = "SELECT p FROM Pagamento p WHERE p.pagAutorizacao = :pagAutorizacao"),
    @NamedQuery(name = "Pagamento.findByPagAutLogin", query = "SELECT p FROM Pagamento p WHERE p.pagAutLogin = :pagAutLogin"),
    @NamedQuery(name = "Pagamento.findByPagEnvio", query = "SELECT p FROM Pagamento p WHERE p.pagEnvio = :pagEnvio"),
    @NamedQuery(name = "Pagamento.findByPagEnvLogin", query = "SELECT p FROM Pagamento p WHERE p.pagEnvLogin = :pagEnvLogin"),
    @NamedQuery(name = "Pagamento.findByPagMedicred", query = "SELECT p FROM Pagamento p WHERE p.pagMedicred = :pagMedicred"),
    @NamedQuery(name = "Pagamento.findByPagMedLogin", query = "SELECT p FROM Pagamento p WHERE p.pagMedLogin = :pagMedLogin"),
    @NamedQuery(name = "Pagamento.findByPagArqPag", query = "SELECT p FROM Pagamento p WHERE p.pagArqPag = :pagArqPag")})
public class Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "pag_Codigo")
    private String pagCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pag_Base")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pagBase;
    @Column(name = "pag_Geracao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pagGeracao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pag_Situacao")
    private char pagSituacao;
    @Column(name = "pag_Autorizacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pagAutorizacao;
    @Size(max = 10)
    @Column(name = "pag_AutLogin")
    private String pagAutLogin;
    @Column(name = "pag_Envio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pagEnvio;
    @Size(max = 10)
    @Column(name = "pag_EnvLogin")
    private String pagEnvLogin;
    @Column(name = "pag_Medicred")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pagMedicred;
    @Size(max = 10)
    @Column(name = "pag_MedLogin")
    private String pagMedLogin;
    @Size(max = 18)
    @Column(name = "pag_ArqPag")
    private String pagArqPag;
    @OneToMany(mappedBy = "pagCodigo")
    private List<Boletim> boletimList;

    public Pagamento() {
    }

    public Pagamento(String pagCodigo) {
        this.pagCodigo = pagCodigo;
    }

    public Pagamento(String pagCodigo, Date pagBase, char pagSituacao) {
        this.pagCodigo = pagCodigo;
        this.pagBase = pagBase;
        this.pagSituacao = pagSituacao;
    }

    public String getPagCodigo() {
        return pagCodigo;
    }

    public void setPagCodigo(String pagCodigo) {
        this.pagCodigo = pagCodigo;
    }

    public Date getPagBase() {
        return pagBase;
    }

    public void setPagBase(Date pagBase) {
        this.pagBase = pagBase;
    }

    public Date getPagGeracao() {
        return pagGeracao;
    }

    public void setPagGeracao(Date pagGeracao) {
        this.pagGeracao = pagGeracao;
    }

    public char getPagSituacao() {
        return pagSituacao;
    }

    public void setPagSituacao(char pagSituacao) {
        this.pagSituacao = pagSituacao;
    }

    public Date getPagAutorizacao() {
        return pagAutorizacao;
    }

    public void setPagAutorizacao(Date pagAutorizacao) {
        this.pagAutorizacao = pagAutorizacao;
    }

    public String getPagAutLogin() {
        return pagAutLogin;
    }

    public void setPagAutLogin(String pagAutLogin) {
        this.pagAutLogin = pagAutLogin;
    }

    public Date getPagEnvio() {
        return pagEnvio;
    }

    public void setPagEnvio(Date pagEnvio) {
        this.pagEnvio = pagEnvio;
    }

    public String getPagEnvLogin() {
        return pagEnvLogin;
    }

    public void setPagEnvLogin(String pagEnvLogin) {
        this.pagEnvLogin = pagEnvLogin;
    }

    public Date getPagMedicred() {
        return pagMedicred;
    }

    public void setPagMedicred(Date pagMedicred) {
        this.pagMedicred = pagMedicred;
    }

    public String getPagMedLogin() {
        return pagMedLogin;
    }

    public void setPagMedLogin(String pagMedLogin) {
        this.pagMedLogin = pagMedLogin;
    }

    public String getPagArqPag() {
        return pagArqPag;
    }

    public void setPagArqPag(String pagArqPag) {
        this.pagArqPag = pagArqPag;
    }

    @XmlTransient
    public List<Boletim> getBoletimList() {
        return boletimList;
    }

    public void setBoletimList(List<Boletim> boletimList) {
        this.boletimList = boletimList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagCodigo != null ? pagCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagamento)) {
            return false;
        }
        Pagamento other = (Pagamento) object;
        if ((this.pagCodigo == null && other.pagCodigo != null) || (this.pagCodigo != null && !this.pagCodigo.equals(other.pagCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Pagamento[ pagCodigo=" + pagCodigo + " ]";
    }
    
}
