package basics;

class Alag{
	
	private int g = 10;
	
	class Inn{
		void fun(){
			System.out.println(g);
		}
	}
	
	
	void bahar(){
		Inn i = new Inn();
		
		i.fun();
	}
	
}


public class Nested{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alag in=new Alag();	
		in.bahar();
	}

}


