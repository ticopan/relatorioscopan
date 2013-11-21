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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "Cooperado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cooperado.findAll", query = "SELECT c FROM Cooperado c"),
    @NamedQuery(name = "Cooperado.findByCooCrm", query = "SELECT c FROM Cooperado c WHERE c.cooCrm = :cooCrm"),
    @NamedQuery(name = "Cooperado.findByCooNome", query = "SELECT c FROM Cooperado c WHERE c.cooNome = :cooNome"),
    @NamedQuery(name = "Cooperado.findByCooNascimento", query = "SELECT c FROM Cooperado c WHERE c.cooNascimento = :cooNascimento"),
    @NamedQuery(name = "Cooperado.findByCooAdmissao", query = "SELECT c FROM Cooperado c WHERE c.cooAdmissao = :cooAdmissao"),
    @NamedQuery(name = "Cooperado.findByCooDemissao", query = "SELECT c FROM Cooperado c WHERE c.cooDemissao = :cooDemissao"),
    @NamedQuery(name = "Cooperado.findByCooFalecimento", query = "SELECT c FROM Cooperado c WHERE c.cooFalecimento = :cooFalecimento"),
    @NamedQuery(name = "Cooperado.findByCooCpf", query = "SELECT c FROM Cooperado c WHERE c.cooCpf = :cooCpf"),
    @NamedQuery(name = "Cooperado.findByCooCpfDeposito", query = "SELECT c FROM Cooperado c WHERE c.cooCpfDeposito = :cooCpfDeposito"),
    @NamedQuery(name = "Cooperado.findByCooCnpjDeposito", query = "SELECT c FROM Cooperado c WHERE c.cooCnpjDeposito = :cooCnpjDeposito"),
    @NamedQuery(name = "Cooperado.findByCooSituacao", query = "SELECT c FROM Cooperado c WHERE c.cooSituacao = :cooSituacao"),
    @NamedQuery(name = "Cooperado.findByCooTaxa", query = "SELECT c FROM Cooperado c WHERE c.cooTaxa = :cooTaxa"),
    @NamedQuery(name = "Cooperado.findByCooMatriculaCopan", query = "SELECT c FROM Cooperado c WHERE c.cooMatriculaCopan = :cooMatriculaCopan"),
    @NamedQuery(name = "Cooperado.findByCooRegistroSpa", query = "SELECT c FROM Cooperado c WHERE c.cooRegistroSpa = :cooRegistroSpa"),
    @NamedQuery(name = "Cooperado.findByCooRegistroSba", query = "SELECT c FROM Cooperado c WHERE c.cooRegistroSba = :cooRegistroSba"),
    @NamedQuery(name = "Cooperado.findByCooCorrespSpa", query = "SELECT c FROM Cooperado c WHERE c.cooCorrespSpa = :cooCorrespSpa"),
    @NamedQuery(name = "Cooperado.findByCooCorrespCopan", query = "SELECT c FROM Cooperado c WHERE c.cooCorrespCopan = :cooCorrespCopan"),
    @NamedQuery(name = "Cooperado.findByCooContaCorrente", query = "SELECT c FROM Cooperado c WHERE c.cooContaCorrente = :cooContaCorrente"),
    @NamedQuery(name = "Cooperado.findByCooClainss", query = "SELECT c FROM Cooperado c WHERE c.cooClainss = :cooClainss"),
    @NamedQuery(name = "Cooperado.findByCooReginss", query = "SELECT c FROM Cooperado c WHERE c.cooReginss = :cooReginss"),
    @NamedQuery(name = "Cooperado.findByCooRecinss", query = "SELECT c FROM Cooperado c WHERE c.cooRecinss = :cooRecinss"),
    @NamedQuery(name = "Cooperado.findByCooAposentado", query = "SELECT c FROM Cooperado c WHERE c.cooAposentado = :cooAposentado"),
    @NamedQuery(name = "Cooperado.findByCooProducao", query = "SELECT c FROM Cooperado c WHERE c.cooProducao = :cooProducao"),
    @NamedQuery(name = "Cooperado.findByCooLogin", query = "SELECT c FROM Cooperado c WHERE c.cooLogin = :cooLogin"),
    @NamedQuery(name = "Cooperado.findByCooSenha", query = "SELECT c FROM Cooperado c WHERE c.cooSenha = :cooSenha"),
    @NamedQuery(name = "Cooperado.findByCooAtualizacao", query = "SELECT c FROM Cooperado c WHERE c.cooAtualizacao = :cooAtualizacao"),
    @NamedQuery(name = "Cooperado.findByCooFormaPagamento", query = "SELECT c FROM Cooperado c WHERE c.cooFormaPagamento = :cooFormaPagamento"),
    @NamedQuery(name = "Cooperado.findByCooImprime", query = "SELECT c FROM Cooperado c WHERE c.cooImprime = :cooImprime"),
    @NamedQuery(name = "Cooperado.findByCooAtuLogin", query = "SELECT c FROM Cooperado c WHERE c.cooAtuLogin = :cooAtuLogin"),
    @NamedQuery(name = "Cooperado.findByCooTipo", query = "SELECT c FROM Cooperado c WHERE c.cooTipo = :cooTipo"),
    @NamedQuery(name = "Cooperado.findByCooLimite", query = "SELECT c FROM Cooperado c WHERE c.cooLimite = :cooLimite")})
