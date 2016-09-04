package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
    @Test
    public void testIsSimilar() throws IllegalValueException {
        Name name1 = new Name("John");
        Name name2 = new Name("John");

        assertEquals(true, name1.isSimilar(name2));

        assertEquals(false, name1.isSimilar(null));

        name2 = new Name("john");

        assertEquals(true, name1.isSimilar(name2));
        
        name2 = new Name("Mary");
        
        assertEquals(false, name1.isSimilar(name2));
        
        name2 = new Name("JoHn");
        
        assertEquals(true, name1.isSimilar(name2));
    }
}
