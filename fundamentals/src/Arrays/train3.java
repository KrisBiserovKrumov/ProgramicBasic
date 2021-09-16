package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class train3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int wagons = Integer.parseInt(reader.readLine());
        int[] persons = new int [wagons];
        int sum = 0;

        for (int i = 0; i < wagons ; i++) {
            persons[i] = Integer.parseInt(reader.readLine());
            sum += persons[i];

        }
        for (int i = 0; i < persons.length; i++) {
            System.out.print(persons[i] + " ");

        }
        System.out.println();
        System.out.println(sum);
    }
}
