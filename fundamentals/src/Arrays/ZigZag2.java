package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZag2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int box = Integer.parseInt(reader.readLine());
        int[] first = new int [box];
        int[] second = new int [box];





        for (int i = 0; i < box ; i++) {
            String[] numb = reader.readLine().split(" ");

                if (i % 2 == 0){
                    first[i] = Integer.parseInt(numb[0]);
                    second[i] = Integer.parseInt(numb[1]);
                }

                else {
                    first[i] = Integer.parseInt(numb[1]);
                    second[i] = Integer.parseInt(numb[0]);
                }



        }
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i] + " ");

        }



    }
}
