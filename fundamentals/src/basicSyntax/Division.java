package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());


       if (num % 10 == 0){
           System.out.println("The number is divisible by 10");
       }else if (num % 7 == 0){
           System.out.println("The number is divisible by 7");
       }else if (num % 6 == 0){
           System.out.println("The number is divisible by 6");
       }else if (num % 3 == 0){
           System.out.println("The number is divisible by 3");
       }else if (num % 2 == 0){
           System.out.println("The number is divisible by 2");
       }else{
           System.out.println("Not divisible");
       }
    }
}
