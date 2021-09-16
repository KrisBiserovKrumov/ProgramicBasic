package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VendingMashine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;

        String input = reader.readLine();


        while (!input.equals("Start")){

            double coint = Double.parseDouble(input);

            if (coint == 0.1 || coint == 0.2 || coint == 0.5 || coint == 1 || coint == 2){
                sum += coint;
            }else{
                System.out.println("Cannot accept " + coint);
            }
            input = reader.readLine();
        }
        String secondInput = reader.readLine();

        while (!secondInput.equals("End")){


            if (secondInput.equals("Nuts")){
                if (sum >= 2){
                    System.out.println("Purchased Nuts");
                    sum -= 2;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if (secondInput.equals("Water")){
                if (sum >= 0.7){
                    System.out.println("Purchased Water");
                    sum -= 0.7;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if (secondInput.equals("Crisps")){
                if (sum >= 1.5){
                    System.out.println("Purchased Crisps");
                    sum -= 1.5;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if (secondInput.equals("Soda")){
                if (sum >= 0.8){
                    System.out.println("Purchased Soda");
                    sum -= 0.8;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if (secondInput.equals("Coke")){
                if (sum >= 1){
                    System.out.println("Purchased Coke");
                    sum -= 1;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else {
                System.out.println("Invalid product");
            }
            secondInput = reader.readLine();
        }
        System.out.printf("Change: %.2f", sum);

    }
}
