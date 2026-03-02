import java.util.Objects;

public class Actor extends Person{
    public int height;


    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "height=" + height +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height &&
                name.equals(actor.name) &&
                surname.equals(actor.surname);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode() + height;
    }
}
