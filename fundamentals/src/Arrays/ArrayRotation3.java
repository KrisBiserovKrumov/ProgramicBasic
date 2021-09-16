package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        int index = Integer.parseInt(reader.readLine());
        int rotatation = index % line.length;

        for (int i = 0; i < rotatation ; i++) {
            String element = line[0];
            for (int j = 0; j < line.length - 1 ; j++) {
                line[j] = line[j + 1];
            }
            line [ line.length - 1] = element;
        }
        for (int i = 0; i < line.length ; i++) {
            System.out.print(line[i] + " ");

        }
    }
}
