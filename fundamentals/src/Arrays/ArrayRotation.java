package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbs = reader.readLine().split(" ");
        int rotatation = Integer.parseInt(reader.readLine());

        rotatation = rotatation % numbs.length;

        for (int i = 0; i <rotatation ; i++) {
            String elements = numbs[0];
            for (int j = 0; j < numbs.length - 1 ; j++) {
                numbs[j] = numbs[j + 1];

            }
            numbs[numbs.length - 1] = elements;

        }
        for (String numb : numbs) {
            System.out.print(numb + " ");

        }


    }
}
