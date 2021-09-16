package SimpleLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DelenieBezOstatukE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        for (int i = 1; i <= n ; i++) {
            int num = Integer.parseInt(reader.readLine());

            if (num % 2 == 0) {
                p1++;
            }if (num % 3 == 0){
                p2++;

            }if (num % 4 == 0) {
                p3++;

            }
            }
        double p1Percents = p1 / n * 100;
        double p2Percents = p2 / n * 100;
        double p3Percents = p3 / n * 100;

        System.out.printf("%.2f%%%n",p1Percents);
        System.out.printf("%.2f%%%n",p2Percents);
        System.out.printf("%.2f%%%n",p3Percents);

    }
}
