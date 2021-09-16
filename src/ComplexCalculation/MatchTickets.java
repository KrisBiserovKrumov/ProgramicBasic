package ComplexCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatchTickets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double badget = Double.parseDouble(reader.readLine());
        String type = reader.readLine();
        double person = Double.parseDouble(reader.readLine());

        if (person <= 4){
            double transport = 0.75 * badget;
            double seconBadget = badget - transport;
            if (type.equals("VIP")){
                double cost = person * 499.99;
                double rest = cost - seconBadget;
                if (cost <= seconBadget){
                    System.out.printf("Yes! You have %.2f leva left", rest);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.",rest );
                }
            }else if (type.equals("Normal")){
                double cost = person * 249.99;
                double rest = cost - seconBadget;
                if (cost <= seconBadget){
                    System.out.printf("Yes! You have %.2f leva left", rest);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.",rest );
                }
            }
        } else if (person >= 5 && person <= 9){
            double transport = 0.60 * badget;
            double seconBadget = badget - transport;
            if (type.equals("VIP")){
                double cost = person * 499.99;
                double rest = cost - seconBadget;
                if (cost <= seconBadget){
                    System.out.printf("Yes! You have %.2f leva left", rest);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.",rest );
                }
            }else if (type.equals("Normal")){
                double cost = person * 249.99;
                double rest = cost - seconBadget;
                if (cost <= seconBadget){
                    System.out.printf("Yes! You have %.2f leva left", rest);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.",rest );
                }
            }
        } else if (person >= 10 && person <= 24){
            double transport = 0.50 * badget;
            double seconBadget = badget - transport;
            if (type.equals("VIP")){
                double cost = person * 499.99;
                double rest = cost - seconBadget;
                if (cost <= seconBadget){
                    System.out.printf("Yes! You have %.2f leva left", rest);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.",rest );
                }
            }else if (type.equals("Normal")){
                double cost = person * 249.99;
                double rest = cost - seconBadget;
                if (cost <= seconBadget){
                    System.out.printf("Yes! You have %.2f leva left", rest);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.",rest );
                }
            }
        }else  if (person >= 25 && person <= 49){
            double transport = 0.40 * badget;
            double seconBadget = badget - transport;
            if (type.equals("VIP")){
                double cost = person * 499.99;
                double rest = cost - seconBadget;
                if (cost <= seconBadget){
                    System.out.printf("Yes! You have %.2f leva left", rest);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.",rest );
                }
            }else if (type.equals("Normal")){
                double cost = person * 249.99;
                double rest = cost - seconBadget;
                if (cost <= seconBadget){
                    System.out.printf("Yes! You have %.2f leva left", rest);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.",rest );
                }
            }
        }else {
            double transport = 0.25 * badget;
            double seconBadget = badget - transport;
            if (type.equals("VIP")){
                double cost = person * 499.99;
                double rest = cost - seconBadget;
                if (cost <= seconBadget){
                    System.out.printf("Yes! You have %.2f leva left", rest);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.",rest );
                }
            }else if (type.equals("Normal")){
                double cost = person * 249.99;
                double rest = cost - seconBadget;
                if (cost <= seconBadget){
                    System.out.printf("Yes! You have %.2f leva left", rest);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.",rest );
                }
            }
        }
    }
}
