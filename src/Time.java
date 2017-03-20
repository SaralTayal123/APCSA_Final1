import java.util.Date;
import java.util.Scanner;

public class Time {

    public void getTime() {

        Date date = new Date();
        System.out.println(date.toString());
    }

    public void setReminder(){
        System.out.print("How many minutes do you want to be reminded in?");

        Scanner sc = new Scanner(System.in);
        long min = sc.nextInt();


        System.out.println("What message would you like to be reminded?");
        String message = sc.next();

        min = min*60000;
        try {
            Thread.sleep(min);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.print("Sir, it's time for your next appointment. Here is the message you left with me: " + message);
    }

}

