package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multiplicationTabeltwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (b > 10 ){
            int result = a * b;
            System.out.printf("%d X %d = %d", a,b,result);
        }else {
            for (int i = b; i <= 10; i++) {
                int result = a * i;
                System.out.printf("%d X %d = %d%n", a,i,result);

            }
        }
    }
}
