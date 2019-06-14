package basics;

class InheroEx{
	int id;
	int a;
	InheroEx(int id){
		this.id=id;
		System.out.println("InheroEx");
		System.out.println(id);
	}
	
	
	void method(){
		System.out.println("This is a method of super class");
	}
}



public class SuperEx extends InheroEx{
	
	SuperEx(int id){
		super(id);
		super.a=10;
		super.method();
		System.out.println(super.a);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperEx sup= new SuperEx(12);

	}

}
