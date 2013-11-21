package controle;

import Beans.Boletim;
import DAO.CRUDBoletim;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@ManagedBean
@RequestScoped
@Named(value = "boletimControler")

public class BoletimControler {

    public BoletimControler() {
    }
    
    private List<Boletim> listaBoletim;
    Boletim boletim = new Boletim();

    public List<Boletim> getListaBoletim() {
        if (this.listaBoletim == null){
            listaBoletim = new CRUDBoletim().retornaBoletins();
        }
        return listaBoletim;
    }

    public void setListaBoletim(List<Boletim> listaBoletim) {
        this.listaBoletim = listaBoletim;
    }

    public Boletim getBoletim() {
        return boletim;
    }

    public void setBoletim(Boletim boletim) {
        this.boletim = boletim;
    }
    
    public List<Boletim> LocalizarBoletins(){
         
        listaBoletim = new CRUDBoletim().retornaBoletins();
        return listaBoletim;
        
    }
}
