package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spaceship2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a =Double.parseDouble(reader.readLine());
        double b =Double.parseDouble(reader.readLine());
        double h =Double.parseDouble(reader.readLine());
        double hAstronautas =Double.parseDouble(reader.readLine());
        double space = a * b * h;
        double room = (hAstronautas + 0.40) * 2 * 2;
        double capasity = Math.floor(space / room);

        if (capasity >= 3 && capasity <= 10){
            System.out.printf("The spacecraft holds %.0f astronauts.", capasity);
        }else if (capasity < 3){
            System.out.println("The spacecraft is too small.");
        }else {
            System.out.println("The spacecraft is too big.");
        }




    }
}
