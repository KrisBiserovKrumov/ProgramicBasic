package ExamFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codename {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char n = reader.readLine().charAt(0);



        int result = Integer.MAX_VALUE  ;



            for (char i = 100; i <= 111; i++) {
                for (char j = 'm'; j <= 'p'; j++) {
                    for (char k = 'J'; k < 'O'; k++) {
                        for (int l = 10; l <= 50; l++) {

                            result = n + i + j + k + l;





                        }

                    }

                }

            }





        
        
    }
}
