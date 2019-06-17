class RunningT  implements Runnable {

    public void displayName() throws ClassNotFoundException{
        Class s = Class.forName("RunningT");
        System.out.println(s.getName());
    }




    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("t1");

        }
    }

}


class RunningT1 implements Runnable{

    public void displayName() throws ClassNotFoundException{
        Class s = Class.forName("RunningT1");
        System.out.println(s.getName());
    }


    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("t2");

        }
    }
}

class RunningT2 extends Thread{

    public void displayName() throws ClassNotFoundException{
        Class s = Class.forName("RunningT2");
        System.out.println(s.getName());
    }

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("t3");

        }
    }

}
public class Threads {

    public static void main(String args[]) throws  ClassNotFoundException{

        //Used to get Class name, Throws ClassNotFoundException
        Class s = Class.forName("Threads");
        System.out.println(s.getName());

        for (int i = 0; i < 5; i++) {
            System.out.println("main");
        }

        RunningT r = new RunningT();
        RunningT1 r1 = new RunningT1();
        RunningT2 t2 = new RunningT2();

       r.displayName();
        r1.displayName();
        t2.displayName();


        Thread t = new Thread(r);
        Thread t1 = new Thread(r1);



        try {
            t.join(1000);
            t1.join(10000);
            t2.join(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.start();
        t1.start();
        t2.start();
    }

}
