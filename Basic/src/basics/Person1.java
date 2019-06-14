package basics;
import java.util.*;

public class Person1 {
	
	 static  int number;
	 static  int id;
	 static String name;
	
	
	 //Constructor chaining
	 Person1(){
		 System.out.println("Default Constructor");
	 }
	 
	 Person1(int id){
		 this();
		 this.id=id;
	 }
	 
	 Person1(int id, int number, String name){
	
		this(id);//This must be the first call inside the constructor otherwise the compile time error will occur and used for current class
		this.number = number;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p = new Person1(101,2000,"Rohan");
		System.out.println("Id : "+id+", Number: "+number+", Name: "+name);
		
	}

}
