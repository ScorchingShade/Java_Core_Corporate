public class WrapperClasses  {

    public static void main(String[] args) {
        Integer i= new Integer("65");

        System.out.println(i+90);

        int i1 = i.intValue(); //auto unboxing
        //int i1 = i; //unboxing
        System.out.println(i1);

        System.out.println(Integer.toBinaryString(16));
        System.out.println(Integer.toHexString(55));
    }
}
