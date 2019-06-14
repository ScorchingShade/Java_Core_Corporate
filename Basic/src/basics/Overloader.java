package basics;

public class Overloader {
	
		int Area(int side){
			return side*side;
		}
		
		int Area(int length, int breadth){
			return length*breadth;
		}
		
     public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 Overloader o = new Overloader();
    	 System.out.println(o.Area(10));
    	 System.out.println(o.Area(10,12));
    	 
    	 //Typecasting
    	 int a=2;
    	 float b;
    	 //We typecasted a to b like this
    	 b = (int)(a);
    	 
    	 System.out.printf("%.9f + %d ",b, a);
    	 
	}

}
