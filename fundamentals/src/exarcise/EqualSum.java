package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] firstArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum1 = 0;
        int sum2 = 0;
        boolean isEquals = false;

        for (int i = 0; i < firstArr.length; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < i ; j++) {
                sum1 += firstArr[j];

            }
            for (int j = i + 1; j <  firstArr.length; j++) {
                sum2 += firstArr[j];

            }
            if (sum1 == sum2){
                System.out.println(i);
                isEquals = true;
                break;
            }


        }
        if (!isEquals){
            System.out.println("no");
        }
    }
}
