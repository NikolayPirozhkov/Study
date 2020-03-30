import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class PersonCompareTests {
    @Test
    void tests(){
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Harlyn", "Price", 28));
        persons.add(new Person("Omar", "Lopez", 32));
        persons.add(new Person("Cruz", "Stewart", 15));
        persons.add(new Person("Shawn", "Davis", 18));
        persons.add(new Person("Vince", "Taylor", 79));
        persons.add(new Person("Zakary", "Mitchell", 65));
        persons.sort(new PersonNameComparator());
        assertAll("SortingByName",
                //() -> assertEquals("Cruz", persons.get(0).getName()));
                () -> assertTrue(persons.get(0).getName().startsWith("C")),
                () -> assertTrue(persons.get(1).getName().startsWith("H")),
                () -> assertTrue(persons.get(2).getName().startsWith("O")),
                () -> assertTrue(persons.get(3).getName().startsWith("S")),
                () -> assertTrue(persons.get(4).getName().startsWith("V")),
                () -> assertTrue(persons.get(5).getName().startsWith("Z"))
        );
        persons.sort(new PersomSurnameComparator());
        assertAll("SortingBySurname",
                () -> assertTrue(persons.get(0).getSurname().startsWith("D")),
                () -> assertTrue(persons.get(1).getSurname().startsWith("L")),
                () -> assertTrue(persons.get(2).getSurname().startsWith("M")),
                () -> assertTrue(persons.get(3).getSurname().startsWith("P")),
                () -> assertTrue(persons.get(4).getSurname().startsWith("S")),
                () -> assertTrue(persons.get(5).getSurname().startsWith("T"))
        );
        persons.sort(new PersonAgeComparator());
        assertAll("SortingByAge",
                () -> assertEquals(15,persons.get(0).getAge()),
                () -> assertEquals(18,persons.get(1).getAge()),
                () -> assertEquals(28,persons.get(2).getAge()),
                () -> assertEquals(32,persons.get(3).getAge()),
                () -> assertEquals(65,persons.get(4).getAge()),
                () -> assertEquals(79,persons.get(5).getAge())

        );
    }

}

