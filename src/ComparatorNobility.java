import java.util.Comparator;

public class ComparatorNobility implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o2.getWords() == o1.getWords()) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
            return Integer.compare(o2.getWords(), o1.getWords());
        }
    }
