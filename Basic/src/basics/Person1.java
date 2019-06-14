package basics;
import java.util.*;

public class Person1 {
	
	 static  int number;
	 static  int id;
	 static String name;
	
	 Person1(int id, int number, String name){
		this.id = id;
		this.number = number;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p = new Person1(201,2000,"Rohan");
		System.out.println("Id : "+id+", Number: "+number+", Name: "+name);
		
	}

}
