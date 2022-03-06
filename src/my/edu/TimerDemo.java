package my.edu;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {

    public static void main(String[] args) {

        System.out.println("Starting up: ...");
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int counter = 10;
            @Override
            public void run() {

                if(counter > 0) {
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else {
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2022);
        date.set(Calendar.MONTH, Calendar.MARCH);
        date.set(Calendar.DAY_OF_MONTH, 5);
        date.set(Calendar.HOUR_OF_DAY, 18);
        date.set(Calendar.MINUTE, 10);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);



//        timer.schedule(task, 3000);
//        timer.schedule(task, date.getTime());
        timer.scheduleAtFixedRate(task, 0, 1000);

    }

}
