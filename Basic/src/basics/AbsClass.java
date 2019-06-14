package basics;


abstract class Calc{
	abstract void length(int a);
}

public class AbsClass extends Calc {

	void length(int a){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbsClass ab=new AbsClass();
		ab.length(10);
	}

}
