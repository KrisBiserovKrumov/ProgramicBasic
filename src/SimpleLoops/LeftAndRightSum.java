package SimpleLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftAndRightSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(reader.readLine());

         int LeftSum = 0;
        for (int i = 0; i < n ; i++) {
            LeftSum = LeftSum + Integer.parseInt(reader.readLine());
            }
        int righttSum = 0;
        for (int i = 0; i < n ; i++) {
            righttSum = righttSum + Integer.parseInt(reader.readLine());
        }if (LeftSum == righttSum){
            System.out.println("Yes sum = " + righttSum);
        }else {
            System.out.println("No, diff = " + Math.abs(righttSum - LeftSum));
        }
    }
}
