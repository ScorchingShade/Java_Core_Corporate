package test;

import java.util.Scanner;

interface crisis{
	void display(String word);
	void clear();
}



public class main implements crisis{
	
	public void display(String word){
		System.out.println(word);
	}
	
	public void clear(){
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	
	public static void main(String args[]){
		main obj =new main();
		Scanner in= new Scanner(System.in);
		
		
		System.out.println("YO");
		
		
		System.out.println("What do you want to display");
		String words= in.nextLine();
		
		
		obj.display(words);
		System.out.println("Do you want to clear?");
		String choice = in.nextLine();
		
		if( choice.equals('y')||choice.equals("Yes")||choice.equals("YES")){
			obj.clear();	
		}
		else{
			System.out.println("Ok relax!!");
		}
		
		
	}
}
