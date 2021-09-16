package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualArrays2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = reader.readLine().split(" ");
        String[] secondLine = reader.readLine().split(" ");
        int[] firstlinee = new int[firstLine.length];
        int[] secondlinee = new int[secondLine.length];
        int sum = 0;
        boolean isDiferent = false;

        for (int i = 0; i < firstLine.length; i++) {
            firstlinee[i] = Integer.parseInt(firstLine[i]);
        }
        for (int i = 0; i < secondLine.length; i++) {
            secondlinee[i] = Integer.parseInt(secondLine[i]);
        }
        for (int i = 0; i < firstlinee.length; i++) {
            if (firstlinee[i] == secondlinee[i]){
                sum += firstlinee[i];

            }else {
                System.out.printf("Arrays not identical. Found difference at %d index", i);
                isDiferent = true;
                break;
            }
            
        }

        if (!isDiferent) {
            System.out.println("Arrays identical. Sum : " + sum);
        }
            
        


    }
}
