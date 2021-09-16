package ComplexCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FruitOrVegetable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String product = reader.readLine();
        //banana, apple, kiwi, cherry, lemon и grapes
        //tomato, cucumber, pepper и carrot
        if (product.equals("banana") || product.equals("apple") || product.equals("kiwi") || product.equals("cherry") || product.equals("lemon") || product.equals("grapes")){
            System.out.println("fruit");
        }else if (product.equals("tomato") || product.equals("cucumber") || product.equals("pepper") || product.equals("carrot")){
            System.out.println("vegetable");

        }else
            System.out.println("unknown");
    }
}
