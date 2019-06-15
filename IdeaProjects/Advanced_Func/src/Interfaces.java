interface a{
    void m(); int k=2;
}

interface b{
    void m(); int k=6;
}


interface c{
    void as(); void bas();
}

abstract class Gussa implements c{

    @Override
    public void as(){
        System.out.println("Jai Ho");
    }
}
public class  Interfaces extends Gussa implements a,b,c  {

    @Override
    public void m(){
        System.out.println("hi");
    }

    @Override
    public void bas(){
        System.out.println("bht gussa");
    }

    public static void main(String m[]){
        new Interfaces().m();

        new Interfaces().bas();
        System.out.println(a.k);
        System.out.println(b.k);
    }
}
