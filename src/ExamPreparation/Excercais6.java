package ExamPreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercais6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char a = reader.readLine().charAt(0);
        char b = reader.readLine().charAt(0);
        char c = reader.readLine().charAt(0);
        int counter = 0;

        for (char  i = a; i <= b; i++) {
            for (char  j = a; j <= b; j++) {
                for (char  k = a; k <= b; k++) {
                    if (i != c && j != c && k != c){
                        System.out.print("" + i + j + k + " ");
                        counter++;
                    }


                }


            }

        }
        System.out.println(counter);
    }
}
