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
public class PlanoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "con_Codigo")
    private String conCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "pla_Codigo")
    private String plaCodigo;

    public PlanoPK() {
    }

    public PlanoPK(String conCodigo, String plaCodigo) {
        this.conCodigo = conCodigo;
        this.plaCodigo = plaCodigo;
    }

    public String getConCodigo() {
        return conCodigo;
    }

    public void setConCodigo(String conCodigo) {
        this.conCodigo = conCodigo;
    }

    public String getPlaCodigo() {
        return plaCodigo;
    }

    public void setPlaCodigo(String plaCodigo) {
        this.plaCodigo = plaCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conCodigo != null ? conCodigo.hashCode() : 0);
        hash += (plaCodigo != null ? plaCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanoPK)) {
            return false;
        }
        PlanoPK other = (PlanoPK) object;
        if ((this.conCodigo == null && other.conCodigo != null) || (this.conCodigo != null && !this.conCodigo.equals(other.conCodigo))) {
            return false;
        }
        if ((this.plaCodigo == null && other.plaCodigo != null) || (this.plaCodigo != null && !this.plaCodigo.equals(other.plaCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.PlanoPK[ conCodigo=" + conCodigo + ", plaCodigo=" + plaCodigo + " ]";
    }
    
}
