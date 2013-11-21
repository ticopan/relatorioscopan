/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "Protocolo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Protocolo.findAll", query = "SELECT p FROM Protocolo p"),
    @NamedQuery(name = "Protocolo.findByPtcCodigo", query = "SELECT p FROM Protocolo p WHERE p.ptcCodigo = :ptcCodigo"),
    @NamedQuery(name = "Protocolo.findByPtcDescricao", query = "SELECT p FROM Protocolo p WHERE p.ptcDescricao = :ptcDescricao")})
public class Protocolo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ptc_Codigo")
    private String ptcCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ptc_Descricao")
    private String ptcDescricao;
    @OneToMany(mappedBy = "ptcCodigo")
    private List<Convenio> convenioList;

    public Protocolo() {
    }

    public Protocolo(String ptcCodigo) {
        this.ptcCodigo = ptcCodigo;
    }

    public Protocolo(String ptcCodigo, String ptcDescricao) {
        this.ptcCodigo = ptcCodigo;
        this.ptcDescricao = ptcDescricao;
    }

    public String getPtcCodigo() {
        return ptcCodigo;
    }

    public void setPtcCodigo(String ptcCodigo) {
        this.ptcCodigo = ptcCodigo;
    }

    public String getPtcDescricao() {
        return ptcDescricao;
    }

    public void setPtcDescricao(String ptcDescricao) {
        this.ptcDescricao = ptcDescricao;
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
        hash += (ptcCodigo != null ? ptcCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Protocolo)) {
            return false;
        }
        Protocolo other = (Protocolo) object;
        if ((this.ptcCodigo == null && other.ptcCodigo != null) || (this.ptcCodigo != null && !this.ptcCodigo.equals(other.ptcCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Protocolo[ ptcCodigo=" + ptcCodigo + " ]";
    }
    
}
