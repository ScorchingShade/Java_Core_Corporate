import java.util.HashSet;
import java.util.Iterator;

class Product{

    int id;
    int quantity;
    String name;

    public Product(int id, int quantity, String name) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
    }

    @Override
    public String toString(){

        return id+"\t"+name+"\t"+quantity;
    }

    @Override
    public boolean equals (Object o){
        Product p = (Product)o;
        if((id==p.id)&&(name.equals(p.name))){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        int result=0;
        result=result*10+id;
        result=result*name.hashCode();
        return result;
    }

}


public class Hashing {


    public static void main(String[] args) {


        HashSet<Product> hs = new HashSet<Product>();
        Product p = new Product(101,200, "AC");
        Product p1 = new Product(101,200, "AC");
        Product p2 = new Product(103,203, "TV");
        Product p3 = new Product(104,200, "MICROWAVE");

        hs.add(p);
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);

        Iterator<Product> i = hs.iterator();

        while(i.hasNext()){

            Product pp = i.next();
            System.out.println(pp);
        }

    }
}
