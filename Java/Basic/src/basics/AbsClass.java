package basics;


abstract class Calc{
	abstract float areaTr(float a, float b);
	abstract int areaSq(int a);
	abstract int areaRec(int a, int b);
	}

class CalClass extends Calc {

			int len, bd, side;
			float  base, ht;
			
			CalClass(int a, int b, float c, float d, int e){
				
				this.len = a;
				this.bd = b;
				this.base = c;
				this.ht = d;
				this.side = e;
			}
			
			float areaTr(float a, float b){a = ht; b = base; float res=(0.5f*(a*b)); return res;}
			
			int areaSq(int a){a = side; return a*a;}
		    
			int areaRec(int a, int b){a = len; b = bd; return a*b; }
}

public class AbsClass extends CalClass{
	
	AbsClass(int a, int b, float c, float d, int e){
		super(a,b,c,d,e);
		System.out.println(super.areaTr(d, c));
		System.out.println(super.areaSq(e));
		System.out.println(super.areaRec(b, a));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CalClass cl = new AbsClass(3,4,5,4,9);
		
	 }

}
