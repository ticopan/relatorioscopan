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
@Table(name = "Convenio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Convenio.findAll", query = "SELECT c FROM Convenio c"),
    @NamedQuery(name = "Convenio.findByConCodigo", query = "SELECT c FROM Convenio c WHERE c.conCodigo = :conCodigo"),
    @NamedQuery(name = "Convenio.findByConNome", query = "SELECT c FROM Convenio c WHERE c.conNome = :conNome"),
    @NamedQuery(name = "Convenio.findByConNomeComplementar", query = "SELECT c FROM Convenio c WHERE c.conNomeComplementar = :conNomeComplementar"),
    @NamedQuery(name = "Convenio.findByConNomeAnestesix", query = "SELECT c FROM Convenio c WHERE c.conNomeAnestesix = :conNomeAnestesix"),
    @NamedQuery(name = "Convenio.findByConCgc", query = "SELECT c FROM Convenio c WHERE c.conCgc = :conCgc"),
    @NamedQuery(name = "Convenio.findByConInscricaoEstadual", query = "SELECT c FROM Convenio c WHERE c.conInscricaoEstadual = :conInscricaoEstadual"),
    @NamedQuery(name = "Convenio.findByConInscricaoMunicipal", query = "SELECT c FROM Convenio c WHERE c.conInscricaoMunicipal = :conInscricaoMunicipal"),
    @NamedQuery(name = "Convenio.findByConContrato", query = "SELECT c FROM Convenio c WHERE c.conContrato = :conContrato"),
    @NamedQuery(name = "Convenio.findByConDataContrato", query = "SELECT c FROM Convenio c WHERE c.conDataContrato = :conDataContrato"),
    @NamedQuery(name = "Convenio.findByConDataUltimoAditivo", query = "SELECT c FROM Convenio c WHERE c.conDataUltimoAditivo = :conDataUltimoAditivo"),
    @NamedQuery(name = "Convenio.findByConValidadeContrato", query = "SELECT c FROM Convenio c WHERE c.conValidadeContrato = :conValidadeContrato"),
    @NamedQuery(name = "Convenio.findByConContaCorrente", query = "SELECT c FROM Convenio c WHERE c.conContaCorrente = :conContaCorrente"),
    @NamedQuery(name = "Convenio.findByConDiasFaturamento", query = "SELECT c FROM Convenio c WHERE c.conDiasFaturamento = :conDiasFaturamento"),
    @NamedQuery(name = "Convenio.findByConDiasBoletim", query = "SELECT c FROM Convenio c WHERE c.conDiasBoletim = :conDiasBoletim"),
    @NamedQuery(name = "Convenio.findByConTxAdm", query = "SELECT c FROM Convenio c WHERE c.conTxAdm = :conTxAdm"),
    @NamedQuery(name = "Convenio.findByConTxInclusa", query = "SELECT c FROM Convenio c WHERE c.conTxInclusa = :conTxInclusa"),
    @NamedQuery(name = "Convenio.findByConRtImposto", query = "SELECT c FROM Convenio c WHERE c.conRtImposto = :conRtImposto"),
    @NamedQuery(name = "Convenio.findByConHoraUtilIni", query = "SELECT c FROM Convenio c WHERE c.conHoraUtilIni = :conHoraUtilIni"),
    @NamedQuery(name = "Convenio.findByConHoraUtilFim", query = "SELECT c FROM Convenio c WHERE c.conHoraUtilFim = :conHoraUtilFim"),
    @NamedQuery(name = "Convenio.findByConHoraSabIni", query = "SELECT c FROM Convenio c WHERE c.conHoraSabIni = :conHoraSabIni"),
    @NamedQuery(name = "Convenio.findByConHoraSabFim", query = "SELECT c FROM Convenio c WHERE c.conHoraSabFim = :conHoraSabFim"),
    @NamedQuery(name = "Convenio.findByConPercEme", query = "SELECT c FROM Convenio c WHERE c.conPercEme = :conPercEme"),
    @NamedQuery(name = "Convenio.findByConPercVid", query = "SELECT c FROM Convenio c WHERE c.conPercVid = :conPercVid"),
    @NamedQuery(name = "Convenio.findByConPercMvi", query = "SELECT c FROM Convenio c WHERE c.conPercMvi = :conPercMvi"),
    @NamedQuery(name = "Convenio.findByConPercBil", query = "SELECT c FROM Convenio c WHERE c.conPercBil = :conPercBil"),
    @NamedQuery(name = "Convenio.findByConPercOvi", query = "SELECT c FROM Convenio c WHERE c.conPercOvi = :conPercOvi"),
    @NamedQuery(name = "Convenio.findByConReferencia", query = "SELECT c FROM Convenio c WHERE c.conReferencia = :conReferencia"),
    @NamedQuery(name = "Convenio.findByConFrequencia", query = "SELECT c FROM Convenio c WHERE c.conFrequencia = :conFrequencia"),
    @NamedQuery(name = "Convenio.findByConPduCopan", query = "SELECT c FROM Convenio c WHERE c.conPduCopan = :conPduCopan"),
    @NamedQuery(name = "Convenio.findByConPduAnestesix", query = "SELECT c FROM Convenio c WHERE c.conPduAnestesix = :conPduAnestesix"),
    @NamedQuery(name = "Convenio.findByConProvisao", query = "SELECT c FROM Convenio c WHERE c.conProvisao = :conProvisao"),
    @NamedQuery(name = "Convenio.findByConAtualizacao", query = "SELECT c FROM Convenio c WHERE c.conAtualizacao = :conAtualizacao"),
    @NamedQuery(name = "Convenio.findByConSequencial", query = "SELECT c FROM Convenio c WHERE c.conSequencial = :conSequencial"),
    @NamedQuery(name = "Convenio.findByConTamMat", query = "SELECT c FROM Convenio c WHERE c.conTamMat = :conTamMat"),
    @NamedQuery(name = "Convenio.findByConTamGui", query = "SELECT c FROM Convenio c WHERE c.conTamGui = :conTamGui"),
    @NamedQuery(name = "Convenio.findByConTamIdf", query = "SELECT c FROM Convenio c WHERE c.conTamIdf = :conTamIdf"),
    @NamedQuery(name = "Convenio.findByConDvMat", query = "SELECT c FROM Convenio c WHERE c.conDvMat = :conDvMat"),
    @NamedQuery(name = "Convenio.findByConDvGuia", query = "SELECT c FROM Convenio c WHERE c.conDvGuia = :conDvGuia"),
    @NamedQuery(name = "Convenio.findByConRegAns", query = "SELECT c FROM Convenio c WHERE c.conRegAns = :conRegAns"),
    @NamedQuery(name = "Convenio.findByConRegCrm", query = "SELECT c FROM Convenio c WHERE c.conRegCrm = :conRegCrm"),
    @NamedQuery(name = "Convenio.findByConWeb", query = "SELECT c FROM Convenio c WHERE c.conWeb = :conWeb"),
    @NamedQuery(name = "Convenio.findByConWebUsuario", query = "SELECT c FROM Convenio c WHERE c.conWebUsuario = :conWebUsuario"),
    @NamedQuery(name = "Convenio.findByConWebSenha", query = "SELECT c FROM Convenio c WHERE c.conWebSenha = :conWebSenha"),
    @NamedQuery(name = "Convenio.findByConGuiaAnterior", query = "SELECT c FROM Convenio c WHERE c.conGuiaAnterior = :conGuiaAnterior"),
    @NamedQuery(name = "Convenio.findByConGuiaInicial", query = "SELECT c FROM Convenio c WHERE c.conGuiaInicial = :conGuiaInicial"),
    @NamedQuery(name = "Convenio.findByConGuiaFinal", query = "SELECT c FROM Convenio c WHERE c.conGuiaFinal = :conGuiaFinal"),
    @NamedQuery(name = "Convenio.findByConSituacao", query = "SELECT c FROM Convenio c WHERE c.conSituacao = :conSituacao"),
    @NamedQuery(name = "Convenio.findByConPercMul", query = "SELECT c FROM Convenio c WHERE c.conPercMul = :conPercMul"),
    @NamedQuery(name = "Convenio.findByConPercJur", query = "SELECT c FROM Convenio c WHERE c.conPercJur = :conPercJur"),
    @NamedQuery(name = "Convenio.findByConCodCopan", query = "SELECT c FROM Convenio c WHERE c.conCodCopan = :conCodCopan"),
    @NamedQuery(name = "Convenio.findByConProvisaoTipo", query = "SELECT c FROM Convenio c WHERE c.conProvisaoTipo = :conProvisaoTipo"),
    @NamedQuery(name = "Convenio.findByConCodCobranca", query = "SELECT c FROM Convenio c WHERE c.conCodCobranca = :conCodCobranca"),
    @NamedQuery(name = "Convenio.findByConAtuLogin", query = "SELECT c FROM Convenio c WHERE c.conAtuLogin = :conAtuLogin"),
    @NamedQuery(name = "Convenio.findByConExigeDocumento", query = "SELECT c FROM Convenio c WHERE c.conExigeDocumento = :conExigeDocumento"),
    @NamedQuery(name = "Convenio.findByConDocumentacao", query = "SELECT c FROM Convenio c WHERE c.conDocumentacao = :conDocumentacao"),
    @NamedQuery(name = "Convenio.findByConInformacao", query = "SELECT c FROM Convenio c WHERE c.conInformacao = :conInformacao"),
    @NamedQuery(name = "Convenio.findByConTipoCobranca", query = "SELECT c FROM Convenio c WHERE c.conTipoCobranca = :conTipoCobranca")})
