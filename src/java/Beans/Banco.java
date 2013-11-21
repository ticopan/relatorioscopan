/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kleysson
 */
@Entity
@Table(name = "Banco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Banco.findAll", query = "SELECT b FROM Banco b"),
    @NamedQuery(name = "Banco.findByBcoCodigo", query = "SELECT b FROM Banco b WHERE b.bcoCodigo = :bcoCodigo"),
    @NamedQuery(name = "Banco.findByBcoNome", query = "SELECT b FROM Banco b WHERE b.bcoNome = :bcoNome")})
public class Banco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "bco_Codigo")
    private String bcoCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "bco_Nome")
    private String bcoNome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "banco")
    private List<Agencia> agenciaList;

    public Banco() {
    }

    public Banco(String bcoCodigo) {
        this.bcoCodigo = bcoCodigo;
    }

    public Banco(String bcoCodigo, String bcoNome) {
        this.bcoCodigo = bcoCodigo;
        this.bcoNome = bcoNome;
    }

    public String getBcoCodigo() {
        return bcoCodigo;
    }

    public void setBcoCodigo(String bcoCodigo) {
        this.bcoCodigo = bcoCodigo;
    }

    public String getBcoNome() {
        return bcoNome;
    }

    public void setBcoNome(String bcoNome) {
        this.bcoNome = bcoNome;
    }

    @XmlTransient
    public List<Agencia> getAgenciaList() {
        return agenciaList;
    }

    public void setAgenciaList(List<Agencia> agenciaList) {
        this.agenciaList = agenciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bcoCodigo != null ? bcoCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banco)) {
            return false;
        }
        Banco other = (Banco) object;
        if ((this.bcoCodigo == null && other.bcoCodigo != null) || (this.bcoCodigo != null && !this.bcoCodigo.equals(other.bcoCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Banco[ bcoCodigo=" + bcoCodigo + " ]";
    }
    
}
