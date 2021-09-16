package AdvancedLoops6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenPowersOfTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int numb = 1 ;
        for (int i = 0; i <= a ; i+=2) {
            System.out.println(numb);
            numb = numb * 4;
            
        }
    }
}
