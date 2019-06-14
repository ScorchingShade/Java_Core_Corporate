package basics;

class Parent{
	void display(){
		System.out.println("This is parent.");
	}
	
	
	static void show(){
		System.out.println("This is parent.");
	}
	
}

public class Overriding extends Parent{

	void display(){
		int a = 10;
		System.out.println("This is overriding and a = "+a);
	}
	
	
	 static void show(){
		//when using static keyword, reference doesn't matter.
		System.out.println("This is method hiding.");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		Overriding o = new Overriding();
		
		//Since we have given reference of child class, the method of child class will be called:NOT PARENT CLASS
		Parent p1 = new Overriding();
		//p1.display();
		//p.display();
		//o.display();
		
		p.show();
		p1.show();
		o.show();
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(o);
	}

}