public class Convenio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "con_Codigo")
    private String conCodigo;
    @Size(max = 15)
    @Column(name = "con_Nome")
    private String conNome;
    @Size(max = 120)
    @Column(name = "con_NomeComplementar")
    private String conNomeComplementar;
    @Size(max = 30)
    @Column(name = "con_NomeAnestesix")
    private String conNomeAnestesix;
    @Size(max = 18)
    @Column(name = "con_Cgc")
    private String conCgc;
    @Size(max = 12)
    @Column(name = "con_InscricaoEstadual")
    private String conInscricaoEstadual;
    @Size(max = 20)
    @Column(name = "con_InscricaoMunicipal")
    private String conInscricaoMunicipal;
    @Size(max = 6)
    @Column(name = "con_Contrato")
    private String conContrato;
    @Column(name = "con_DataContrato")
    @Temporal(TemporalType.TIMESTAMP)
    private Date conDataContrato;
    @Column(name = "con_DataUltimoAditivo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date conDataUltimoAditivo;
    @Column(name = "con_ValidadeContrato")
    @Temporal(TemporalType.TIMESTAMP)
    private Date conValidadeContrato;
    @Size(max = 15)
    @Column(name = "con_ContaCorrente")
    private String conContaCorrente;
    @Column(name = "con_DiasFaturamento")
    private Short conDiasFaturamento;
    @Column(name = "con_DiasBoletim")
    private Short conDiasBoletim;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "con_TxAdm")
    private BigDecimal conTxAdm;
    @Column(name = "con_TxInclusa")
    private Character conTxInclusa;
    @Column(name = "con_RtImposto")
    private Character conRtImposto;
    @Size(max = 5)
    @Column(name = "con_HoraUtilIni")
    private String conHoraUtilIni;
    @Size(max = 5)
    @Column(name = "con_HoraUtilFim")
    private String conHoraUtilFim;
    @Size(max = 5)
    @Column(name = "con_HoraSabIni")
    private String conHoraSabIni;
    @Size(max = 5)
    @Column(name = "con_HoraSabFim")
    private String conHoraSabFim;
    @Column(name = "con_PercEme")
    private BigDecimal conPercEme;
    @Column(name = "con_PercVid")
    private BigDecimal conPercVid;
    @Column(name = "con_PercMvi")
    private BigDecimal conPercMvi;
    @Column(name = "con_PercBil")
    private BigDecimal conPercBil;
    @Column(name = "con_PercOvi")
    private BigDecimal conPercOvi;
    @Column(name = "con_Referencia")
    private Character conReferencia;
    @Column(name = "con_Frequencia")
    private Character conFrequencia;
    @Column(name = "con_PduCopan")
    private Character conPduCopan;
    @Column(name = "con_PduAnestesix")
    private Character conPduAnestesix;
    @Column(name = "con_Provisao")
    private Character conProvisao;
    @Column(name = "con_Atualizacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date conAtualizacao;
    @Size(max = 10)
    @Column(name = "con_Sequencial")
    private String conSequencial;
    @Size(max = 30)
    @Column(name = "con_TamMat")
    private String conTamMat;
    @Size(max = 30)
    @Column(name = "con_TamGui")
    private String conTamGui;
    @Size(max = 30)
    @Column(name = "con_TamIdf")
    private String conTamIdf;
    @Size(max = 2)
    @Column(name = "con_DvMat")
    private String conDvMat;
    @Size(max = 2)
    @Column(name = "con_DvGuia")
    private String conDvGuia;
    @Size(max = 7)
    @Column(name = "con_RegAns")
    private String conRegAns;
    @Size(max = 5)
    @Column(name = "con_RegCrm")
    private String conRegCrm;
    @Size(max = 80)
    @Column(name = "con_Web")
    private String conWeb;
    @Size(max = 40)
    @Column(name = "con_WebUsuario")
    private String conWebUsuario;
    @Size(max = 10)
    @Column(name = "con_WebSenha")
    private String conWebSenha;
    @Size(max = 15)
    @Column(name = "con_GuiaAnterior")
    private String conGuiaAnterior;
    @Size(max = 15)
    @Column(name = "con_GuiaInicial")
    private String conGuiaInicial;
    @Size(max = 15)
    @Column(name = "con_GuiaFinal")
    private String conGuiaFinal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "con_Situacao")
    private char conSituacao;
    @Column(name = "con_PercMul")
    private BigDecimal conPercMul;
    @Column(name = "con_PercJur")
    private BigDecimal conPercJur;
    @Size(max = 10)
    @Column(name = "con_CodCopan")
    private String conCodCopan;
    @Column(name = "con_ProvisaoTipo")
    private Character conProvisaoTipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "con_CodCobranca")
    private char conCodCobranca;
    @Size(max = 10)
    @Column(name = "con_AtuLogin")
    private String conAtuLogin;
    @Column(name = "con_ExigeDocumento")
    private Character conExigeDocumento;
    @Size(max = 120)
    @Column(name = "con_Documentacao")
    private String conDocumentacao;
    @Size(max = 250)
    @Column(name = "con_Informacao")
    private String conInformacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "con_TipoCobranca")
    private char conTipoCobranca;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "convenio")
    private List<Plano> planoList;
    @JoinColumn(name = "tab_Codigo", referencedColumnName = "tab_Codigo", insertable=false, updatable=false)
    @ManyToOne
    private Tabela tabCodigo;
    @JoinColumn(name = "ptc_Codigo", referencedColumnName = "ptc_Codigo")
    @ManyToOne
    private Protocolo ptcCodigo;
    @JoinColumns({
        @JoinColumn(name = "bco_Codigo", referencedColumnName = "bco_Codigo", insertable=false, updatable=false),
        @JoinColumn(name = "age_Codigo", referencedColumnName = "age_Codigo", insertable=false, updatable=false)})
    @ManyToOne
    private Agencia agencia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conCodigo")
    private List<Cobranca> cobrancaList;

    public Convenio() {
    }

    public Convenio(String conCodigo) {
        this.conCodigo = conCodigo;
    }

    public Convenio(String conCodigo, char conSituacao, char conCodCobranca, char conTipoCobranca) {
        this.conCodigo = conCodigo;
        this.conSituacao = conSituacao;
        this.conCodCobranca = conCodCobranca;
        this.conTipoCobranca = conTipoCobranca;
    }

    public String getConCodigo() {
        return conCodigo;
    }

    public void setConCodigo(String conCodigo) {
        this.conCodigo = conCodigo;
    }

    public String getConNome() {
        return conNome;
    }

    public void setConNome(String conNome) {
        this.conNome = conNome;
    }

    public String getConNomeComplementar() {
        return conNomeComplementar;
    }

    public void setConNomeComplementar(String conNomeComplementar) {
        this.conNomeComplementar = conNomeComplementar;
    }

    public String getConNomeAnestesix() {
        return conNomeAnestesix;
    }

    public void setConNomeAnestesix(String conNomeAnestesix) {
        this.conNomeAnestesix = conNomeAnestesix;
    }

    public String getConCgc() {
        return conCgc;
    }

    public void setConCgc(String conCgc) {
        this.conCgc = conCgc;
    }

    public String getConInscricaoEstadual() {
        return conInscricaoEstadual;
    }

    public void setConInscricaoEstadual(String conInscricaoEstadual) {
        this.conInscricaoEstadual = conInscricaoEstadual;
    }

    public String getConInscricaoMunicipal() {
        return conInscricaoMunicipal;
    }

    public void setConInscricaoMunicipal(String conInscricaoMunicipal) {
        this.conInscricaoMunicipal = conInscricaoMunicipal;
    }

    public String getConContrato() {
        return conContrato;
    }

    public void setConContrato(String conContrato) {
        this.conContrato = conContrato;
    }

    public Date getConDataContrato() {
        return conDataContrato;
    }

    public void setConDataContrato(Date conDataContrato) {
        this.conDataContrato = conDataContrato;
    }

    public Date getConDataUltimoAditivo() {
        return conDataUltimoAditivo;
    }

    public void setConDataUltimoAditivo(Date conDataUltimoAditivo) {
        this.conDataUltimoAditivo = conDataUltimoAditivo;
    }

    public Date getConValidadeContrato() {
        return conValidadeContrato;
    }

    public void setConValidadeContrato(Date conValidadeContrato) {
        this.conValidadeContrato = conValidadeContrato;
    }

    public String getConContaCorrente() {
        return conContaCorrente;
    }

    public void setConContaCorrente(String conContaCorrente) {
        this.conContaCorrente = conContaCorrente;
    }

    public Short getConDiasFaturamento() {
        return conDiasFaturamento;
    }

    public void setConDiasFaturamento(Short conDiasFaturamento) {
        this.conDiasFaturamento = conDiasFaturamento;
    }

    public Short getConDiasBoletim() {
        return conDiasBoletim;
    }

    public void setConDiasBoletim(Short conDiasBoletim) {
        this.conDiasBoletim = conDiasBoletim;
    }

    public BigDecimal getConTxAdm() {
        return conTxAdm;
    }

    public void setConTxAdm(BigDecimal conTxAdm) {
        this.conTxAdm = conTxAdm;
    }

    public Character getConTxInclusa() {
        return conTxInclusa;
    }

    public void setConTxInclusa(Character conTxInclusa) {
        this.conTxInclusa = conTxInclusa;
    }

    public Character getConRtImposto() {
        return conRtImposto;
    }

    public void setConRtImposto(Character conRtImposto) {
        this.conRtImposto = conRtImposto;
    }

    public String getConHoraUtilIni() {
        return conHoraUtilIni;
    }

    public void setConHoraUtilIni(String conHoraUtilIni) {
        this.conHoraUtilIni = conHoraUtilIni;
    }

    public String getConHoraUtilFim() {
        return conHoraUtilFim;
    }

    public void setConHoraUtilFim(String conHoraUtilFim) {
        this.conHoraUtilFim = conHoraUtilFim;
    }

    public String getConHoraSabIni() {
        return conHoraSabIni;
    }

    public void setConHoraSabIni(String conHoraSabIni) {
        this.conHoraSabIni = conHoraSabIni;
    }

    public String getConHoraSabFim() {
        return conHoraSabFim;
    }

    public void setConHoraSabFim(String conHoraSabFim) {
        this.conHoraSabFim = conHoraSabFim;
    }

    public BigDecimal getConPercEme() {
        return conPercEme;
    }

    public void setConPercEme(BigDecimal conPercEme) {
        this.conPercEme = conPercEme;
    }

    public BigDecimal getConPercVid() {
        return conPercVid;
    }

    public void setConPercVid(BigDecimal conPercVid) {
        this.conPercVid = conPercVid;
    }

    public BigDecimal getConPercMvi() {
        return conPercMvi;
    }

    public void setConPercMvi(BigDecimal conPercMvi) {
        this.conPercMvi = conPercMvi;
    }

    public BigDecimal getConPercBil() {
        return conPercBil;
    }

    public void setConPercBil(BigDecimal conPercBil) {
        this.conPercBil = conPercBil;
    }

    public BigDecimal getConPercOvi() {
        return conPercOvi;
    }

    public void setConPercOvi(BigDecimal conPercOvi) {
        this.conPercOvi = conPercOvi;
    }

    public Character getConReferencia() {
        return conReferencia;
    }

    public void setConReferencia(Character conReferencia) {
        this.conReferencia = conReferencia;
    }

    public Character getConFrequencia() {
        return conFrequencia;
    }

    public void setConFrequencia(Character conFrequencia) {
        this.conFrequencia = conFrequencia;
    }

    public Character getConPduCopan() {
        return conPduCopan;
    }

    public void setConPduCopan(Character conPduCopan) {
        this.conPduCopan = conPduCopan;
    }

    public Character getConPduAnestesix() {
        return conPduAnestesix;
    }

    public void setConPduAnestesix(Character conPduAnestesix) {
        this.conPduAnestesix = conPduAnestesix;
    }

    public Character getConProvisao() {
        return conProvisao;
    }

    public void setConProvisao(Character conProvisao) {
        this.conProvisao = conProvisao;
    }

    public Date getConAtualizacao() {
        return conAtualizacao;
    }

    public void setConAtualizacao(Date conAtualizacao) {
        this.conAtualizacao = conAtualizacao;
    }

    public String getConSequencial() {
        return conSequencial;
    }

    public void setConSequencial(String conSequencial) {
        this.conSequencial = conSequencial;
    }

    public String getConTamMat() {
        return conTamMat;
    }

    public void setConTamMat(String conTamMat) {
        this.conTamMat = conTamMat;
    }

    public String getConTamGui() {
        return conTamGui;
    }

    public void setConTamGui(String conTamGui) {
        this.conTamGui = conTamGui;
    }

    public String getConTamIdf() {
        return conTamIdf;
    }

    public void setConTamIdf(String conTamIdf) {
        this.conTamIdf = conTamIdf;
    }

    public String getConDvMat() {
        return conDvMat;
    }

    public void setConDvMat(String conDvMat) {
        this.conDvMat = conDvMat;
    }

    public String getConDvGuia() {
        return conDvGuia;
    }

    public void setConDvGuia(String conDvGuia) {
        this.conDvGuia = conDvGuia;
    }

    public String getConRegAns() {
        return conRegAns;
    }

    public void setConRegAns(String conRegAns) {
        this.conRegAns = conRegAns;
    }

    public String getConRegCrm() {
        return conRegCrm;
    }

    public void setConRegCrm(String conRegCrm) {
        this.conRegCrm = conRegCrm;
    }

    public String getConWeb() {
        return conWeb;
    }

    public void setConWeb(String conWeb) {
        this.conWeb = conWeb;
    }

    public String getConWebUsuario() {
        return conWebUsuario;
    }

    public void setConWebUsuario(String conWebUsuario) {
        this.conWebUsuario = conWebUsuario;
    }

    public String getConWebSenha() {
        return conWebSenha;
    }

    public void setConWebSenha(String conWebSenha) {
        this.conWebSenha = conWebSenha;
    }

    public String getConGuiaAnterior() {
        return conGuiaAnterior;
    }

    public void setConGuiaAnterior(String conGuiaAnterior) {
        this.conGuiaAnterior = conGuiaAnterior;
    }

    public String getConGuiaInicial() {
        return conGuiaInicial;
    }

    public void setConGuiaInicial(String conGuiaInicial) {
        this.conGuiaInicial = conGuiaInicial;
    }

    public String getConGuiaFinal() {
        return conGuiaFinal;
    }

    public void setConGuiaFinal(String conGuiaFinal) {
        this.conGuiaFinal = conGuiaFinal;
    }

    public char getConSituacao() {
        return conSituacao;
    }

    public void setConSituacao(char conSituacao) {
        this.conSituacao = conSituacao;
    }

    public BigDecimal getConPercMul() {
        return conPercMul;
    }

    public void setConPercMul(BigDecimal conPercMul) {
        this.conPercMul = conPercMul;
    }

    public BigDecimal getConPercJur() {
        return conPercJur;
    }

    public void setConPercJur(BigDecimal conPercJur) {
        this.conPercJur = conPercJur;
    }

    public String getConCodCopan() {
        return conCodCopan;
    }

    public void setConCodCopan(String conCodCopan) {
        this.conCodCopan = conCodCopan;
    }

    public Character getConProvisaoTipo() {
        return conProvisaoTipo;
    }

    public void setConProvisaoTipo(Character conProvisaoTipo) {
        this.conProvisaoTipo = conProvisaoTipo;
    }

    public char getConCodCobranca() {
        return conCodCobranca;
    }

    public void setConCodCobranca(char conCodCobranca) {
        this.conCodCobranca = conCodCobranca;
    }

    public String getConAtuLogin() {
        return conAtuLogin;
    }

    public void setConAtuLogin(String conAtuLogin) {
        this.conAtuLogin = conAtuLogin;
    }

    public Character getConExigeDocumento() {
        return conExigeDocumento;
    }

    public void setConExigeDocumento(Character conExigeDocumento) {
        this.conExigeDocumento = conExigeDocumento;
    }

    public String getConDocumentacao() {
        return conDocumentacao;
    }

    public void setConDocumentacao(String conDocumentacao) {
        this.conDocumentacao = conDocumentacao;
    }

    public String getConInformacao() {
        return conInformacao;
    }

    public void setConInformacao(String conInformacao) {
        this.conInformacao = conInformacao;
    }

    public char getConTipoCobranca() {
        return conTipoCobranca;
    }

    public void setConTipoCobranca(char conTipoCobranca) {
        this.conTipoCobranca = conTipoCobranca;
    }

    @XmlTransient
    public List<Plano> getPlanoList() {
        return planoList;
    }

    public void setPlanoList(List<Plano> planoList) {
        this.planoList = planoList;
    }

    public Tabela getTabCodigo() {
        return tabCodigo;
    }

    public void setTabCodigo(Tabela tabCodigo) {
        this.tabCodigo = tabCodigo;
    }

    public Protocolo getPtcCodigo() {
        return ptcCodigo;
    }

    public void setPtcCodigo(Protocolo ptcCodigo) {
        this.ptcCodigo = ptcCodigo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @XmlTransient
    public List<Cobranca> getCobrancaList() {
        return cobrancaList;
    }

    public void setCobrancaList(List<Cobranca> cobrancaList) {
        this.cobrancaList = cobrancaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conCodigo != null ? conCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Convenio)) {
            return false;
        }
        Convenio other = (Convenio) object;
        if ((this.conCodigo == null && other.conCodigo != null) || (this.conCodigo != null && !this.conCodigo.equals(other.conCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Convenio[ conCodigo=" + conCodigo + " ]";
    }
    
}
