package lti;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class StoreData {  
  
    public static void main( String[] args )  
    {  
    	Configuration c=new Configuration();
    	c.configure("hibernate.cfg.xml");
    	SessionFactory sc=c.buildSessionFactory();
    	Session s= sc.openSession();
    	Transaction t=s.beginTransaction();
    	Employee e=new Employee();
    	e.setFirstName("Samy");
    	//e.setId(1);
    	e.setLastName("Patna");
    	s.persist(e);
    	t.commit();
    	s.close();
    	System.out.println("Hiber Hiber ooo Hiber Hiber");
    	
    	
    }  
}  