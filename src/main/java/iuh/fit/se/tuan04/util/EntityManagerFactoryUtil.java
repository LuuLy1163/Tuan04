package iuh.fit.se.tuan04.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryUtil {
    private static final EntityManagerFactory emf;

    static {
        try{
            emf = Persistence.createEntityManagerFactory("quanly-tintuc");
        } catch (Throwable ex){
            System.err.println("EntityManagerFactory creation failed: " + ex.getMessage());
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    public static void close(){
        if(emf.isOpen()) emf.close();
    }
}
 