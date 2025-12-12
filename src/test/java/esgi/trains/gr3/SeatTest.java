package esgi.trains.gr3;


import esgi.trains.gr3.Car;
import esgi.trains.gr3.Train;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SeatTest
{

    @Test
    void testSeatAvailabilityAndBooking() {

        Seat seat = new Seat(1, SeatType.Window, Status.Free);


        assertTrue(seat.isAvaible(), "Le siege doit etre disponible");


        assertEquals(1, seat.getId());
        assertEquals(SeatType.Window, seat.getSeatType());
        assertEquals(Status.Free, seat.getStatus());


        seat.book();


        assertFalse(seat.isAvaible(), "Le siege n'est pas disponnible");


        assertEquals(Status.Booked, seat.getStatus());
    }




}

