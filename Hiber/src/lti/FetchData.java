package lti;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class FetchData {  
  
    public static void main( String[] args )  
    {  
    	Configuration c=new Configuration();
    	c.configure("hibernate.cfg.xml");
    	SessionFactory sc=c.buildSessionFactory();
    	Session s= sc.openSession();
    	Transaction t=s.beginTransaction();
    	Object o = s.load(Employee.class, new Integer(2));//Integer value must be passed to make it serializable with primary key as this is the id of record we want to fetch
    	Employee ee = (Employee)o;
    	
    	System.out.println("First Name is "+ee.getFirstName());
    	System.out.println("Last Name is "+ee.getLastName());
    	
    	
    }  
}  