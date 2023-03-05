import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Person> peoples = new ArrayList<>();
        peoples.add(new Person("Василий","Иванов-Калинин", 19));
        peoples.add(new Person("Михаил","Иванов", 24));
        peoples.add(new Person("Мария","Курочкина Петровкина", 20));

        Collections.sort(peoples, new ComparatorNobility());
        System.out.println(peoples);
    }
}