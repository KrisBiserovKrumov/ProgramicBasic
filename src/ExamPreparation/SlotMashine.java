package ExamPreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SlotMashine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char n = reader.readLine().charAt(0);
        int n1 = Integer.parseInt(reader.readLine());
        char m = reader.readLine().charAt(0);
        int m1 = Integer.parseInt(reader.readLine());
        char k = reader.readLine().charAt(0);
        int k1 = Integer.parseInt(reader.readLine());

        char first = (char) (n + n1 );
        char second = (char) (m + m1 );
        char three = (char) (k + k1 );
        String result = "" + first + second + three;

        System.out.println(result);
        if (result.equals("@@@")){
            System.out.println("!!! YOU LOSE EVERYTHING !!!");
        }else if (result.equals("777")){
            System.out.println("*** JACKPOT ***");
        }


    }
}
