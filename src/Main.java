import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Василий", "Иванов-Калинин", 23));
        peoples.add(new Person("Михаил", "Иванов", 24));
        peoples.add(new Person("Мария", "Курочкина Петровкина", 21));

        peoples.sort((o1, o2) -> {
            if (o2.getWords() == o1.getWords()) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            return Integer.compare(o2.getWords(), o1.getWords());
        });
        System.out.println(peoples);
    }
}