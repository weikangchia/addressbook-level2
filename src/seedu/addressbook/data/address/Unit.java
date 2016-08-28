package seedu.addressbook.data.address;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address unit component in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidUnit(String)}
 */
public class Unit {
    public static final String EXAMPLE = "#01-111";
    public static final String MESSAGE_STREET_CONSTRAINTS =
            "Address unit need to be in this format: #00-000";
    public static final String UNIT_VALIDATION_REGEX = "#\\d+-\\d+";
    
    private String _value;
    
    public Unit(String value) throws IllegalValueException {
        if (!isValidUnit(value)) {
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
    public static boolean isValidUnit(String test) {
        return test.matches(UNIT_VALIDATION_REGEX);
    }

    public String get_value() {
        return _value;
    }
}
