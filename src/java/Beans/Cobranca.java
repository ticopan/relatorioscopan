/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "Cobranca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cobranca.findAll", query = "SELECT c FROM Cobranca c"),
    @NamedQuery(name = "Cobranca.findByCobCodigo", query = "SELECT c FROM Cobranca c WHERE c.cobCodigo = :cobCodigo"),
    @NamedQuery(name = "Cobranca.findByCobGeracao", query = "SELECT c FROM Cobranca c WHERE c.cobGeracao = :cobGeracao"),
    @NamedQuery(name = "Cobranca.findByCobBase", query = "SELECT c FROM Cobranca c WHERE c.cobBase = :cobBase"),
    @NamedQuery(name = "Cobranca.findByCobVencimento", query = "SELECT c FROM Cobranca c WHERE c.cobVencimento = :cobVencimento"),
    @NamedQuery(name = "Cobranca.findByCobPagamento", query = "SELECT c FROM Cobranca c WHERE c.cobPagamento = :cobPagamento"),
    @NamedQuery(name = "Cobranca.findByCobSequencial", query = "SELECT c FROM Cobranca c WHERE c.cobSequencial = :cobSequencial"),
    @NamedQuery(name = "Cobranca.findByCobBkPercIrc", query = "SELECT c FROM Cobranca c WHERE c.cobBkPercIrc = :cobBkPercIrc"),
    @NamedQuery(name = "Cobranca.findByCobBkPercPis", query = "SELECT c FROM Cobranca c WHERE c.cobBkPercPis = :cobBkPercPis"),
    @NamedQuery(name = "Cobranca.findByCobBkPercCof", query = "SELECT c FROM Cobranca c WHERE c.cobBkPercCof = :cobBkPercCof"),
    @NamedQuery(name = "Cobranca.findByCobBkPercCsl", query = "SELECT c FROM Cobranca c WHERE c.cobBkPercCsl = :cobBkPercCsl"),
    @NamedQuery(name = "Cobranca.findByCobBkPercMul", query = "SELECT c FROM Cobranca c WHERE c.cobBkPercMul = :cobBkPercMul"),
    @NamedQuery(name = "Cobranca.findByCobBkPercJur", query = "SELECT c FROM Cobranca c WHERE c.cobBkPercJur = :cobBkPercJur"),
    @NamedQuery(name = "Cobranca.findByCobBkPercEme", query = "SELECT c FROM Cobranca c WHERE c.cobBkPercEme = :cobBkPercEme"),
    @NamedQuery(name = "Cobranca.findByCobBkPercVid", query = "SELECT c FROM Cobranca c WHERE c.cobBkPercVid = :cobBkPercVid"),
    @NamedQuery(name = "Cobranca.findByCobBkPercMvi", query = "SELECT c FROM Cobranca c WHERE c.cobBkPercMvi = :cobBkPercMvi"),
    @NamedQuery(name = "Cobranca.findByCobBkPercBil", query = "SELECT c FROM Cobranca c WHERE c.cobBkPercBil = :cobBkPercBil"),
    @NamedQuery(name = "Cobranca.findByCobBkPercOvi", query = "SELECT c FROM Cobranca c WHERE c.cobBkPercOvi = :cobBkPercOvi"),
    @NamedQuery(name = "Cobranca.findByCobBkTxAdm", query = "SELECT c FROM Cobranca c WHERE c.cobBkTxAdm = :cobBkTxAdm"),
    @NamedQuery(name = "Cobranca.findByCobBkCodCobranca", query = "SELECT c FROM Cobranca c WHERE c.cobBkCodCobranca = :cobBkCodCobranca"),
    @NamedQuery(name = "Cobranca.findByCobBkTxInclusa", query = "SELECT c FROM Cobranca c WHERE c.cobBkTxInclusa = :cobBkTxInclusa"),
    @NamedQuery(name = "Cobranca.findByCobBkRtImposto", query = "SELECT c FROM Cobranca c WHERE c.cobBkRtImposto = :cobBkRtImposto"),
    @NamedQuery(name = "Cobranca.findByCobBkReferencia", query = "SELECT c FROM Cobranca c WHERE c.cobBkReferencia = :cobBkReferencia"),
    @NamedQuery(name = "Cobranca.findByCobSituacao", query = "SELECT c FROM Cobranca c WHERE c.cobSituacao = :cobSituacao")})
