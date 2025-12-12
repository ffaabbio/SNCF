package esgi.trains.gr3;

import java.util.ArrayList;

public class Train {
    private List<Car> cars;

    public Train () {
        this.cars = new List<Car>();
    }

    public Boolean attach(Car car){
        this.cars.add(car);
        return true;
    }
}
