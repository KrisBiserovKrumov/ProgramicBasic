package SimpleLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HalfSumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.readLine());

            if (num > max) {
                max = num;
            }
            sum = sum + num ;
        }sum = sum - max;
                if (max == sum){
                    System.out.println("Yes");
                    System.out.println("Sum = " + max);
                }else {
                    System.out.println("No");
                    System.out.println("Diff = " + Math.abs(sum - max));
                }

    }
}
