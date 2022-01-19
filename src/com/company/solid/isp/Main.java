package com.company.solid.isp;

import com.company.solid.isp.vehicles.Car;
import com.company.solid.isp.vehicles.Motorcycle;

public class Main {
    private static String type;
    public static void main(String[] args) {

        type = "Motorcycle";
        if (type == "Car"){
            Car car = new Car("amarelo", "2022",3.1, 4 );
        } else {
            Motorcycle motorcycle = new Motorcycle("Azul", "2000", 600);
        }

    }
}
