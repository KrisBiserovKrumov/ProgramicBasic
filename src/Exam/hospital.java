package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hospital {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(reader.readLine());
        int pregledani = 0;
        int nepregledani = 0;
        int doctor = 7;
        int pacient = 0;

        for (int i = 1; i <= days; i++) {
            pacient = Integer.parseInt(reader.readLine());

            if (i % 3 == 0 && pacient > doctor) {
                doctor ++;
            }

            if (pacient < doctor){
                pregledani += pacient;

            }else{
                pregledani += doctor;
                nepregledani += pacient - doctor;
            }


        }
        System.out.printf("Treated patients: %d.%n" , pregledani);
        System.out.printf("Untreated patients: %d.",nepregledani);
    }
}
