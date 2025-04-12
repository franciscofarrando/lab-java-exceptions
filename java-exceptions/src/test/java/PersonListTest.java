import com.example.Person;
import com.example.PersonsList;
import org.junit.*;

import static org.junit.Assert.*;

public class PersonListTest {
    @Test
    public void testSetAgeThrowsForNegativeAge() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Person(1, "francisco farrando", -5, "architect");
        });
    }

    @Test
    public void testFindByNameSuccess() {
        PersonsList list = new PersonsList();
        Person p = new Person(6, "Andrea Franzzoni", 30, "Doctor");
        list.add(p);
        assertEquals(p, list.findByName("Andrea Franzzoni"));
    }

    @Test
    public void testFindByNameThrowsForInvalidFormat() {
        PersonsList list = new PersonsList();
        assertThrows(IllegalArgumentException.class, () -> {
            list.findByName("juan");
        });
    }

    @Test
    public void testCloneCreatesNewPersonWithDifferentId() {
        Person original = new Person(1, "Miquel Coll", 40, "astronaut");
        PersonsList list = new PersonsList();
        Person cloned = list.clone(original, 2);
        assertTrue(original.equals(cloned));
        assertNotEquals(original.getId(), cloned.getId());
    }
}
