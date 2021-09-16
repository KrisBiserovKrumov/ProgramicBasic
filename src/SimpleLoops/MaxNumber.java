package SimpleLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n ; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
