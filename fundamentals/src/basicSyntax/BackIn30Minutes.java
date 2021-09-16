package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackIn30Minutes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int hour = Integer.parseInt(reader.readLine());
        int minutes = Integer.parseInt(reader.readLine()) + 30;


        if (minutes > 59) {
            hour++;
            minutes -= 60;
        }
        if (hour > 23) {
            hour = 0;
        }if (minutes < 10) {
            System.out.printf("%d:0%d", hour, minutes);
        }else {
            System.out.printf("%d:%d", hour, minutes);
        }

    }
}
