package ExamFinal;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pizza {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String typePizza = reader.readLine();
        String razmer = reader.readLine();
        String typeSos = reader.readLine();
        double numb = Double.parseDouble(reader.readLine());
        double price = 0;

        switch (typePizza) {
            case "with meat":
                if (razmer.equals("small")) {
                    price += 7.50;
                } else {
                    price += 11;
                }
                break;
            case "vegetarian":
                if (razmer.equals("small")) {
                    price += 5.50;
                } else {
                    price += 7.20;
                }

                break;
            default:
                if (razmer.equals("small")) {
                    price += 3.90;
                } else {
                    price += 5.45;
                }
                break;
        }
        if (typeSos.equals("tomato")  ){
            price += 1.50;
        }else if (typeSos.equals("garlic")){
            price += 1.70;
        }else if (typeSos.equals("special")){
            price += 2.50;
        }else {
            price += 0;
        }

        double total = price * numb;
        System.out.printf("%.2flv.", total);




    }
}
