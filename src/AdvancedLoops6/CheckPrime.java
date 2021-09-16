package AdvancedLoops6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
         if (a < 2) {
             System.out.println("Not prime");
             return;
         }

             for (int i = 2; i <= Math.sqrt(a); i++) {
                 if (a % i == 0){
                     System.out.println("Not prime");
                     return;
                 }}
        System.out.println("Prime");



    }
}
