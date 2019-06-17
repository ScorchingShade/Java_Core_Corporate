import java.util.ArrayList;
import java.util.Scanner;

public class Collectionss {

    //While to check y/n
    //Del,add, disp
    Scanner in = new Scanner(System.in);
    String cont="y";


    ArrayList adds(ArrayList ar) {

        System.out.println("Per Session only 5 additions allowed.\nEnter your numbers:\n");
        int added_number;
        for(int i =0; i <5; i++){
            System.out.println(i+" :-> ");
            added_number=in.nextInt();
            String temp = Integer.toString(added_number);
            if(temp!=null){
                ar.add(added_number);
            }
            else {
                System.out.println(i+" additions done");
            }

        }



        return ar;
    }

    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>();

        Collectionss c = new Collectionss();

        //greeting
        System.out.println("Welcome to ArrayList program\nFeatures included :\n1: Add function\n2: Delete function\n3: Display function");


        while (c.cont.equals("y") || c.cont.equals("yes") || c.cont.equals("Yes") || c.cont.equals("YES") || c.cont.equals("Y")) {

            System.out.println("Do you want to continue???\n");



            c.cont = c.in.nextLine();

            if (c.cont.equals("y") || c.cont.equals("yes") ||c.cont.equals("Yes") || c.cont.equals("YES") || c.cont.equals("Y")) {
                c.cont="y";
            } else if (c.cont.equals("n") || c.cont.equals("no") || c.cont.equals("No") || c.cont.equals("NO") || c.cont.equals("N")) {
                c.cont="n";
            }



            System.out.println("Choose function number:\n1. Add\n2. Delete\n3. Display");



            int choice;
            choice = c.in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose Add\n\n");
                    c.adds(ar);
                    break;
                case 2:
                    System.out.println("You chose Delete\n\n");
                    break;
                case 3:
                    System.out.println("You chose Display\n\n");
                    break;
                default:
                    System.out.println("Sorry, no such option available.\n");
                    break;

            }

        }
    }
}
