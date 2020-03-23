import java.util.Comparator;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }
}
