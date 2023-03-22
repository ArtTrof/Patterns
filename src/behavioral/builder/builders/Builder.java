package behavioral.builder.builders;

import behavioral.builder.cars.CarType;
import behavioral.builder.components.Engine;
import behavioral.builder.components.GPSNavigator;
import behavioral.builder.components.Transmission;
import behavioral.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void  setGPSNavigator(GPSNavigator navigator);
}
