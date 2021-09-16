package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrom {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String word = reader.readLine();

            if (word.equals("END") ){
            break;
            }
            for (char i = 0; i < word.length() / 2 ; i++) {
                for (char  j = 0; j < word.length() - i; j++) {
                    if (i == j ){
                        System.out.println(i);
                        break;
                    }
                }


            }

        }
    }


}
