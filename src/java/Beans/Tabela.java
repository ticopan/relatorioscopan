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
@Table(name = "Tabela")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tabela.findAll", query = "SELECT t FROM Tabela t"),
    @NamedQuery(name = "Tabela.findByTabCodigo", query = "SELECT t FROM Tabela t WHERE t.tabCodigo = :tabCodigo"),
    @NamedQuery(name = "Tabela.findByTabNome", query = "SELECT t FROM Tabela t WHERE t.tabNome = :tabNome"),
    @NamedQuery(name = "Tabela.findByTabMascara", query = "SELECT t FROM Tabela t WHERE t.tabMascara = :tabMascara"),
    @NamedQuery(name = "Tabela.findByTabTipo", query = "SELECT t FROM Tabela t WHERE t.tabTipo = :tabTipo")})
public class Tabela implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "tab_Codigo")
    private String tabCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "tab_Nome")
    private String tabNome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "tab_Mascara")
    private String tabMascara;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tab_Tipo")
    private char tabTipo;
    @OneToMany(mappedBy = "tabCodigo")
    private List<Convenio> convenioList;

    public Tabela() {
    }

    public Tabela(String tabCodigo) {
        this.tabCodigo = tabCodigo;
    }

    public Tabela(String tabCodigo, String tabNome, String tabMascara, char tabTipo) {
        this.tabCodigo = tabCodigo;
        this.tabNome = tabNome;
        this.tabMascara = tabMascara;
        this.tabTipo = tabTipo;
    }

    public String getTabCodigo() {
        return tabCodigo;
    }

    public void setTabCodigo(String tabCodigo) {
        this.tabCodigo = tabCodigo;
    }

    public String getTabNome() {
        return tabNome;
    }

    public void setTabNome(String tabNome) {
        this.tabNome = tabNome;
    }

    public String getTabMascara() {
        return tabMascara;
    }

    public void setTabMascara(String tabMascara) {
        this.tabMascara = tabMascara;
    }

    public char getTabTipo() {
        return tabTipo;
    }

    public void setTabTipo(char tabTipo) {
        this.tabTipo = tabTipo;
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
        hash += (tabCodigo != null ? tabCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabela)) {
            return false;
        }
        Tabela other = (Tabela) object;
        if ((this.tabCodigo == null && other.tabCodigo != null) || (this.tabCodigo != null && !this.tabCodigo.equals(other.tabCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Tabela[ tabCodigo=" + tabCodigo + " ]";
    }
    
}
