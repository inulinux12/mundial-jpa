/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frontera;

import DAO.LaminaJpaController;
import entity.Lamina;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author USUARIO
 */
public class Demo {
    public static void main(String args[]){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("Mundial-JPAPU");
        LaminaJpaController laminaDAO = new LaminaJpaController(emf);
        for(int i = 0;i<150;i++){
            Lamina lamina = new Lamina();
            lamina.setNumber(i);
            lamina.setIsAlready(false);
            laminaDAO.create(lamina);
        } 
    }
}
