package generating.builder.builders;

import generating.builder.cars.CarType;
import generating.builder.components.Engine;
import generating.builder.components.GPSNavigator;
import generating.builder.components.Transmission;
import generating.builder.components.TripComputer;

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
