package seedu.addressbook.data.person;

import org.junit.Test;

public class NameTest {
    @Test 
    public void testIsSimilar() {
        Name name1 = new Name("John");
        Name name2 = new Name("John");
        
        assertEquals(true, name1.isSimilar(name2));
        
    }
}
