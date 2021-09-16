package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        String[] firstArr = reader.readLine().split(" ");
        String[] secondArr = reader.readLine().split(" ");

        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < firstArr.length; j++) {
                if (secondArr[i].equals( firstArr[j])){
                    System.out.print(secondArr[i] + " ");
                }

            }


        }

    }
}
