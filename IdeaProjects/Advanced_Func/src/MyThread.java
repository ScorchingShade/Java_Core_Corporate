public class MyThread {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getPriority());
        System.out.println(t.getName());

        t.setName("LTI");
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t);

        try {
            for(int i = 0; i<6; i ++){

                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
