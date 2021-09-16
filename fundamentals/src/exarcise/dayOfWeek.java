package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dayOfWeek {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int a = Integer.parseInt(reader.readLine());

        if (a > 0 && a <= 7){
            for (int i = 0 ; i < days.length ; i++) {

                System.out.println(days[a - 1]);
                break;
            }


        }else {
            System.out.println("Invalid day!");
        }
    }
}
