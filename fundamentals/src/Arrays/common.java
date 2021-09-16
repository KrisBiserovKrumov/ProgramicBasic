package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class common {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] first =  reader.readLine().split(" ");
        String[] second = reader.readLine().split(" ");

        for (int i = 0; i < second.length ; i++) {
            for (int j = 0; j < first.length; j++) {
                if (second[i].equals(first[j]) ){
                    System.out.print(second[i] + " ");

                }

            }

        }
    }
}
