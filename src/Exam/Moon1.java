package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Moon1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double speed = Double.parseDouble(reader.readLine());
        double liturs = Double.parseDouble(reader.readLine());
        double distance = 384400 * 2;
        double time = Math.ceil(distance / speed );
        double totalTime = time + 3;
        System.out.printf("%.0f%n",totalTime);
        double totalLiters = liturs * distance / 100;
        System.out.printf("%.0f",totalLiters);
    }
}
