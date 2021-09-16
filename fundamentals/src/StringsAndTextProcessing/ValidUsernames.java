package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] username = reader.readLine().split(", ");


        for (int i = 0; i <username.length ; i++) {
            if (isUserNameValid(username[i])) {
                System.out.println(username[i]);
            }

        }
    }
    public static boolean isUserNameValid (String username){
        if (username.length() < 3 || username.length() > 16){
            return false;

        }
        for (int i = 0; i < username.length() ; i++) {
            char symbol = username.charAt(i);

            if (! (Character.isLetterOrDigit(symbol) || symbol =='-' || symbol == '_')){
                return false;
            }


        }
        return true;
    }
}
