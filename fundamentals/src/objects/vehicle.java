package objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class vehicle {
    private String type;
    private String model;
    private String color;
    private  int horsepower;

    public vehicle(String type, String model, String color, int horsepower) {
        this.setType(type);
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }
    private void setType(String type){
        type = type.replace(type.charAt(0),Character.toUpperCase(type.charAt(0)));
        this.type = type;
    }
    public  String getType(){
        return  this.type;
    }
    public  String getModel(){
        return  this.model;
    }
    public String getColor(){
        return this.color;
    }
    public int getHorsepower(){
        return this.horsepower;
    }



    @Override
    public String toString() {
        return String.format("Type: %s%n"
        + "Model: %s%n" + "Color: %s%n"
                + "Horsepower: %d"
                ,this.getType(),this.getModel(),this.getColor(),this.getHorsepower());
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<vehicle> cars = new ArrayList<>();
        ArrayList<vehicle> trucks = new ArrayList<>();

        String line = reader.readLine();

        while (!line.equals("End")) {
            String[] tokens = line.split(" ");

            vehicle vehicle = new vehicle(tokens[0], tokens[1], tokens[2]
                    , Integer.parseInt(tokens[3]));
            if (vehicle.getType().equals("Truck")) {
                trucks.add(vehicle);
            } else {
                cars.add(vehicle);
            }

            line = reader.readLine();
        }
        line = reader.readLine();

        while (!line.equals("Close the Catalogue")) {
            String model = line;
            for (vehicle truck : trucks) {
                if (truck.getModel().equals(model)) {
                    System.out.println(truck.toString());
                }

            }
            for (vehicle car : cars) {
                if (car.getModel().equals(model)) {
                    System.out.println(car.toString());
                }

            }
            line = reader.readLine();
        }
        double truckHorsPowerAvg = 0;
        double carHorsPowerAvg = 0;
        double carHorsePowerSum = 0;
        double truckHorsePowerSum = 0;
        if (!cars.isEmpty()) {
            for (vehicle car : cars) {
                carHorsePowerSum += car.getHorsepower();
            }
            carHorsPowerAvg = carHorsePowerSum / cars.size();
        }
        System.out.println(String.format
                ("Cars have average horsepower of: %.2f.",carHorsPowerAvg));
        if (!trucks.isEmpty()) {
            for (vehicle truck : trucks) {
                truckHorsePowerSum += truck.getHorsepower();
            }
            truckHorsPowerAvg = truckHorsePowerSum / trucks.size();

        }
        System.out.println(String.format
                ("Trucks have average horsepower of: %.2f.",truckHorsPowerAvg));

    }
}
