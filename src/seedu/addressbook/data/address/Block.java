package seedu.addressbook.data.address;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address block component in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidBlock(String)}
 */
public class Block {
    public static final String EXAMPLE = "123 or 123A";
    public static final String MESSAGE_BLOCK_CONSTRAINTS =
            "Address block need to be in this format: number only or number followed by a alphabet";
    public static final String BLOCK_VALIDATION_REGEX = "\\d+[A-Z,a-z]?";
    
    private String _value;

    public Block(String value) throws IllegalValueException {
        if (!isValidBlock(value)) {
            throw new IllegalValueException(MESSAGE_BLOCK_CONSTRAINTS);
        }
        _value = value;
    }
    
    @Override
    public String toString() {
        return _value;
    }

    /**
     * Returns true if a given string is a valid address block.
     */
    public static boolean isValidBlock(String test) {
        return test.matches(BLOCK_VALIDATION_REGEX);
    }

    public String get_value() {
        return _value;
    }
}
