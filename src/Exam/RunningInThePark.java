package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunningInThePark {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(reader.readLine());
        double kilometurs = 0;
        double min = 0;
        double calories = 0;
        double oneMinute = 20;


        for (int i = 0; i < n; i++) {
            double time = Double.parseDouble(reader.readLine());
            double distancie = Double.parseDouble(reader.readLine());
            String kmOrM = reader.readLine();

            if (kmOrM.equals("m")) {
                distancie = distancie / 1000;
            }
            kilometurs += distancie;
            min += time;
        }
        calories += oneMinute * min;

        System.out.printf("He ran %.2fkm for %.0f minutes and burned %.0f calories." , kilometurs , min , calories);
    }
}
