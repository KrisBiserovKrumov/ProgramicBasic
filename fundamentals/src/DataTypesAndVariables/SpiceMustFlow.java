package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiceMustFlow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int yield = Integer.parseInt(reader.readLine());
        int sumYield = 0;
        int counterday = 0;




            while (yield >= 100) {
                counterday++;
                sumYield += (yield - 26);
                yield -= 10;


            }

            if (sumYield >= 26){
                sumYield -= 26;

            }


            System.out.println(counterday);


            System.out.println(sumYield);



    }
}
