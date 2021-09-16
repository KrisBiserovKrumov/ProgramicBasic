package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualSums3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        int[] numb = new int[line.length];
        for (int i = 0; i <line.length; i++) {
            numb[i] = Integer.parseInt(line[i]);
        }
        boolean hasEquals = false;


        for (int i = 0; i < numb.length; i++) {


            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i ; j++) {
                sum1 += numb[j];
            }
            for (int j = i + 1; j <numb.length ; j++) {
                sum2 += numb[j];
            }
            if (sum1 == sum2){
                System.out.println(i);
                hasEquals = true;
                break;
            }
        }
        if (!hasEquals){
            System.out.println("no");
        }










    }
}
