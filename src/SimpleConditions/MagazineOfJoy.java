package SimpleConditions;

import java.util.Scanner;

public class MagazineOfJoy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceOfExcur = Double.parseDouble(scan.nextLine());
        double numbPuzels = Double.parseDouble(scan.nextLine());
        double numbDoll = Double.parseDouble(scan.nextLine());
        double numbBear = Double.parseDouble(scan.nextLine());
        double numbMinion = Double.parseDouble(scan.nextLine());
        double numbCamion = Double.parseDouble(scan.nextLine());
        // Пъзел – 2.60 лв.
        // Говореща кукла – 3 лв.
        // Плюшено мече – 4.10 лв.
        // Миньон – 8.20 лв.
        // Камионче – 2 лв.

        double total = numbPuzels * 2.60 + numbDoll * 3 + numbBear * 4.10 + numbMinion * 8.20 + numbCamion * 2;
        double totalJoy = numbPuzels + numbDoll + numbBear + numbMinion + numbCamion;
        double bonus = 0.25 * total;
        double total2 = total - bonus;
        double rent = 0.1 * total2;
        double rent2 = 0.1 * total;
        double krai = total2 - rent;
        double krai2 = total - rent2;
        double rest = krai - priceOfExcur;
        double rest2 = krai2 - priceOfExcur;
        double restt = priceOfExcur - krai;
        double restt2= priceOfExcur - krai2;

        if (totalJoy >= 50 ){

            if (krai >= priceOfExcur){

                System.out.printf("Yes! %.2f lv left.", rest);
            }else
                System.out.printf("Not enough money! %.2f lv needed." , restt);
        }else  {
            if (krai >= priceOfExcur){

                System.out.printf("Yes! %.2f lv left.", rest2);
            }else
                System.out.printf("Not enough money! %.2f lv needed." , restt2);

        }





    }
}
