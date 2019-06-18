import java.util.ArrayList;
import java.util.Iterator;

class Person {

    int id, age;
    String name;

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return id+"\t"+name+"\t"+age;
    }
}

public class ClassCollectionEx {

    public static void main(String[] args) {

        ArrayList<Person> a = new ArrayList<Person>();

        Person p = new Person(101,23,"Harry");
        Person p1 = new Person(102,21,"Ron");
        Person p2 = new Person(103,22,"Hermoine");
        a.add(p);
        a.add(p1);
        a.add(p2);

        Iterator<Person> itr=a.iterator();

        int x=1;
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
