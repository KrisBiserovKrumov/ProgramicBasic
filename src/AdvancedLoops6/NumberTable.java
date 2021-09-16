package AdvancedLoops6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberTable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        int previousNum = 0;
        for (int row = 0; row < a; row++) {
            for (int col = 0; col < a; col++) {
                int Num = row + col + 1;

                if (Num > a){
                   Num = previousNum - 1;
                }
                System.out.print(Num + " ");
                previousNum = Num;
            }
            System.out.println();
        }
    }
}
