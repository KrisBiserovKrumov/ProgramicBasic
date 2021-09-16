package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordValidator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String password = reader.readLine();

        if (validate(password)) {
            System.out.println("Password is valid");
            }
        }

    public  static boolean validate (String p){
        boolean correctCharCount = valicateCount (p);
        boolean onlyLetters = validateContain(p);
        boolean haveDigits = ValidateDigitsCount (p);

        return  correctCharCount && onlyLetters && haveDigits;

    }

    private static boolean ValidateDigitsCount(String p) {

        int digitCount = 0;
        for (int i = 0; i < p.length(); i++) {
            char symbol = p.charAt(i);
            if (Character.isDigit(symbol)){
                digitCount++;
                if (digitCount >= 2){
                    return true;
                }
            }

        }
        System.out.println("Password must have at least 2 digits");
        return false;
    }

    private static boolean validateContain(String p) {


        for (int i = 0; i <p.length() ; i++) {
            char symbol = p.charAt(i);
            if (!Character.isLetterOrDigit(symbol)){
                System.out.println("Password must consist only of letters and digits");
                return  false;
            }
            
        }
        return true;


    }

    private static boolean valicateCount(String p) {

        boolean isValid = p.length() > 5  && p.length() < 11;

        if (!isValid){
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }
}
