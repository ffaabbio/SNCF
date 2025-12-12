package esgi.trains.gr3;

import esgi.trains.gr3.Car;
import esgi.trains.gr3.Train;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TrainTest
{

    @Test
    void AttachMethodInTrainClassShouldReturnFalseWhenNumberOfCarisGreaterThanF() {


        Train train = new Train();

        Car car1 = new Car(CarClass.First, 1, 50);
        Car car2 = new Car(CarClass.Second, 2, 40);
        Car car3 = new Car(CarClass.First, 3, 60);
        Car car4 = new Car(CarClass.Second, 4, 30);
        Car car5 = new Car(CarClass.First, 5, 55);


        train.attach(new Car(CarClass.First, 1, 50));
        train.attach(new Car(CarClass.Second, 2, 40));
        train.attach(new Car(CarClass.Second, 3, 60));
        train.attach(new Car(CarClass.First, 4, 30));


        assertFalse(train.attach(new Car(CarClass.Second, 5, 55)));


        Train train2 = new Train();

        Car car = new Car(CarClass.First, 1, 50);

        train2.attach(car);

        assertFalse(train2.attach(car));
    }





}
