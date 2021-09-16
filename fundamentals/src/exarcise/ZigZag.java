package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String[] first = new String[count];
        String[] second = new String[count];

        for (int i = 0; i <count ; i++) {
            String[] line = reader.readLine().split(" ");
            if (i % 2 == 0) {
                first[i] = line[0];
                second[i] = line[1];

            }else {
                first[i] = line[1];
                second[i] = line[0];

            }

        }
        for (String s : first) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : second) {
            System.out.print(s + " ");
        }







    }
}
