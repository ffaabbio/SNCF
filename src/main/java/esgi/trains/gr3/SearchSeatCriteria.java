package esgi.trains.gr3;

@FunctionalInterface
public interface SearchSeatCriteria {

    boolean match(Seat seat);

}