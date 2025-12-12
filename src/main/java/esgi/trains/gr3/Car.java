package esgi.trains.gr3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Car {

    private final CarClass carClass;
    private final int numCar;
    private final int numSiege;
    private List<Seat> seats;

    public Car(final CarClass carClass, final int numCar, final int numSiege) {
        this.carClass = carClass;
        this.numCar = numCar;
        this.numSiege = numSiege;

        this.init();
    }

    private void init() {
        this.seats = IntStream.range(0, numSiege + 1)
            .mapToObj(id -> this.createSeats(id))
            .collect(Collectors.toList());
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

    public List<Seat> getSeats() {
        return this.seats;
    }

    public Seat getSeatById(int id) {
        Seat seat = this.seats.stream()
            .filter(s -> s.getId() == id)
            .findFirst()
            .orElse(null);
        return seat;
    }

    private Seat createSeats(int id) {
        if (id < 1 || id > 10) {
            return null;
        }
        return new Seat(
            id,
            id % 2 == 0 ? SeatType.Window : SeatType.Aisle,
            Status.Free
        );
    }
}
