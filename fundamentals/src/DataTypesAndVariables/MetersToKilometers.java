package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MetersToKilometers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int meters = Integer.parseInt(reader.readLine()) ;

        double km = meters * 0.0001;

        System.out.println(km);

    }
}
