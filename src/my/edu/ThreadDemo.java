package my.edu;

public class ThreadDemo {

    public static void main(String[] args) {

        System.out.println("Thread Demo");
        System.out.println("Active Number of Threads: " + Thread.activeCount());

        System.out.println("Name of current thread: " + Thread.currentThread().getName());

        Thread.currentThread().setName("MAINNNN");
        System.out.println("New Name of current thread: " + Thread.currentThread().getName());
        System.out.println("Priority: " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("New Priority: " + Thread.currentThread().getPriority());
        System.out.println("Is Alive: " + Thread.currentThread().isAlive());

        for(int i = 3; i > 0; i--){
            System.out.println(i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Program finished!");

        MyThread thread2 = new MyThread();
        System.out.println("Thread2 Name " + thread2.getName());

        System.out.println("Thread2 isAlive " + thread2.isAlive());
        System.out.println("Starting Thread");
        System.out.println("Deamon: " + thread2.isDaemon());
        thread2.setDaemon(true);
        thread2.start();

        thread2.setName("New Name");
        System.out.println("Priority" + thread2.getPriority());
        thread2.setPriority(1);
        System.out.println("New Priority" + thread2.getPriority());
        System.out.println("Thread2 NEW Name " + thread2.getName());
        System.out.println("Thread2 isAlive " + thread2.isAlive());
        System.out.println("Active Number of Threads: " + Thread.activeCount());

        System.out.println("New Deamon: " + thread2.isDaemon());
    }

}
