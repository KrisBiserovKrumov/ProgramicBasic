package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class topInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbs = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)). toArray();
        String topp = "";

        for (int i = 0; i < numbs.length - 1; i++) {
            boolean top = true;
            if (numbs[i + 1] < numbs[i] ){
                top = false;
                break;
            }
            if (top = true){
                topp += numbs[i];
                break;

            }

        }
        System.out.print(topp);

    }
}
