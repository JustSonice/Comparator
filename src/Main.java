import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Василий", "Иванов-Калинин", 19));
        peoples.add(new Person("Михаил", "Иванов", 24));
        peoples.add(new Person("Мария", "Курочкина Петровкина", 20));
        peoples.add(new Person("Александр", "Ершов Павлович", 16));
        peoples.add(new Person("Анастасия", "Белова", 15));


        Predicate<Person> predicate = (person -> person.getAge() < 18);

        peoples.removeIf(predicate);
        System.out.println(peoples);
    }
}