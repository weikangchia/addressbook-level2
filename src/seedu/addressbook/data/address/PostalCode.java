package seedu.addressbook.data.address;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address postal code component in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPostalCode(String)}
 */
public class PostalCode {
    public static final String EXAMPLE = "111111";
    public static final String MESSAGE_POSTAL_CODE_CONSTRAINTS =
            "Address postal code can only contains 6 numbers";
    public static final String POSTAL_CODE_VALIDATION_REGEX = "\\d{6}";
    
    private String _value;
    
    public PostalCode(String value) throws IllegalValueException {
        if (!isValidPostalCode(value)) {
            throw new IllegalValueException(MESSAGE_POSTAL_CODE_CONSTRAINTS);
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
    public static boolean isValidPostalCode(String test) {
        return test.matches(POSTAL_CODE_VALIDATION_REGEX);
    }

    public String get_value() {
        return _value;
    }
}
