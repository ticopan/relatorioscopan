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
@Table(name = "Lote")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lote.findAll", query = "SELECT l FROM Lote l"),
    @NamedQuery(name = "Lote.findByLotCodigo", query = "SELECT l FROM Lote l WHERE l.lotCodigo = :lotCodigo"),
    @NamedQuery(name = "Lote.findByLotSituacao", query = "SELECT l FROM Lote l WHERE l.lotSituacao = :lotSituacao")})
public class Lote implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "lot_Codigo")
    private String lotCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lot_Situacao")
    private char lotSituacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lotCodigo")
    private List<Boletim> boletimList;

    public Lote() {
    }

    public Lote(String lotCodigo) {
        this.lotCodigo = lotCodigo;
    }

    public Lote(String lotCodigo, char lotSituacao) {
        this.lotCodigo = lotCodigo;
        this.lotSituacao = lotSituacao;
    }

    public String getLotCodigo() {
        return lotCodigo;
    }

    public void setLotCodigo(String lotCodigo) {
        this.lotCodigo = lotCodigo;
    }

    public char getLotSituacao() {
        return lotSituacao;
    }

    public void setLotSituacao(char lotSituacao) {
        this.lotSituacao = lotSituacao;
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
        hash += (lotCodigo != null ? lotCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lote)) {
            return false;
        }
        Lote other = (Lote) object;
        if ((this.lotCodigo == null && other.lotCodigo != null) || (this.lotCodigo != null && !this.lotCodigo.equals(other.lotCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Lote[ lotCodigo=" + lotCodigo + " ]";
    }
    
}
