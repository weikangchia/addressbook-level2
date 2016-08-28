package seedu.addressbook.data.address;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address street component in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidStreet(String)}
 */
public class Street {
    public static final String EXAMPLE = "Serangoon North Ave 4";
    public static final String MESSAGE_STREET_CONSTRAINTS =
            "Address street can be in any format";
    public static final String STREET_VALIDATION_REGEX = ".+";
    
    private String _value;
    
    public Street(String value) throws IllegalValueException {
        if (!isValidStreet(value)) {
            throw new IllegalValueException(MESSAGE_STREET_CONSTRAINTS);
        }
        _value = value;
    }

    @Override
    public String toString() {
        return _value;
    }

    /**
     * Returns true if a given string is a valid address street.
     */
    public static boolean isValidStreet(String test) {
        return test.matches(STREET_VALIDATION_REGEX);
    }

    public String get_value() {
        return _value;
    }
}
