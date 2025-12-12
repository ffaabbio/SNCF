package esgi.trains.gr3;

public class Seat {

    int id;
    SeatType type;
    Status status;

    public Seat(int id, SeatType type, Status status) {
        this.id = id;
        this.type = type;
        this.status = status;
    }

    public boolean isAvaible() {
        return this.status == Status.Free;
    }

    public void book() {
        this.status = Status.Booked;
    }
}
