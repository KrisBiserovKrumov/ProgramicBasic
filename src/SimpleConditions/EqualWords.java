package SimpleConditions;

import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String word1 = scan.nextLine();
        word = word.toLowerCase();
        word1 = word1.toLowerCase();


        if (word.equals(word1) ){
            System.out.println("yes");
        }else
            System.out.println("no");
    }
}
