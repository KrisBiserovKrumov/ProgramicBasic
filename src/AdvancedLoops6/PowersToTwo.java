package AdvancedLoops6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowersToTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int numb = 1;

        for (int i = 0; i <= n; i++) {
            System.out.println(numb);
            numb = numb * 2 ;

        }
    }
}
