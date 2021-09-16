package examMid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int partySize = Integer.parseInt(reader.readLine());
        int days = Integer.parseInt(reader.readLine());
        int companions = partySize;
        int coins = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 10 == 0 ){
                companions -= 2;
            }
             if (i % 15 == 0){
                companions += 5;
            }
            coins += 50;
            coins -= 2 * companions;
            if (i % 3 == 0){
                coins -= 3 * companions;
            } if (i % 5 == 0){
                coins += 20 * companions;
            } if (i % 3 == 0 && i % 5 == 0){
                coins -= 2 * companions;
            }
        }
        int total = coins / companions;
        System.out.printf("%d companions received %d coins each.",companions,total);

    }
}
