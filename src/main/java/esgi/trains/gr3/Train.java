package esgi.trains.gr3;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Car> cars;

    public Train () {
        this.cars = new ArrayList<Car>();
    }

    public Boolean attach(Car car){
        this.cars.add(car);
        return true;
    }
}
