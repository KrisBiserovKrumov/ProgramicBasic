package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Train2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int wagons = Integer.parseInt(reader.readLine());
        int sum = 0;

        for (int i = 0; i < wagons; i++) {
            int people = Integer.parseInt(reader.readLine());
            System.out.print(people + " ");
            sum += people;

        }
        System.out.println();
        System.out.println(sum);

        }
        }