public class Cooperado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "coo_Crm")
    private String cooCrm;
    @Size(max = 30)
    @Column(name = "coo_Nome")
    private String cooNome;
    @Column(name = "coo_Nascimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cooNascimento;
    @Column(name = "coo_Admissao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cooAdmissao;
    @Column(name = "coo_Demissao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cooDemissao;
    @Column(name = "coo_Falecimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cooFalecimento;
    @Size(max = 18)
    @Column(name = "coo_Cpf")
    private String cooCpf;
    @Size(max = 14)
    @Column(name = "coo_CpfDeposito")
    private String cooCpfDeposito;
    @Size(max = 18)
    @Column(name = "coo_CnpjDeposito")
    private String cooCnpjDeposito;
    @Column(name = "coo_Situacao")
    private Character cooSituacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "coo_Taxa")
    private BigDecimal cooTaxa;
    @Size(max = 4)
    @Column(name = "coo_MatriculaCopan")
    private String cooMatriculaCopan;
    @Size(max = 4)
    @Column(name = "coo_RegistroSpa")
    private String cooRegistroSpa;
    @Size(max = 6)
    @Column(name = "coo_RegistroSba")
    private String cooRegistroSba;
    @Size(max = 2)
    @Column(name = "coo_CorrespSpa")
    private String cooCorrespSpa;
    @Size(max = 2)
    @Column(name = "coo_CorrespCopan")
    private String cooCorrespCopan;
    @Size(max = 15)
    @Column(name = "coo_ContaCorrente")
    private String cooContaCorrente;
    @Size(max = 2)
    @Column(name = "coo_Clainss")
    private String cooClainss;
    @Size(max = 11)
    @Column(name = "coo_Reginss")
    private String cooReginss;
    @Column(name = "coo_Recinss")
    private Character cooRecinss;
    @Column(name = "coo_Aposentado")
    private Character cooAposentado;
    @Column(name = "coo_Producao")
    private Character cooProducao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "coo_Login")
    private String cooLogin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "coo_Senha")
    private String cooSenha;
    @Column(name = "coo_Atualizacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cooAtualizacao;
    @Column(name = "coo_FormaPagamento")
    private Character cooFormaPagamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coo_Imprime")
    private char cooImprime;
    @Size(max = 10)
    @Column(name = "coo_AtuLogin")
    private String cooAtuLogin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coo_Tipo")
    private char cooTipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coo_Limite")
    private char cooLimite;
    @JoinTable(name = "CooperadoDelegacao", joinColumns = {
        @JoinColumn(name = "cde_Delegante", referencedColumnName = "coo_Crm")}, inverseJoinColumns = {
        @JoinColumn(name = "cde_Delegado", referencedColumnName = "coo_Crm")})
    @ManyToMany
    private List<Cooperado> cooperadoList;
    @ManyToMany(mappedBy = "cooperadoList")
    private List<Cooperado> cooperadoList1;
    @JoinColumn(name = "reg_Codigo", referencedColumnName = "reg_Codigo")
    @ManyToOne
    private Regiao regCodigo;
    @JoinColumns({
        @JoinColumn(name = "bco_Codigo", referencedColumnName = "bco_Codigo"),
        @JoinColumn(name = "age_Codigo", referencedColumnName = "age_Codigo")})
    @ManyToOne
    private Agencia agencia;
    @OneToMany(mappedBy = "bolCrmJuridica")
    private List<Boletim> boletimList;
    @OneToMany(mappedBy = "bolCrmFisica")
    private List<Boletim> boletimList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cooCrm")
    private List<Boletim> boletimList2;

    public Cooperado() {
    }

    public Cooperado(String cooCrm) {
        this.cooCrm = cooCrm;
    }

    public Cooperado(String cooCrm, String cooLogin, String cooSenha, char cooImprime, char cooTipo, char cooLimite) {
        this.cooCrm = cooCrm;
        this.cooLogin = cooLogin;
        this.cooSenha = cooSenha;
        this.cooImprime = cooImprime;
        this.cooTipo = cooTipo;
        this.cooLimite = cooLimite;
    }

    public String getCooCrm() {
        return cooCrm;
    }

    public void setCooCrm(String cooCrm) {
        this.cooCrm = cooCrm;
    }

    public String getCooNome() {
        return cooNome;
    }

    public void setCooNome(String cooNome) {
        this.cooNome = cooNome;
    }

    public Date getCooNascimento() {
        return cooNascimento;
    }

    public void setCooNascimento(Date cooNascimento) {
        this.cooNascimento = cooNascimento;
    }

    public Date getCooAdmissao() {
        return cooAdmissao;
    }

    public void setCooAdmissao(Date cooAdmissao) {
        this.cooAdmissao = cooAdmissao;
    }

    public Date getCooDemissao() {
        return cooDemissao;
    }

    public void setCooDemissao(Date cooDemissao) {
        this.cooDemissao = cooDemissao;
    }

    public Date getCooFalecimento() {
        return cooFalecimento;
    }

    public void setCooFalecimento(Date cooFalecimento) {
        this.cooFalecimento = cooFalecimento;
    }

    public String getCooCpf() {
        return cooCpf;
    }

    public void setCooCpf(String cooCpf) {
        this.cooCpf = cooCpf;
    }

    public String getCooCpfDeposito() {
        return cooCpfDeposito;
    }

    public void setCooCpfDeposito(String cooCpfDeposito) {
        this.cooCpfDeposito = cooCpfDeposito;
    }

    public String getCooCnpjDeposito() {
        return cooCnpjDeposito;
    }

    public void setCooCnpjDeposito(String cooCnpjDeposito) {
        this.cooCnpjDeposito = cooCnpjDeposito;
    }

    public Character getCooSituacao() {
        return cooSituacao;
    }

    public void setCooSituacao(Character cooSituacao) {
        this.cooSituacao = cooSituacao;
    }

    public BigDecimal getCooTaxa() {
        return cooTaxa;
    }

    public void setCooTaxa(BigDecimal cooTaxa) {
        this.cooTaxa = cooTaxa;
    }

    public String getCooMatriculaCopan() {
        return cooMatriculaCopan;
    }

    public void setCooMatriculaCopan(String cooMatriculaCopan) {
        this.cooMatriculaCopan = cooMatriculaCopan;
    }

    public String getCooRegistroSpa() {
        return cooRegistroSpa;
    }

    public void setCooRegistroSpa(String cooRegistroSpa) {
        this.cooRegistroSpa = cooRegistroSpa;
    }

    public String getCooRegistroSba() {
        return cooRegistroSba;
    }

    public void setCooRegistroSba(String cooRegistroSba) {
        this.cooRegistroSba = cooRegistroSba;
    }

    public String getCooCorrespSpa() {
        return cooCorrespSpa;
    }

    public void setCooCorrespSpa(String cooCorrespSpa) {
        this.cooCorrespSpa = cooCorrespSpa;
    }

    public String getCooCorrespCopan() {
        return cooCorrespCopan;
    }

    public void setCooCorrespCopan(String cooCorrespCopan) {
        this.cooCorrespCopan = cooCorrespCopan;
    }

    public String getCooContaCorrente() {
        return cooContaCorrente;
    }

    public void setCooContaCorrente(String cooContaCorrente) {
        this.cooContaCorrente = cooContaCorrente;
    }

    public String getCooClainss() {
        return cooClainss;
    }

    public void setCooClainss(String cooClainss) {
        this.cooClainss = cooClainss;
    }

    public String getCooReginss() {
        return cooReginss;
    }

    public void setCooReginss(String cooReginss) {
        this.cooReginss = cooReginss;
    }

    public Character getCooRecinss() {
        return cooRecinss;
    }

    public void setCooRecinss(Character cooRecinss) {
        this.cooRecinss = cooRecinss;
    }

    public Character getCooAposentado() {
        return cooAposentado;
    }

    public void setCooAposentado(Character cooAposentado) {
        this.cooAposentado = cooAposentado;
    }

    public Character getCooProducao() {
        return cooProducao;
    }

    public void setCooProducao(Character cooProducao) {
        this.cooProducao = cooProducao;
    }

    public String getCooLogin() {
        return cooLogin;
    }

    public void setCooLogin(String cooLogin) {
        this.cooLogin = cooLogin;
    }

    public String getCooSenha() {
        return cooSenha;
    }

    public void setCooSenha(String cooSenha) {
        this.cooSenha = cooSenha;
    }

    public Date getCooAtualizacao() {
        return cooAtualizacao;
    }

    public void setCooAtualizacao(Date cooAtualizacao) {
        this.cooAtualizacao = cooAtualizacao;
    }

    public Character getCooFormaPagamento() {
        return cooFormaPagamento;
    }

    public void setCooFormaPagamento(Character cooFormaPagamento) {
        this.cooFormaPagamento = cooFormaPagamento;
    }

    public char getCooImprime() {
        return cooImprime;
    }

    public void setCooImprime(char cooImprime) {
        this.cooImprime = cooImprime;
    }

    public String getCooAtuLogin() {
        return cooAtuLogin;
    }

    public void setCooAtuLogin(String cooAtuLogin) {
        this.cooAtuLogin = cooAtuLogin;
    }

    public char getCooTipo() {
        return cooTipo;
    }

    public void setCooTipo(char cooTipo) {
        this.cooTipo = cooTipo;
    }

    public char getCooLimite() {
        return cooLimite;
    }

    public void setCooLimite(char cooLimite) {
        this.cooLimite = cooLimite;
    }

    @XmlTransient
    public List<Cooperado> getCooperadoList() {
        return cooperadoList;
    }

    public void setCooperadoList(List<Cooperado> cooperadoList) {
        this.cooperadoList = cooperadoList;
    }

    @XmlTransient
    public List<Cooperado> getCooperadoList1() {
        return cooperadoList1;
    }

    public void setCooperadoList1(List<Cooperado> cooperadoList1) {
        this.cooperadoList1 = cooperadoList1;
    }

    public Regiao getRegCodigo() {
        return regCodigo;
    }

    public void setRegCodigo(Regiao regCodigo) {
        this.regCodigo = regCodigo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @XmlTransient
    public List<Boletim> getBoletimList() {
        return boletimList;
    }

    public void setBoletimList(List<Boletim> boletimList) {
        this.boletimList = boletimList;
    }

    @XmlTransient
    public List<Boletim> getBoletimList1() {
        return boletimList1;
    }

    public void setBoletimList1(List<Boletim> boletimList1) {
        this.boletimList1 = boletimList1;
    }

    @XmlTransient
    public List<Boletim> getBoletimList2() {
        return boletimList2;
    }

    public void setBoletimList2(List<Boletim> boletimList2) {
        this.boletimList2 = boletimList2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cooCrm != null ? cooCrm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cooperado)) {
            return false;
        }
        Cooperado other = (Cooperado) object;
        if ((this.cooCrm == null && other.cooCrm != null) || (this.cooCrm != null && !this.cooCrm.equals(other.cooCrm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Cooperado[ cooCrm=" + cooCrm + " ]";
    }
    
}
