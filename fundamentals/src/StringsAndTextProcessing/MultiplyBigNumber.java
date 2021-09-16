package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MultiplyBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();
        int multiplicator = Integer.parseInt(reader.readLine());

        if (multiplicator == 0){
            System.out.println(0);
        }else {
            int remainder = 0;
            List<Integer> result = new ArrayList<>();

            for (int i = number.length() - 1; i >= 0; i--) {

                int currentREsult = (number.charAt(i) - '0') * multiplicator;
                currentREsult += remainder;

                remainder = currentREsult / 10;
                result.add(currentREsult % 10);

            }
            if (remainder != 0){
                result.add(remainder);
            }
            for (int i = result.size() - 1; i >= 0 ; i--) {
                System.out.print(result.get(i));
                
            }
            System.out.println();
        }
    }
}
