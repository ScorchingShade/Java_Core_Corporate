public class StringEx {

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

        System.out.println("HelloWorld".substring(1,4));
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

        StringBuffer s6= new StringBuffer("Arjun");
        StringBuffer s7= new StringBuffer("Arjun");

        System.out.println(s6==s7);
    }

}
