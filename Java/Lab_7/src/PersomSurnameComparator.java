import java.util.Comparator;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class PersomSurnameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getSurname().compareTo(person2.getSurname());
    }
}
