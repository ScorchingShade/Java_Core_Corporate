import static java.lang.Thread.sleep;

class Customer{
    int number=10000;

    public synchronized void withdraw(int a){
        System.out.println("Withdraw amount: ");

        if(a>number){
            System.out.println("Can't Overdraw, insufficient balance.");

            try {
                System.out.println("Your Cash Available "+number);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        else{
        number=number-a;
        System.out.println("Your Cash Available"+number);
        }

    }


    public synchronized void deposit(int a){
        System.out.println("Depositing "+a+" rupees");
        number=number+a;
        notify();
        System.out.println("Deposit is Done");
        System.out.println("Your Cash Available "+number);

    }

}


public class Thread2 {

    public static void main(String[] args) {

        Customer c=new Customer();

        Thread t1= new Thread(){

            @Override
            public void run(){
                c.withdraw(100000000);
            }
        };

        Thread t2= new Thread(){
            @Override
            public void run(){
                c.deposit(20000);
            }
        };

        t1.start();
        t2.start();
    }
}
