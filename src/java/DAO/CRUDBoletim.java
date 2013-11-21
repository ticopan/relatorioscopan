package DAO;

import Beans.Boletim;
import java.util.List;
import org.hibernate.Session;

public class CRUDBoletim {
    
    public List<Boletim> retornaBoletins() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List lista = session.createQuery("From Boletim where bol_Cadastro >= '2013-11-21' ").list();
        session.getTransaction().commit();
        return lista;
    }
    
    
}
