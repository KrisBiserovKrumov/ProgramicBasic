package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"} ;

        int day = Integer.parseInt(reader.readLine());

        if (day >= 1 && day <= 7){
            System.out.println(days [day - 1 ]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
