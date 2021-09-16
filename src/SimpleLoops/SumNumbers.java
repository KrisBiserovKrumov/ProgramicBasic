package SimpleLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.readLine());
            sum = sum + num;
        }
            System.out.println(sum);
            
        }
    }

