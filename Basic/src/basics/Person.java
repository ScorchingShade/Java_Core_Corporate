package basics;
import java.util.Scanner;

public class Person {

	 static  int number;
	 static  int id;
	 static String name;
	 
	 void display(int a, int b, String c){
		 
		 System.out.println("Id : "+b+",Number: "+a+",Name: "+c);
	 }
	 
	   
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		name = in.nextLine();
		number = in.nextInt();
		id = in.nextInt();
		
		Person p = new Person();
		
		
		p.display(id,number,name);
	}  
	
	
}
