package esgi.trains.gr3;

import java.util.List;

public class Car {
    private CarClass carClass;
    private int numCar;
    private int numSiege;

    public Car(CarClass carClass, int numCar, int numSiege){
        this.carClass = carClass;
        this.numCar = numCar;
        this.numSiege = numSiege;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public int getNumCar() {
        return numCar;
    }

    public int getNumSiege() {
        return numSiege;
    }

    /*public Seat search(SearchSeatCriteria criteria){
        this.seats.stream().filter(criteria - > criteria.match());

    }*/


}
