package test;

import model.UserDetails;
import model.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import resources.HibernateUtil;

/**
 * @author tombisnis@yahoo.com
 */
public class TestOneToMany {
    public static void main(String[]args){
        UserDetails userDetails = new UserDetails();
        userDetails.setUserName("Tom");
        
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVihicleName("Tom Vehicle 1");
        
        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVihicleName("Tom Vehicle 2");
        
        userDetails.getVehicle().add(vehicle1);
        userDetails.getVehicle().add(vehicle2);
        
        vehicle1.setUserDetails(userDetails);
        vehicle2.setUserDetails(userDetails);       

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(userDetails);
        session.save(vehicle1);
        session.save(vehicle2);
        session.getTransaction().commit();
    }
}