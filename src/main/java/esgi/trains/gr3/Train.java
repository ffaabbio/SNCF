package esgi.trains.gr3;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private List<Car> cars;

    public Train() {
        this.cars = new ArrayList<Car>();
    }

    public Boolean attach(Car car) {
        if (this.cars.size() < 4 && !this.cars.contains(car)) {
            return this.cars.add(car);
        }
        return false;
    }

    public void book(Ticket ticket) {
        this.cars.stream()
            .filter(c -> c.getNumCar() == ticket.CarId())
            .findFirst()
            .map(c -> c.bookSeatById(ticket.SeatId()))
            .orElse(false);
    }

    public Ticket search(CarClass carClass, SearchSeatCriteria searchSeatCriteriaCriteria){
        searchSeatCriteriaCriteria.match(cars.getClass())
    }
}
