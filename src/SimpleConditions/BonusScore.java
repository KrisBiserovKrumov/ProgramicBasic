package SimpleConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BonusScore {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double bonus = 0.0;
        if (a <= 100){
            bonus = bonus + 5;
        }else if ( a > 1000 ){
            bonus = bonus + a * 0.1;
        }else {
            bonus = bonus + a * 0.2;
        }
        if ( a % 2 == 0){
            bonus += 1;
        }else  if ( a % 10 == 5){
            bonus +=2;

        }
        System.out.println(bonus);
        System.out.println(bonus + a);

    }
}
