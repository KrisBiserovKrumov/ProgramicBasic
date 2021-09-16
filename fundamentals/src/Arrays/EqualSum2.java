package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualSum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbs = reader.readLine().split(" ");
        int[] numbers = new int[numbs.length];

        for (int i = 0; i <numbs.length ; i++) {
            numbers[i] = Integer.parseInt(numbs[i]);
        }
        boolean hasEquals = false;




        for (int i = 0; i < numbs.length; i++) {
            int leftsum = 0, rightsum = 0;

            for (int j = i - 1; j >= 0 ; j--) {
                leftsum += numbers[j];
            }

            for (int j = i + 1; j < numbs.length; j++) {
                rightsum += numbers[j];
            }
            if (leftsum == rightsum){
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
