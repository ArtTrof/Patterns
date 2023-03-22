package behavioral.builder;

import behavioral.builder.builders.CarBuilder;
import behavioral.builder.builders.CarManualBuilder;
import behavioral.builder.cars.Car;
import behavioral.builder.cars.Manual;
import behavioral.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = carBuilder.getResult();
        System.out.println(car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportCar(carManualBuilder);
        Manual manualCar = carManualBuilder.getResult();
        System.out.println("\n"+manualCar.print());
    }
}
