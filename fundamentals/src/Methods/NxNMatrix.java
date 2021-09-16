package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NxNMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(a + " ");

            }
            System.out.println();

        }

    }
}
