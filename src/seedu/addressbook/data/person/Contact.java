package seedu.addressbook.data.person;

/**
 * Represents a super class of Phone, Email and Address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValid(String, String)}
 */
public class Contact {
    public final String value;
    protected boolean isPrivate;
    
    public Contact(String value, boolean isPrivate) {
        this.value = value;
        this.isPrivate = isPrivate;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
    public static boolean isValid(String test, String regex) {
        return test.matches(regex);
    }
}