package basics;


class Emp{
	
		void m(){
			
			System.out.println("I am employee.");
		}
}

public class SingleInherit extends Emp{
	
		int bonus = 10000;
		
		void m1(){
			
			System.out.println("I am an Engineer.");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleInherit e = new SingleInherit();
		e.m1();
		e.m();

	}

}
