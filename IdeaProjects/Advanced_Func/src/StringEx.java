import java.util.Scanner;

public class StringEx {

    String a;
    public StringEx(String i) {

        this.a = i;
    }


    //to string overriding
    @Override
    public String toString(){
        return a;
    }

    public static void main(String args[]){

        String s1 = "anil";
        String s2 = new String("anil");
        String s3 = "vishwas";
        String s4 = "vishwan";

        System.out.println(s1.contentEquals(s2));
        System.out.println(s1==s2); //compares reference
        System.out.println(s1.equals(s2)); //compares value
        System.out.println(s3.compareTo(s4));  //comapres how many different ASCII values are present

        System.out.println("Mumbai".charAt(3));  //index starts from 0.


        //Try Catch Finally
        try {
            System.out.println("HelloWorld".substring(1,4));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            System.out.println("YASSSSSSSSS FINALLYYYYYY OOOOOOOOOOOOOHHHHHHHHHHHH YEAHHHHHHHHHHHH");
        }


        System.out.println(s1.substring(2));
        System.out.println("                     Today is Saturday                    ".trim()); //to remove additonal spaces before and after string

        System.out.println("Today is Saturday".indexOf("day", 5));
        System.out.println("Today is Saturday".lastIndexOf("day", 0)); // Last index means before the specified index, where does the string occur.
        System.out.println();

        char[] c={'T','h','i','s',' ','a',' ','d','e','m','o',' ','o','f',' ','g','e','t','c','h','a','r','s'};

        char[] buf = new char[10];
        String s5 = new String(c);
        s5.getChars(7,11,buf,4);
        System.out.println(buf);

        StringBuffer s6= new StringBuffer("Hi");

        s6.setLength(5);

        s6.setCharAt(1,'e');
        s6.setCharAt(2,'l');
        s6.setCharAt(3,'l');
        s6.setCharAt(4,'o');


        System.out.println(s6);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter String: ");
        String pal = s.nextLine();

        StringBuffer s8 = new StringBuffer(pal);
        //This is object class approach, faster than string approach and un-synchronised
        if(s8.toString().toLowerCase().equals(s8.reverse().toString().toLowerCase())){
            System.out.println("Equal");
        }

        else{
            System.out.println("false");

        }

        StringEx se = new StringEx("7ghjk");
        System.out.println(se.toString());
    }

}
