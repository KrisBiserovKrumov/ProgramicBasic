package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        printSmallest(a,b,c);
    }
    public static void printSmallest (int f, int s ,int d){
        if (f < s && f < d){
            System.out.println(f);
        }else if (s < f && s < d){
            System.out.println(s);
        }else {
            System.out.println(d);
        }
    }
}
