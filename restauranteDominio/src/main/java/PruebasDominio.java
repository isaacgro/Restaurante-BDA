
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import moduloIngredientesEntidades.Ingrediente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Abraham Coronel Bringas
 */
public class PruebasDominio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Ingrediente ingrediente = new Ingrediente("tortillas harina", 10, "piezas");
        em.persist(ingrediente);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
       
    }
    
}
