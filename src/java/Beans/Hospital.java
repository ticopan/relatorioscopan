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
@Table(name = "Hospital")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hospital.findAll", query = "SELECT h FROM Hospital h"),
    @NamedQuery(name = "Hospital.findByHosCodigo", query = "SELECT h FROM Hospital h WHERE h.hosCodigo = :hosCodigo"),
    @NamedQuery(name = "Hospital.findByHosNome", query = "SELECT h FROM Hospital h WHERE h.hosNome = :hosNome")})
public class Hospital implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "hos_Codigo")
    private String hosCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "hos_Nome")
    private String hosNome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hosCodigo")
    private List<Boletim> boletimList;

    public Hospital() {
    }

    public Hospital(String hosCodigo) {
        this.hosCodigo = hosCodigo;
    }

    public Hospital(String hosCodigo, String hosNome) {
        this.hosCodigo = hosCodigo;
        this.hosNome = hosNome;
    }

    public String getHosCodigo() {
        return hosCodigo;
    }

    public void setHosCodigo(String hosCodigo) {
        this.hosCodigo = hosCodigo;
    }

    public String getHosNome() {
        return hosNome;
    }

    public void setHosNome(String hosNome) {
        this.hosNome = hosNome;
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
        hash += (hosCodigo != null ? hosCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hospital)) {
            return false;
        }
        Hospital other = (Hospital) object;
        if ((this.hosCodigo == null && other.hosCodigo != null) || (this.hosCodigo != null && !this.hosCodigo.equals(other.hosCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Hospital[ hosCodigo=" + hosCodigo + " ]";
    }
    
}
