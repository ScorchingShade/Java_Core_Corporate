package basics;

public class LocalNested {

	
			private int data=20;
			void m(){
				
				class Local{
					
					void m1(){
					
						System.out.println(data);
					}
				}
				
				Local l = new Local(); //instantiation of inner class must be inside the method of outer class
				l.m1();
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				LocalNested ln = new LocalNested();
				ln.m();
	}

}
