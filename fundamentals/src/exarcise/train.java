package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class train {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int sum =0;
        int [] passengers = new  int[a];
        for (int i = 0; i < a; i++) {
            int passeng = Integer.parseInt(reader.readLine());
            sum += passeng;
            passengers[i] = passeng;
        }
        for (int i = 0; i <passengers.length ; i++) {
            System.out.print(passengers[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
