package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(reader.readLine());
        int[] numberst = new int[numb];

        for (int i = 0; i < numb; i++) {
            int arr = Integer.parseInt(reader.readLine());
            numberst[i] = arr;
        }

        for (int i = numberst.length - 1; i >=0 ; i--) {
            System.out.println(numberst[i]);
        }

    }
}
