package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pokemon {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int beginpower = Integer.parseInt(reader.readLine());
        int distance = Integer.parseInt(reader.readLine());
        int factor = Integer.parseInt(reader.readLine());

        int counter = 0;
        int power = beginpower;

        while (power >= distance){
            counter++;
            power -= distance;
            if (power == beginpower / 2.00 && factor != 0){
                power /= factor;
            }
        }
        System.out.println(power);
        System.out.println(counter);
    }
}
