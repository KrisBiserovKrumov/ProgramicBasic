package demoExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deciphering {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) < 'd' && text.charAt(i) != '#' ) || (text.charAt(i) > '}' )){
                System.out.println("This is not the book you are looking for.");
                return;
            }
        }

        //if (!text.matches("[d-z{}\\|#]+")){
        //    System.out.println("This is not the book you are looking for.");
        //    return;
        //}
        String newText = "";
        for (int i = 0; i <text.length() ; i++) {
            newText += (char)(text.charAt(i) - 3);

        }
        String[] replacements = reader.readLine().split(" ");
        String letters = replacements[0];
        String replacement = replacements[1];

        String endText = newText.toString().replace(letters,replacement);
        System.out.println(endText);

    }
}
