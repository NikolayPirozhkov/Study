import java.util.Comparator;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getAge() - person2.getAge();
    }
}
