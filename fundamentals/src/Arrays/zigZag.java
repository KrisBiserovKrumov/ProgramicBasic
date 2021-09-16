package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zigZag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int linesCounter = Integer.parseInt(reader.readLine());

        int[] firstArr = new int [linesCounter] ;
        int[] secondArr = new int [linesCounter] ;

        for (int i = 0; i < linesCounter; i++) {
            String[] numbers = reader.readLine().split(" ");
            if (i % 2 == 0){

                firstArr[i] = Integer.parseInt(numbers[0]);
                secondArr[i] = Integer.parseInt(numbers[1]);

            }else {
                firstArr[i] = Integer.parseInt(numbers[1]);
                secondArr[i] = Integer.parseInt(numbers[0]);

            }

        }

        for (int number : firstArr) {
            System.out.print(number + " ");

        }
        System.out.println();
        for (int number : secondArr) {
            System.out.print(number + " ");

        }
    }
}
