package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiddleCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        String result = get(str);
        System.out.println(result);
    }
    public static String get (String str){
        int middle = str.length() / 2;
        String result = "";

        if (str.length() % 2 == 0){
            result += str.charAt(middle-1);
            result += str.charAt(middle);

        }else {
            result += str.charAt(middle);


        }
        return result;
    }
}
