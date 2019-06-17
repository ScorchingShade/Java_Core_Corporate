
import java.util.Scanner;

public class ToThrow {

    void throwing (){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age=in.nextInt();

       if(age < 18){
           //creating a zabardasti ka exception using condition and throw
           throw new ArithmeticException("Sorry mate");
       }

    }

    public static void main(String a[]){

        ToThrow ob=new ToThrow();
        ob.throwing();
        //The code below is unreachable due to an excpetion in above
        System.out.println("hi");

    }

}
