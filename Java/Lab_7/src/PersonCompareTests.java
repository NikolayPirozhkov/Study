import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class PersonCompareTests {
    @Test
    void tests(){
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Harlyn", "Price", 28));
        persons.add(new Person("Omar", "Lopez", 32));
        persons.add(new Person("Cruz", "Stewart", 15));
        persons.add(new Person("Shawn", "Davis", 18));
        persons.add(new Person("Vince", "Taylor", 79));
        persons.add(new Person("Zakary", "Mitchell", 65));

    }

}

