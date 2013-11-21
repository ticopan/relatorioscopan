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
public class LocalServicoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "loc_Codigo")
    private String locCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "ser_Codigo")
    private String serCodigo;

    public LocalServicoPK() {
    }

    public LocalServicoPK(String locCodigo, String serCodigo) {
        this.locCodigo = locCodigo;
        this.serCodigo = serCodigo;
    }

    public String getLocCodigo() {
        return locCodigo;
    }

    public void setLocCodigo(String locCodigo) {
        this.locCodigo = locCodigo;
    }

    public String getSerCodigo() {
        return serCodigo;
    }

    public void setSerCodigo(String serCodigo) {
        this.serCodigo = serCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locCodigo != null ? locCodigo.hashCode() : 0);
        hash += (serCodigo != null ? serCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocalServicoPK)) {
            return false;
        }
        LocalServicoPK other = (LocalServicoPK) object;
        if ((this.locCodigo == null && other.locCodigo != null) || (this.locCodigo != null && !this.locCodigo.equals(other.locCodigo))) {
            return false;
        }
        if ((this.serCodigo == null && other.serCodigo != null) || (this.serCodigo != null && !this.serCodigo.equals(other.serCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.LocalServicoPK[ locCodigo=" + locCodigo + ", serCodigo=" + serCodigo + " ]";
    }
    
}
