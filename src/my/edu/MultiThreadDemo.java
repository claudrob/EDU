package my.edu;

public class MultiThreadDemo {

    public static void main(String [] args){

        DemoThread thread1 = new DemoThread();


        DemoRunnable runnable1 = new DemoRunnable();
        Thread thread2 = new Thread(runnable1);
//        thread2.setDaemon(true);
//        thread1.setDaemon(true);

        try {
            thread1.start();
            thread1.join(3000);
            thread2.start();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println(1/0);
    }

}
