import java.util.*;

import static java.util.Collections.reverse;
import static java.util.Collections.sort;

public class CollFrame {

    //Vectors
    //ArrayLists
    //Linked List

    //Treeset
    //Hashset
    //LinkedHashset

    //Priority Queue
    //ArrayDeque




    void Vectors(){

        System.out.println("\t\tThese are Vectors");
        Vector<String> v= new Vector<String>();

        v.add("Mufasa");
        v.add("Simba");
        v.add("Timon");
        v.add("Pumba");

        String s="";

        Iterator<String> i = v.iterator();

        int a=1;
        while (i.hasNext()){
            s=i.next();

            if (s.equals("Pumba")){
                System.out.println(s+" Found!! Removing "+s);
                i.remove();

            }

        }
        Iterator<String> i1 = v.iterator();
        while (i1.hasNext()){
            System.out.printf("Name %d is\t\t %s\n",a,i1.next());

            a++;
        }
        System.out.println();
    }

    void ArrayLists(){
        System.out.println("\t\t\tThese are Arraylists");

        Scanner s = new Scanner(System.in);

        //This is a specialized arraylist, generic can contain any data
        ArrayList<Double> ar = new ArrayList<Double>();

        ar.add(200000000d);
        ar.add(1,null); // We cannot leave any index empty
        ar.add(0000000000000000000.0000000000000000000000000000000111111111111111222222222d);
        ar.add(6.21321213129392139219392193912492194219391293129d);


        ar.set(2, 3000000000000d);
        ar.remove(1);// if we write directly any number that is index, if we write ar.remove(new Double(values)); this deletes on value

        Iterator<Double> itr = ar.iterator();
        int a=1;

        while (itr.hasNext()){
            System.out.printf("Number %d is\t\t %.5f\n",a,itr.next());

            a++;
        }

        double sum = 0;

        for(Object o:ar){

            sum = sum + (double)o;
        }


        //Sort and reverse array list
        System.out.println("\nSorting and reversing the list");
        sort(ar);
        reverse(ar);
        Iterator<Double> itr1 = ar.iterator();
        int x=1;

        while (itr1.hasNext()){
            System.out.printf("Number %d is\t\t %.5f\n",x,itr1.next());

            x++;
        }


        System.out.println("\n\nSum coming up\n"+sum+"\n\n");
    }

    void LinkedLists(){
        System.out.println("\t\tThese are LinkedLists");
        LinkedList<String> link= new LinkedList<String>();

        link.add("RAJU");
        link.add("SHAAM");
        link.add("BABU BHAIYA");
        link.add("ANURADHA");
        link.add("NAANJI BHAI");

        Iterator<String> i = link.iterator();

        int a = 1;

        while (i.hasNext()){
            System.out.printf("Name %d: \t\t %s\n" , a,i.next());
            a++;
        }

        LinkedList link_copy=new LinkedList();

        link_copy.addAll(link);
        i=link_copy.iterator();

        while (i.hasNext()){
            System.out.printf("Name %d: \t\t %s\n" , a,i.next());
            a++;
        }

        System.out.println();
    }

    void Stacks(){
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(10*2);
        st.push(10*3);
        st.push(10*4);
        st.push(10*5);
        st.push(10*6);

        Iterator<Integer> itr = st.iterator();
        int a=1;
        System.out.println("Table of 10");
        while(itr.hasNext()){
            System.out.printf("10 * %d\t=\t%d\n",a,itr.next());
            a++;
        }

        System.out.println();
    }

    void ArrayDeques(){

        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

        ad.add(10);
        ad.offer(55);
        ad.offer(30);
        ad.add(13);

        System.out.println(ad);
        System.out.println("Top element is: "+ad.peek());
        System.out.println(ad);

        ad.poll();
        System.out.println(ad);

        Iterator<Integer> i = ad.descendingIterator();
        while(i.hasNext()){

            System.out.println(i.next());
        }

        ArrayList<Integer> ar = new ArrayList<Integer>(ad);
        Collections.sort(ar);

        System.out.println(ar);
    }

    void Hashset(){

        HashSet<Integer> h = new HashSet<Integer>();
        h.add(2);
        h.add(2);
        h.add(null);
        h.add(12);

        System.out.println(h);
    }


    public static void main(String[] args) {
        CollFrame cf= new CollFrame();

        //LISTS
        cf.Vectors();
        cf.ArrayLists();
        cf.LinkedLists();
        cf.Stacks();
        cf.ArrayDeques();

        //Sets

        //Queue


        //Hash
        cf.Hashset();

    }


}
