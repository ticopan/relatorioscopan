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
@Table(name = "Regiao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Regiao.findAll", query = "SELECT r FROM Regiao r"),
    @NamedQuery(name = "Regiao.findByRegCodigo", query = "SELECT r FROM Regiao r WHERE r.regCodigo = :regCodigo"),
    @NamedQuery(name = "Regiao.findByRegNome", query = "SELECT r FROM Regiao r WHERE r.regNome = :regNome")})
public class Regiao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "reg_Codigo")
    private String regCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "reg_Nome")
    private String regNome;
    @OneToMany(mappedBy = "regCodigo")
    private List<Cooperado> cooperadoList;

    public Regiao() {
    }

    public Regiao(String regCodigo) {
        this.regCodigo = regCodigo;
    }

    public Regiao(String regCodigo, String regNome) {
        this.regCodigo = regCodigo;
        this.regNome = regNome;
    }

    public String getRegCodigo() {
        return regCodigo;
    }

    public void setRegCodigo(String regCodigo) {
        this.regCodigo = regCodigo;
    }

    public String getRegNome() {
        return regNome;
    }

    public void setRegNome(String regNome) {
        this.regNome = regNome;
    }

    @XmlTransient
    public List<Cooperado> getCooperadoList() {
        return cooperadoList;
    }

    public void setCooperadoList(List<Cooperado> cooperadoList) {
        this.cooperadoList = cooperadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regCodigo != null ? regCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regiao)) {
            return false;
        }
        Regiao other = (Regiao) object;
        if ((this.regCodigo == null && other.regCodigo != null) || (this.regCodigo != null && !this.regCodigo.equals(other.regCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Regiao[ regCodigo=" + regCodigo + " ]";
    }
    
}
