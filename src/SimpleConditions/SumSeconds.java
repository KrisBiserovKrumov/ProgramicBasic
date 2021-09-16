package SimpleConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSeconds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int min = (a + b + c) / 60 ;
        int sek =(a + b + c) % 60 ;
        if (sek < 10){
            System.out.println(min + ":0" + sek);
        }else{
        System.out.println(min + ":" + sek);}
    }
}
