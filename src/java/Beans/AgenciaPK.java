/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author kleysson
 */
@Embeddable
public class AgenciaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "bco_Codigo")
    private String bcoCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "age_Codigo")
    private String ageCodigo;

    public AgenciaPK() {
    }

    public AgenciaPK(String bcoCodigo, String ageCodigo) {
        this.bcoCodigo = bcoCodigo;
        this.ageCodigo = ageCodigo;
    }

    public String getBcoCodigo() {
        return bcoCodigo;
    }

    public void setBcoCodigo(String bcoCodigo) {
        this.bcoCodigo = bcoCodigo;
    }

    public String getAgeCodigo() {
        return ageCodigo;
    }

    public void setAgeCodigo(String ageCodigo) {
        this.ageCodigo = ageCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bcoCodigo != null ? bcoCodigo.hashCode() : 0);
        hash += (ageCodigo != null ? ageCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgenciaPK)) {
            return false;
        }
        AgenciaPK other = (AgenciaPK) object;
        if ((this.bcoCodigo == null && other.bcoCodigo != null) || (this.bcoCodigo != null && !this.bcoCodigo.equals(other.bcoCodigo))) {
            return false;
        }
        if ((this.ageCodigo == null && other.ageCodigo != null) || (this.ageCodigo != null && !this.ageCodigo.equals(other.ageCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.AgenciaPK[ bcoCodigo=" + bcoCodigo + ", ageCodigo=" + ageCodigo + " ]";
    }
    
}