public class Cobranca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "cob_Codigo")
    private String cobCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_Geracao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cobGeracao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_Base")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cobBase;
    @Column(name = "cob_Vencimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cobVencimento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_Pagamento")
    private char cobPagamento;
    @Size(max = 2)
    @Column(name = "cob_Sequencial")
    private String cobSequencial;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkPercIrc")
    private BigDecimal cobBkPercIrc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkPercPis")
    private BigDecimal cobBkPercPis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkPercCof")
    private BigDecimal cobBkPercCof;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkPercCsl")
    private BigDecimal cobBkPercCsl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkPercMul")
    private BigDecimal cobBkPercMul;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkPercJur")
    private BigDecimal cobBkPercJur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkPercEme")
    private BigDecimal cobBkPercEme;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkPercVid")
    private BigDecimal cobBkPercVid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkPercMvi")
    private BigDecimal cobBkPercMvi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkPercBil")
    private BigDecimal cobBkPercBil;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkPercOvi")
    private BigDecimal cobBkPercOvi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkTxAdm")
    private BigDecimal cobBkTxAdm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkCodCobranca")
    private char cobBkCodCobranca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkTxInclusa")
    private char cobBkTxInclusa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkRtImposto")
    private char cobBkRtImposto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_BkReferencia")
    private char cobBkReferencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cob_Situacao")
    private char cobSituacao;
    @OneToMany(mappedBy = "cobCodigo")
    private List<Boletim> boletimList;
    @JoinColumn(name = "con_Codigo", referencedColumnName = "con_Codigo")
    @ManyToOne(optional = false)
    private Convenio conCodigo;

    public Cobranca() {
    }

    public Cobranca(String cobCodigo) {
        this.cobCodigo = cobCodigo;
    }

    public Cobranca(String cobCodigo, Date cobGeracao, Date cobBase, char cobPagamento, BigDecimal cobBkPercIrc, BigDecimal cobBkPercPis, BigDecimal cobBkPercCof, BigDecimal cobBkPercCsl, BigDecimal cobBkPercMul, BigDecimal cobBkPercJur, BigDecimal cobBkPercEme, BigDecimal cobBkPercVid, BigDecimal cobBkPercMvi, BigDecimal cobBkPercBil, BigDecimal cobBkPercOvi, BigDecimal cobBkTxAdm, char cobBkCodCobranca, char cobBkTxInclusa, char cobBkRtImposto, char cobBkReferencia, char cobSituacao) {
        this.cobCodigo = cobCodigo;
        this.cobGeracao = cobGeracao;
        this.cobBase = cobBase;
        this.cobPagamento = cobPagamento;
        this.cobBkPercIrc = cobBkPercIrc;
        this.cobBkPercPis = cobBkPercPis;
        this.cobBkPercCof = cobBkPercCof;
        this.cobBkPercCsl = cobBkPercCsl;
        this.cobBkPercMul = cobBkPercMul;
        this.cobBkPercJur = cobBkPercJur;
        this.cobBkPercEme = cobBkPercEme;
        this.cobBkPercVid = cobBkPercVid;
        this.cobBkPercMvi = cobBkPercMvi;
        this.cobBkPercBil = cobBkPercBil;
        this.cobBkPercOvi = cobBkPercOvi;
        this.cobBkTxAdm = cobBkTxAdm;
        this.cobBkCodCobranca = cobBkCodCobranca;
        this.cobBkTxInclusa = cobBkTxInclusa;
        this.cobBkRtImposto = cobBkRtImposto;
        this.cobBkReferencia = cobBkReferencia;
        this.cobSituacao = cobSituacao;
    }

    public String getCobCodigo() {
        return cobCodigo;
    }

    public void setCobCodigo(String cobCodigo) {
        this.cobCodigo = cobCodigo;
    }

    public Date getCobGeracao() {
        return cobGeracao;
    }

    public void setCobGeracao(Date cobGeracao) {
        this.cobGeracao = cobGeracao;
    }

    public Date getCobBase() {
        return cobBase;
    }

    public void setCobBase(Date cobBase) {
        this.cobBase = cobBase;
    }

    public Date getCobVencimento() {
        return cobVencimento;
    }

    public void setCobVencimento(Date cobVencimento) {
        this.cobVencimento = cobVencimento;
    }

    public char getCobPagamento() {
        return cobPagamento;
    }

    public void setCobPagamento(char cobPagamento) {
        this.cobPagamento = cobPagamento;
    }

    public String getCobSequencial() {
        return cobSequencial;
    }

    public void setCobSequencial(String cobSequencial) {
        this.cobSequencial = cobSequencial;
    }

    public BigDecimal getCobBkPercIrc() {
        return cobBkPercIrc;
    }

    public void setCobBkPercIrc(BigDecimal cobBkPercIrc) {
        this.cobBkPercIrc = cobBkPercIrc;
    }

    public BigDecimal getCobBkPercPis() {
        return cobBkPercPis;
    }

    public void setCobBkPercPis(BigDecimal cobBkPercPis) {
        this.cobBkPercPis = cobBkPercPis;
    }

    public BigDecimal getCobBkPercCof() {
        return cobBkPercCof;
    }

    public void setCobBkPercCof(BigDecimal cobBkPercCof) {
        this.cobBkPercCof = cobBkPercCof;
    }

    public BigDecimal getCobBkPercCsl() {
        return cobBkPercCsl;
    }

    public void setCobBkPercCsl(BigDecimal cobBkPercCsl) {
        this.cobBkPercCsl = cobBkPercCsl;
    }

    public BigDecimal getCobBkPercMul() {
        return cobBkPercMul;
    }

    public void setCobBkPercMul(BigDecimal cobBkPercMul) {
        this.cobBkPercMul = cobBkPercMul;
    }

    public BigDecimal getCobBkPercJur() {
        return cobBkPercJur;
    }

    public void setCobBkPercJur(BigDecimal cobBkPercJur) {
        this.cobBkPercJur = cobBkPercJur;
    }

    public BigDecimal getCobBkPercEme() {
        return cobBkPercEme;
    }

    public void setCobBkPercEme(BigDecimal cobBkPercEme) {
        this.cobBkPercEme = cobBkPercEme;
    }

    public BigDecimal getCobBkPercVid() {
        return cobBkPercVid;
    }

    public void setCobBkPercVid(BigDecimal cobBkPercVid) {
        this.cobBkPercVid = cobBkPercVid;
    }

    public BigDecimal getCobBkPercMvi() {
        return cobBkPercMvi;
    }

    public void setCobBkPercMvi(BigDecimal cobBkPercMvi) {
        this.cobBkPercMvi = cobBkPercMvi;
    }

    public BigDecimal getCobBkPercBil() {
        return cobBkPercBil;
    }

    public void setCobBkPercBil(BigDecimal cobBkPercBil) {
        this.cobBkPercBil = cobBkPercBil;
    }

    public BigDecimal getCobBkPercOvi() {
        return cobBkPercOvi;
    }

    public void setCobBkPercOvi(BigDecimal cobBkPercOvi) {
        this.cobBkPercOvi = cobBkPercOvi;
    }

    public BigDecimal getCobBkTxAdm() {
        return cobBkTxAdm;
    }

    public void setCobBkTxAdm(BigDecimal cobBkTxAdm) {
        this.cobBkTxAdm = cobBkTxAdm;
    }

    public char getCobBkCodCobranca() {
        return cobBkCodCobranca;
    }

    public void setCobBkCodCobranca(char cobBkCodCobranca) {
        this.cobBkCodCobranca = cobBkCodCobranca;
    }

    public char getCobBkTxInclusa() {
        return cobBkTxInclusa;
    }

    public void setCobBkTxInclusa(char cobBkTxInclusa) {
        this.cobBkTxInclusa = cobBkTxInclusa;
    }

    public char getCobBkRtImposto() {
        return cobBkRtImposto;
    }

    public void setCobBkRtImposto(char cobBkRtImposto) {
        this.cobBkRtImposto = cobBkRtImposto;
    }

    public char getCobBkReferencia() {
        return cobBkReferencia;
    }

    public void setCobBkReferencia(char cobBkReferencia) {
        this.cobBkReferencia = cobBkReferencia;
    }

    public char getCobSituacao() {
        return cobSituacao;
    }

    public void setCobSituacao(char cobSituacao) {
        this.cobSituacao = cobSituacao;
    }

    @XmlTransient
    public List<Boletim> getBoletimList() {
        return boletimList;
    }

    public void setBoletimList(List<Boletim> boletimList) {
        this.boletimList = boletimList;
    }

    public Convenio getConCodigo() {
        return conCodigo;
    }

    public void setConCodigo(Convenio conCodigo) {
        this.conCodigo = conCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cobCodigo != null ? cobCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cobranca)) {
            return false;
        }
        Cobranca other = (Cobranca) object;
        if ((this.cobCodigo == null && other.cobCodigo != null) || (this.cobCodigo != null && !this.cobCodigo.equals(other.cobCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Cobranca[ cobCodigo=" + cobCodigo + " ]";
    }
    
}
