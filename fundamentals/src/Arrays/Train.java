package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Train {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int wagons = Integer.parseInt(reader.readLine());

        int[] passagers = new int[wagons];
        int sum = 0;

        for (int i = 0; i < wagons; i++) {
            passagers[i] = Integer.parseInt(reader.readLine());

            sum +=passagers[i];

        }
        for (int i = 0; i < passagers.length; i++) {
            System.out.print(passagers[i] + " ");

        }
        System.out.println();
        System.out.println(sum);
    }
}
