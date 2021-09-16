package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] firstArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)). toArray();
        int[] secondArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)). toArray();
        int sum = 0;

        for (int i = 0; i < firstArr.length; i++) {

            if (firstArr[i] != secondArr[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }else {
                sum += firstArr[i];


            }
        }
        if (firstArr.length == secondArr.length){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }



    }
}
