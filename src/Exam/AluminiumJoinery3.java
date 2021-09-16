package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AluminiumJoinery3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double quantity = Double.parseDouble(reader.readLine());
        String format = reader.readLine();
        String delivery = reader.readLine();

        switch (format) {
            case "90X130": {
                double price = quantity * 110;
                if (quantity > 10 && quantity <= 30) {
                    if (delivery.equals("With delivery")) {
                        double price1 = price + 60;
                        System.out.printf("%.2f BGN", price1);
                    } else {
                        System.out.printf("%.2f BNG", price);
                    }
                } else if (quantity > 30 && quantity <= 60) {
                    double price2 = price - price * 0.05;
                    if (delivery.equals("With delivery")) {
                        double price3 = price2 + 60;
                        System.out.printf("%.2f BGN", price3);
                    } else {
                        System.out.printf("%.2f BGN", price2);
                    }
                } else if (quantity > 60 && quantity <= 99) {
                    double price3 = price - price * 0.08;
                    if (delivery.equals("With delivery")) {
                        double price1 = price3 + 60;
                        System.out.printf("%.2f BGN", price1);
                    } else {
                        System.out.printf("%.2f BNG", price3);
                    }
                } else if (quantity > 99) {
                    if (delivery.equals("With delivery")) {
                        double price4 = price - price * 0.08 + 60;
                        double price5 = price4 - price4 * 0.04;
                        System.out.printf("%.2f BGN", price5);
                    } else {
                        double price6 = price - (price - price * 0.08) * 0.04;
                        System.out.printf("%.2f BGN", price6);
                    }
                } else {
                    System.out.println("Invalid order");
                }
                break;
            }
            case "100X150": {
                double price = quantity * 140;
                if (quantity > 10 && quantity <= 40) {
                    if (delivery.equals("With delivery")) {
                        double price1 = price + 60;
                        System.out.printf("%.2f BGN", price1);
                    } else {
                        System.out.printf("%.2f BNG", price);
                    }
                } else if (quantity > 40 && quantity <= 80) {
                    double price2 = price - price * 0.06;
                    if (delivery.equals("With delivery")) {
                        double price3 = price2 + 60;
                        System.out.printf("%.2f BGN", price3);
                    } else {
                        System.out.printf("%.2f BGN", price2);
                    }
                } else if (quantity > 80 && quantity <= 99) {
                    double price3 = price - price * 0.10;
                    if (delivery.equals("With delivery")) {
                        double price1 = price3 + 60;
                        System.out.printf("%.2f BGN", price1);
                    } else {
                        System.out.printf("%.2f BNG", price3);
                    }
                } else if (quantity > 99) {
                    if (delivery.equals("With delivery")) {
                        double price4 = price - price * 0.10 + 60;
                        double price5 = price4 - price4 * 0.04;
                        System.out.printf("%.2f BGN", price5);
                    } else {
                        double price6 = price - (price - price * 0.10) * 0.04;
                        System.out.printf("%.2f BGN", price6);
                    }
                } else {
                    System.out.println("Invalid order");
                }

                break;
            }
            case "130X180": {
                double price = quantity * 190;
                if (quantity > 10 && quantity <= 20) {
                    if (delivery.equals("With delivery")) {
                        double price1 = price + 60;
                        System.out.printf("%.2f BGN", price1);
                    } else {
                        System.out.printf("%.2f BNG", price);
                    }
                } else if (quantity > 20 && quantity <= 50) {
                    double price2 = price - price * 0.07;
                    if (delivery.equals("With delivery")) {
                        double price3 = price2 + 60;
                        System.out.printf("%.2f BGN", price3);
                    } else {
                        System.out.printf("%.2f BGN", price2);
                    }
                } else if (quantity > 50 && quantity <= 99) {
                    double price3 = price - price * 0.12;
                    if (delivery.equals("With delivery")) {
                        double price1 = price3 + 60;
                        System.out.printf("%.2f BGN", price1);
                    } else {
                        System.out.printf("%.2f BNG", price3);
                    }
                } else if (quantity > 99) {
                    if (delivery.equals("With delivery")) {
                        double price4 = price - price * 0.12 + 60;
                        double price5 = price4 - price4 * 0.04;
                        System.out.printf("%.2f BGN", price5);
                    } else {
                        double price6 = price - (price - price * 0.12) * 0.04;
                        System.out.printf("%.2f BGN", price6);
                    }
                } else {
                    System.out.println("Invalid order");
                }

                break;
            }
            default: {
                double price = quantity * 250;
                if (quantity > 10 && quantity <= 25) {
                    if (delivery.equals("With delivery")) {
                        double price1 = price + 60;
                        System.out.printf("%.2f BGN", price1);
                    } else {
                        System.out.printf("%.2f BNG", price);
                    }
                } else if (quantity > 25 && quantity <= 50) {
                    double price2 = price - price * 0.09;
                    if (delivery.equals("With delivery")) {
                        double price3 = price2 + 60;
                        System.out.printf("%.2f BGN", price3);
                    } else {
                        System.out.printf("%.2f BGN", price2);
                    }
                } else if (quantity > 50 && quantity <= 99) {
                    double price3 = price - price * 0.14;
                    if (delivery.equals("With delivery")) {
                        double price1 = price3 + 60;
                        System.out.printf("%.2f BGN", price1);
                    } else {
                        System.out.printf("%.2f BNG", price3);
                    }
                } else if (quantity > 99) {
                    if (delivery.equals("With delivery")) {
                        double price4 = price - price * 0.14 + 60;
                        double price5 = price4 - price4 * 0.04;
                        System.out.printf("%.2f BGN", price5);
                    } else {
                        double price6 = price - (price - price * 0.14) * 0.04;
                        System.out.printf("%.2f BGN", price6);
                    }
                } else {
                    System.out.println("Invalid order");
                }

                break;
            }
        }

    }
}
