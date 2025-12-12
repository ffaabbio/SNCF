package esgi.trains.gr3;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void SearchMethodShouldThrowExceptionWhenNoWindowSeatAreAvailable() {
        Car car = new Car(CarClass.First,1,20);

        //car.search();
    }

    @Test
    public void searchMethodCanReturnAWindowSeat(){

    }
}
