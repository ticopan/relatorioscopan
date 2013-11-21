/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "Agencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agencia.findAll", query = "SELECT a FROM Agencia a"),
    @NamedQuery(name = "Agencia.findByBcoCodigo", query = "SELECT a FROM Agencia a WHERE a.agenciaPK.bcoCodigo = :bcoCodigo"),
    @NamedQuery(name = "Agencia.findByAgeCodigo", query = "SELECT a FROM Agencia a WHERE a.agenciaPK.ageCodigo = :ageCodigo"),
    @NamedQuery(name = "Agencia.findByAgeNome", query = "SELECT a FROM Agencia a WHERE a.ageNome = :ageNome"),
    @NamedQuery(name = "Agencia.findByAgeCamara", query = "SELECT a FROM Agencia a WHERE a.ageCamara = :ageCamara")})
public class Agencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgenciaPK agenciaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "age_Nome")
    private String ageNome;
    @Size(max = 3)
    @Column(name = "age_Camara")
    private String ageCamara;
    @JoinColumn(name = "bco_Codigo", referencedColumnName = "bco_Codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Banco banco;
    @OneToMany(mappedBy = "agencia")
    private List<Cooperado> cooperadoList;
    @OneToMany(mappedBy = "agencia")
    private List<Convenio> convenioList;

    public Agencia() {
    }

    public Agencia(AgenciaPK agenciaPK) {
        this.agenciaPK = agenciaPK;
    }

    public Agencia(AgenciaPK agenciaPK, String ageNome) {
        this.agenciaPK = agenciaPK;
        this.ageNome = ageNome;
    }

    public Agencia(String bcoCodigo, String ageCodigo) {
        this.agenciaPK = new AgenciaPK(bcoCodigo, ageCodigo);
    }

    public AgenciaPK getAgenciaPK() {
        return agenciaPK;
    }

    public void setAgenciaPK(AgenciaPK agenciaPK) {
        this.agenciaPK = agenciaPK;
    }

    public String getAgeNome() {
        return ageNome;
    }

    public void setAgeNome(String ageNome) {
        this.ageNome = ageNome;
    }

    public String getAgeCamara() {
        return ageCamara;
    }

    public void setAgeCamara(String ageCamara) {
        this.ageCamara = ageCamara;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @XmlTransient
    public List<Cooperado> getCooperadoList() {
        return cooperadoList;
    }

    public void setCooperadoList(List<Cooperado> cooperadoList) {
        this.cooperadoList = cooperadoList;
    }

    @XmlTransient
    public List<Convenio> getConvenioList() {
        return convenioList;
    }

    public void setConvenioList(List<Convenio> convenioList) {
        this.convenioList = convenioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agenciaPK != null ? agenciaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agencia)) {
            return false;
        }
        Agencia other = (Agencia) object;
        if ((this.agenciaPK == null && other.agenciaPK != null) || (this.agenciaPK != null && !this.agenciaPK.equals(other.agenciaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Agencia[ agenciaPK=" + agenciaPK + " ]";
    }
    
}
