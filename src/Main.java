import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Jarvis here, what can I do for you today?");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //this is a comment in the main class

        String[] inputArray = s.split(" ");

        for (int i = 0; i<inputArray.length;i++)
        {
            String checker = inputArray[i];
            if (checker.equals("time"))
            {
                Time time = new Time();
                time.getTime();
            }
            if (checker.equals("joke"))
            {
                Joke joke = new Joke();
                joke.getJoke();
            }
            if (checker.equals("remind"))
            {
                Time time = new Time();
                time.setReminder();
            }
        }

    }
}
