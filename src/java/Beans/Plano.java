/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kleysson
 */
@Entity
@Table(name = "Plano")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plano.findAll", query = "SELECT p FROM Plano p"),
    @NamedQuery(name = "Plano.findByConCodigo", query = "SELECT p FROM Plano p WHERE p.planoPK.conCodigo = :conCodigo"),
    @NamedQuery(name = "Plano.findByPlaCodigo", query = "SELECT p FROM Plano p WHERE p.planoPK.plaCodigo = :plaCodigo"),
    @NamedQuery(name = "Plano.findByPlaDescricao", query = "SELECT p FROM Plano p WHERE p.plaDescricao = :plaDescricao"),
    @NamedQuery(name = "Plano.findByPlaAbreviatura", query = "SELECT p FROM Plano p WHERE p.plaAbreviatura = :plaAbreviatura"),
    @NamedQuery(name = "Plano.findByPlaFatorBase", query = "SELECT p FROM Plano p WHERE p.plaFatorBase = :plaFatorBase")})
public class Plano implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlanoPK planoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "pla_Descricao")
    private String plaDescricao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "pla_Abreviatura")
    private String plaAbreviatura;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pla_FatorBase")
    private BigDecimal plaFatorBase;
    @JoinColumn(name = "con_Codigo", referencedColumnName = "con_Codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Convenio convenio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plano")
    private List<Boletim> boletimList;

    public Plano() {
    }

    public Plano(PlanoPK planoPK) {
        this.planoPK = planoPK;
    }

    public Plano(PlanoPK planoPK, String plaDescricao, String plaAbreviatura) {
        this.planoPK = planoPK;
        this.plaDescricao = plaDescricao;
        this.plaAbreviatura = plaAbreviatura;
    }

    public Plano(String conCodigo, String plaCodigo) {
        this.planoPK = new PlanoPK(conCodigo, plaCodigo);
    }

    public PlanoPK getPlanoPK() {
        return planoPK;
    }

    public void setPlanoPK(PlanoPK planoPK) {
        this.planoPK = planoPK;
    }

    public String getPlaDescricao() {
        return plaDescricao;
    }

    public void setPlaDescricao(String plaDescricao) {
        this.plaDescricao = plaDescricao;
    }

    public String getPlaAbreviatura() {
        return plaAbreviatura;
    }

    public void setPlaAbreviatura(String plaAbreviatura) {
        this.plaAbreviatura = plaAbreviatura;
    }

    public BigDecimal getPlaFatorBase() {
        return plaFatorBase;
    }

    public void setPlaFatorBase(BigDecimal plaFatorBase) {
        this.plaFatorBase = plaFatorBase;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
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
        hash += (planoPK != null ? planoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plano)) {
            return false;
        }
        Plano other = (Plano) object;
        if ((this.planoPK == null && other.planoPK != null) || (this.planoPK != null && !this.planoPK.equals(other.planoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Plano[ planoPK=" + planoPK + " ]";
    }
    
}
