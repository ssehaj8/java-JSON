package com.bridgelabz.practiceProblems;

import java.util.Scanner;
import org.json.JSONObject;

public class carJSON {
    public static class Car {
        private String brand;
        private String model;
        private int year;

        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the brand: ");
        String brand= sc.nextLine();

        System.out.println("Enter the model: ");
        String model= sc.nextLine();

        System.out.println("Enter the year: ");
        int year= sc.nextInt();

        Car car= new Car(brand, model, year);

        JSONObject json = new JSONObject();
        json.put("brand", car.getBrand());
        json.put("model", car.getModel());
        json.put("year", car.getYear());

        System.out.println(json.toString(2));
    }
}
/*
Enter the brand:
 volkswagen
Enter the model:
virtus gt sport
Enter the year:
2023
{
  "year": 2023,
  "model": "virtus gt sport",
  "brand": " volkswagen"
}
 */