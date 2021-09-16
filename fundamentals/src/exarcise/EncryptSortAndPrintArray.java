package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(reader.readLine());
        int sumVow = 0;
        int sumConso = 0;
        for (int i = 0; i < numb ; i++) {
            String name = reader.readLine();
            char[] symbols = new char[name.length()];
            for (int j = 0; j < symbols.length ; j++) {
                symbols[j] = name.charAt(0 + j);
                switch (symbols[j]){
                    case  'a':
                        sumVow += 'a' * symbols.length;
                        break;
                    case  'o':
                        sumVow += 'o' * symbols.length;
                        break;
                    case  'u':
                        sumVow += 'u' * symbols.length;
                        break;
                    case  'e':
                        sumVow += 'e' * symbols.length;
                        break;
                    case  'i':
                        sumVow += 'i' * symbols.length;
                        break;
                        default:
                           sumConso += Math.ceil(symbols[j] / symbols.length);
                           break;
                }

            }
            int total = sumVow + sumConso;
            System.out.println(total);
            sumConso = 0;
            sumVow = 0;


        }
    }
}
