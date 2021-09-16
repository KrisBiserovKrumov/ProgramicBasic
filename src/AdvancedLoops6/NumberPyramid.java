package AdvancedLoops6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberPyramid {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
       int currentNumb = 1 ;
        for (int i = 1; ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(currentNumb++ + " ");


                if (currentNumb > a ){
                     return;
                }
            }
            System.out.println();

        }

        }
    }

