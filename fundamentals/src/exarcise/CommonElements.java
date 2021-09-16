package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        String[] doubleLine = reader.readLine().split(" ");

        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j <doubleLine.length ; j++) {
                if (line[i].equals(doubleLine[j])){
                    System.out.print(doubleLine[j] + " ");
                }

            }

        }
    }
}
