package basics;

public class Static1 {
		static int a = 0;
		int b=0;
		
		Static1(){
			a++;
			
			System.out.println(a);
		}
		
		
		 void n1(){
			System.out.println("This is Instance");
		}
		
		 
		 ///Highest priority, called before anything else
		static{
			System.out.println("This is static");
		}
		
		
		
		
		
		//only instance variables can be declared inside instance methods
		//Also dont use this keyword and super keyword inside static methods.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We didn't have to wait for any class object here
		
		Static1 s1 = new Static1();
		System.out.println(s1.b);
		Static1 s2 = new Static1();
		Static1 s3 = new Static1();
		Static1 s4 = new Static1();
  
		
		s1.n1();
		
	}

}
