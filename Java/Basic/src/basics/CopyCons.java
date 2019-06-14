package basics;

interface Anony{
	
	public void display();
	
}

public class CopyCons implements Anony {

		int a;
		
		CopyCons(int a){
			this.a = a;
			}
		
		CopyCons(CopyCons c){
			this.a = c.a;
		}
		
		public void display(){
			System.out.println("This is Normal Class. ");
		}
		
		public static void main(String args[]){
			
			CopyCons c1 = new CopyCons(6);
			CopyCons cy = new CopyCons(c1);
			
			cy.display();
			
		    final int number = cy.a;
			
			Anony n = new Anony(){
				
			public void display(){
					System.out.println("This is Anonymous Inner Class. "+number);
				}
			}; n.display();
		}
}
