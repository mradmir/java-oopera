import java.util.ArrayList;
public class Show {
    public String title;
    public int duration;
    public Director director;
    ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;

    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printActor() {
        for(Actor actor : listOfActors){
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if(listOfActors.contains(actor)) {
            System.out.println("Такой актер уже есть");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(String surname, Actor newActor) {

        for (int i = 0; i < listOfActors.size(); i++) {

            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }

        System.out.println("Актёр с такой фамилией не найден");
    }

}
