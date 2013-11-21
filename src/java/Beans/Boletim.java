package Beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@RequestScoped
@Table(name="Boletim")
public class Boletim implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "bol_Tabela")
    private String bolTabela;
    @Size(max = 10)
    @Column(name = "bol_Identificador")
    private String bolIdentificador;
    @Size(max = 30)
    @Column(name = "bol_Matricula")
    private String bolMatricula;
    @Size(max = 30)
    @Column(name = "bol_Gih")
    private String bolGih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bol_DataInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bolDataInicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "bol_HoraInicio")
    private String bolHoraInicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "bol_HoraFim")
    private String bolHoraFim;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bol_Emergencia")
    private char bolEmergencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bol_Auxiliar")
    private char bolAuxiliar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bol_Feriado")
    private char bolFeriado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bol_NColaboracao")
    private char bolNColaboracao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bol_Solicitacao")
    private char bolSolicitacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "bol_BkValorCh")
    private BigDecimal bolBkValorCh;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bol_BkFatorBase")
    private BigDecimal bolBkFatorBase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bol_Situacao")
    private char bolSituacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bol_Err")
    private int bolErr;
    @Column(name = "bol_Cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bolCadastro;
    @Size(max = 10)
    @Column(name = "bol_Login")
    private String bolLogin;
    @Column(name = "bol_Condicao")
    private Character bolCondicao;
    @Column(name = "bol_Documentacao")
    private Character bolDocumentacao;
    @Column(name = "bol_TipoGih")
    private Character bolTipoGih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bol_Retorno")
    private char bolRetorno;
    @JoinColumns({
        @JoinColumn(name = "con_Codigo", referencedColumnName = "con_Codigo", insertable=false, updatable=false),
        @JoinColumn(name = "pla_Codigo", referencedColumnName = "pla_Codigo", insertable=false, updatable=false)})
    @ManyToOne(optional = false)
    private Plano plano;
    @JoinColumn(name = "pag_Codigo", referencedColumnName = "pag_Codigo", insertable=false, updatable=false)
    @ManyToOne
    private Pagamento pagCodigo;
    @JoinColumn(name = "lot_Codigo", referencedColumnName = "lot_Codigo", insertable=false, updatable=false)
    @ManyToOne(optional = false)
    private Lote lotCodigo;
    @JoinColumns({
        @JoinColumn(name = "loc_Codigo", referencedColumnName = "loc_Codigo", insertable=false, updatable=false),
        @JoinColumn(name = "ser_Codigo", referencedColumnName = "ser_Codigo", insertable=false, updatable=false)})
    @ManyToOne(optional = false)
    private LocalServico localServico;
    @JoinColumn(name = "hos_Codigo", referencedColumnName = "hos_Codigo", insertable=false, updatable=false)
    @ManyToOne(optional = false)
    private Hospital hosCodigo;
    @JoinColumn(name = "bol_CrmJuridica", referencedColumnName = "coo_Crm", insertable=false, updatable=false)
    @ManyToOne
    private Cooperado bolCrmJuridica;
    @JoinColumn(name = "bol_CrmFisica", referencedColumnName = "coo_Crm", insertable=false, updatable=false)
    @ManyToOne
    private Cooperado bolCrmFisica;
    @JoinColumn(name = "coo_Crm", referencedColumnName = "coo_Crm", insertable=false, updatable=false)
    @ManyToOne(optional = false)
    private Cooperado cooCrm;
    @JoinColumn(name = "cob_Codigo", referencedColumnName = "cob_Codigo", insertable=false, updatable=false)
    @ManyToOne
    private Cobranca cobCodigo;
    
    public Boletim(){}
    
    @Id
    @Column(name="bol_Codigo", nullable=false)
    private String bol_Codigo;
    @Column(name="con_Codigo", nullable=false)
    private String con_Codigo;
    @Column(name="bol_Paciente", nullable=false)
    private String bol_Paciente;

    public String getBol_Codigo() {
        return bol_Codigo;
    }
    public void setBol_Codigo(String bol_Codigo) {
        this.bol_Codigo = bol_Codigo;
    }

        public String getCon_Codigo() {
        return con_Codigo;
    }
    public void setCon_Codigo(String con_Codigo) {
        this.con_Codigo = con_Codigo;
    }

        public String getBol_Paciente() {
        return bol_Paciente;
    }
    public void setBol_Paciente(String bol_Paciente) {
        this.bol_Paciente = bol_Paciente;
    }

    public String getBolTabela() {
        return bolTabela;
    }

    public void setBolTabela(String bolTabela) {
        this.bolTabela = bolTabela;
    }

    public String getBolIdentificador() {
        return bolIdentificador;
    }

    public void setBolIdentificador(String bolIdentificador) {
        this.bolIdentificador = bolIdentificador;
    }

    public String getBolMatricula() {
        return bolMatricula;
    }

    public void setBolMatricula(String bolMatricula) {
        this.bolMatricula = bolMatricula;
    }

    public String getBolGih() {
        return bolGih;
    }

    public void setBolGih(String bolGih) {
        this.bolGih = bolGih;
    }

    public Date getBolDataInicio() {
        return bolDataInicio;
    }

    public void setBolDataInicio(Date bolDataInicio) {
        this.bolDataInicio = bolDataInicio;
    }

    public String getBolHoraInicio() {
        return bolHoraInicio;
    }

    public void setBolHoraInicio(String bolHoraInicio) {
        this.bolHoraInicio = bolHoraInicio;
    }

    public String getBolHoraFim() {
        return bolHoraFim;
    }

    public void setBolHoraFim(String bolHoraFim) {
        this.bolHoraFim = bolHoraFim;
    }

    public char getBolEmergencia() {
        return bolEmergencia;
    }

    public void setBolEmergencia(char bolEmergencia) {
        this.bolEmergencia = bolEmergencia;
    }

    public char getBolAuxiliar() {
        return bolAuxiliar;
    }

    public void setBolAuxiliar(char bolAuxiliar) {
        this.bolAuxiliar = bolAuxiliar;
    }

    public char getBolFeriado() {
        return bolFeriado;
    }

    public void setBolFeriado(char bolFeriado) {
        this.bolFeriado = bolFeriado;
    }

    public char getBolNColaboracao() {
        return bolNColaboracao;
    }

    public void setBolNColaboracao(char bolNColaboracao) {
        this.bolNColaboracao = bolNColaboracao;
    }

    public char getBolSolicitacao() {
        return bolSolicitacao;
    }

    public void setBolSolicitacao(char bolSolicitacao) {
        this.bolSolicitacao = bolSolicitacao;
    }

    public BigDecimal getBolBkValorCh() {
        return bolBkValorCh;
    }

    public void setBolBkValorCh(BigDecimal bolBkValorCh) {
        this.bolBkValorCh = bolBkValorCh;
    }

    public BigDecimal getBolBkFatorBase() {
        return bolBkFatorBase;
    }

    public void setBolBkFatorBase(BigDecimal bolBkFatorBase) {
        this.bolBkFatorBase = bolBkFatorBase;
    }

    public char getBolSituacao() {
        return bolSituacao;
    }

    public void setBolSituacao(char bolSituacao) {
        this.bolSituacao = bolSituacao;
    }

    public int getBolErr() {
        return bolErr;
    }

    public void setBolErr(int bolErr) {
        this.bolErr = bolErr;
    }

    public Date getBolCadastro() {
        return bolCadastro;
    }

    public void setBolCadastro(Date bolCadastro) {
        this.bolCadastro = bolCadastro;
    }

    public String getBolLogin() {
        return bolLogin;
    }

    public void setBolLogin(String bolLogin) {
        this.bolLogin = bolLogin;
    }

    public Character getBolCondicao() {
        return bolCondicao;
    }

    public void setBolCondicao(Character bolCondicao) {
        this.bolCondicao = bolCondicao;
    }

    public Character getBolDocumentacao() {
        return bolDocumentacao;
    }

    public void setBolDocumentacao(Character bolDocumentacao) {
        this.bolDocumentacao = bolDocumentacao;
    }

    public Character getBolTipoGih() {
        return bolTipoGih;
    }

    public void setBolTipoGih(Character bolTipoGih) {
        this.bolTipoGih = bolTipoGih;
    }

    public char getBolRetorno() {
        return bolRetorno;
    }

    public void setBolRetorno(char bolRetorno) {
        this.bolRetorno = bolRetorno;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Pagamento getPagCodigo() {
        return pagCodigo;
    }

    public void setPagCodigo(Pagamento pagCodigo) {
        this.pagCodigo = pagCodigo;
    }

    public Lote getLotCodigo() {
        return lotCodigo;
    }

    public void setLotCodigo(Lote lotCodigo) {
        this.lotCodigo = lotCodigo;
    }

    public LocalServico getLocalServico() {
        return localServico;
    }

    public void setLocalServico(LocalServico localServico) {
        this.localServico = localServico;
    }

    public Hospital getHosCodigo() {
        return hosCodigo;
    }

    public void setHosCodigo(Hospital hosCodigo) {
        this.hosCodigo = hosCodigo;
    }

    public Cooperado getBolCrmJuridica() {
        return bolCrmJuridica;
    }

    public void setBolCrmJuridica(Cooperado bolCrmJuridica) {
        this.bolCrmJuridica = bolCrmJuridica;
    }

    public Cooperado getBolCrmFisica() {
        return bolCrmFisica;
    }

    public void setBolCrmFisica(Cooperado bolCrmFisica) {
        this.bolCrmFisica = bolCrmFisica;
    }

    public Cooperado getCooCrm() {
        return cooCrm;
    }

    public void setCooCrm(Cooperado cooCrm) {
        this.cooCrm = cooCrm;
    }

    public Cobranca getCobCodigo() {
        return cobCodigo;
    }

    public void setCobCodigo(Cobranca cobCodigo) {
        this.cobCodigo = cobCodigo;
    }
    
}
