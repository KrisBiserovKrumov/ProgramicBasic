package Arrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class EqualSums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] numb = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean hasEqual = false;

        for (int i = 0; i < numb.length; i++) {
           int rightsum = 0 , leftsum = 0;

            for (int j = i - 1; j >= 0 ; j--) {
                leftsum += numb[j];

            }
            for (int j = i + 1; j < numb.length ; j++) {
                rightsum += numb[j];

            }
            if (rightsum == leftsum){
                System.out.println(i);
                hasEqual = true;
                break;
            }
        }
        if (!hasEqual){
            System.out.println("no");
        }

    }
}
