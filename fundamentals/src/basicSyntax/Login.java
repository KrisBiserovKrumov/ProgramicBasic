package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String user = reader.readLine();
        String password = "";

        for (int i = user.length() - 1 ; i >= 0 ; i--) {
            password += user.charAt(i);
        }
        String inputpassword = reader.readLine();

        int counter = 1;

        while (!inputpassword. equals(password)){
            counter++;
            System.out.println("Incorrect password. Try again.");
            inputpassword = reader.readLine();
            if (counter == 4) {
                break;
            }
        }
        if (inputpassword.equals(password)){
            System.out.println("User " + user + " logged in.");
        }else {
            System.out.println("User " + user  + " blocked!");
        }
    }
}
