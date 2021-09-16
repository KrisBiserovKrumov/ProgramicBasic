package ExamPreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercais5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int count = (a + 5 - 1) / 2;
//first
        System.out.print(repeatStr("_", count));
        System.out.print("^");
        System.out.println(repeatStr("_", count));
        count--;
        //Second
        System.out.print(repeatStr("_", count));
        System.out.print("/|\\");
        System.out.println(repeatStr("_", count));
        count--;
//three
        for (int i = 0; i < a / 2; i++) {
            System.out.print(repeatStr("_", count));
            System.out.print("/");
            System.out.print(repeatStr(".", i));
            System.out.print("|||");
            System.out.print(repeatStr(".", i));
            System.out.print("\\");
            System.out.println(repeatStr("_", count));
            count--;
        }
            //four

            count = (a + 5 - 9) / 2;
            System.out.print(repeatStr("_", count));
            System.out.print("/..|||..\\");
            System.out.println(repeatStr("_", count));
            count++;

            //five
            System.out.print(repeatStr("_", count));
            System.out.print("/.|||.\\");
            System.out.println(repeatStr("_", count));
            count += 2;

            //six
        for (int i = 0; i < a; i++) {
            System.out.print(repeatStr("_", count));
            System.out.print("|||");
            System.out.println(repeatStr("_", count));
        }
         //seven
        System.out.print(repeatStr("_", count));
        System.out.print("~~~");
        System.out.println(repeatStr("_", count));



        //eight

        for (int i = 0; i < a / 2; i++) {
            count--;
            System.out.print(repeatStr("_", count));
            System.out.print("//");
            System.out.print(repeatStr(".", i));
            System.out.print("!");
            System.out.print(repeatStr(".", i));
            System.out.print("\\\\");
            System.out.println(repeatStr("_", count));


            
        }

        }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
