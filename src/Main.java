import java.lang.reflect.Array;
import java.util.Scanner;
import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.IOException;


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




            if (checker.equals("add")) {
                int index;
                int no1 = -1;
                int no2 = -1;

                for (int i = 0; i < inputArray.length; i++)
                {
                    if (inputArray[i].equals("add"))
                    {
                        index = i;
                        break;
                    }
                }
                for (int i = index; i < inputArray.length;i++)
                {
                    boolean isInteger = isInteger(inputArray[i]);
                    if (isInteger)
                    {
                        if (no2 ==-1 && (no1!= -1))
                            no2 = Integer.parseInt(inputArray[i]);
                        no1 = Integer.parseInt(inputArray[i]);

                    }
                    else
                        System.out.println("Please provide valid integers");
                }
            }
        }

    }




    public static boolean isInteger(String s) {
        boolean isValidInteger = false;
        try
        {
            Integer.parseInt(s);

            // s is a valid integer

            isValidInteger = true;
        }
        catch (NumberFormatException ex)
        {
            // s is not an integer
        }

        return isValidInteger;
    }

}
