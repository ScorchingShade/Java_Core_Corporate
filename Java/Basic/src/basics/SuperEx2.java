package basics;

class Test{
	
	int a, b;
	
	Test(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void display(){
		System.out.println(a+" "+b);
	}
	
}

public class SuperEx2 extends Test {

		int c;
		
		SuperEx2(int a, int b,int c){
			super(a,b);
			this.c=c;
			}
		
		void display(){
			super.display();
			System.out.println(c);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperEx2 s = new SuperEx2(0,1,2);
		s.display();

	}

}
