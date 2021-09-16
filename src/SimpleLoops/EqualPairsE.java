package SimpleLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualPairsE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int previouSum = 0;
        int maxDiff = 0;


        for (int i = 0; i < n ; i++) {
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int sum = a + b;

            if (i > 0 && sum != previouSum){
                int diff = Math.abs(sum - previouSum);
                if (diff > maxDiff){
                    maxDiff = diff;
                }

            } previouSum = sum;

        }if ( maxDiff == 0){
            System.out.println("Yes, value =" + previouSum);
        }else {
            System.out.println("No, maxdiff =" + maxDiff);
        }
    }
}
