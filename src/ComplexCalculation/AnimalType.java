package ComplexCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalType {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        switch (name){
            case "dog" :
                System.out.println("mammal");
                break;
            case "crocodile" :
            case "tortoise" :
            case "snake" :
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;

        }
    }
}
