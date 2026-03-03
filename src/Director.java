import java.util.Objects;

public class Director extends Person{
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", numberOfShows=" + numberOfShows;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Director director = (Director) o;
        return numberOfShows == director.numberOfShows;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfShows);
    }
}

