package SimpleCalculate;

import java.util.Scanner;

public class ConcatenateDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
                String lastname = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                String town = scanner.nextLine();
                System.out.printf("You are %s %s, a %d-years old person from %s.", name, lastname, age, town);

                //VaRIANT 2
        //String str = "You are " + name + " " + lastname + ", a " +  age + "-years old person from " + town + '.';
        //System.out.println(str);
    }
}
