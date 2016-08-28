package seedu.addressbook.data.person;

import seedu.addressbook.data.address.Block;
import seedu.addressbook.data.address.PostalCode;
import seedu.addressbook.data.address.Street;
import seedu.addressbook.data.address.Unit;
import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = Block.EXAMPLE + ", " 
                                         + Street.EXAMPLE + ", " 
                                         + Unit.EXAMPLE + ", " 
                                         + PostalCode.EXAMPLE;
    public static final String MESSAGE_ADDRESS_CONSTRAINTS =
            "Person addresses need to be in this format: a/BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String ADDRESS_VALIDATION_REGEX =
            "(\\d+[A-Z,a-z]?)(,)(.+)(,)(#| #)(\\d+-\\d+)(,)( \\d+|\\d+)";
    
    private static final int ADDRESS_BLOCK_INDEX = 0;
    private static final int ADDRESS_STREET_INDEX = 1;
    private static final int ADDRESS_UNIT_INDEX = 2;
    private static final int ADDRESS_POSTAL_CODE_INDEX = 3;

    public final String value;
    public final Block block;
    public final Street street;
    public final Unit unit;
    public final PostalCode postalCode;

    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = address;
        
        String[] addressArray = value.split(", ");
        this.block = new Block(addressArray[ADDRESS_BLOCK_INDEX]);
        this.street = new Street(addressArray[ADDRESS_STREET_INDEX]);
        this.unit = new Unit(addressArray[ADDRESS_UNIT_INDEX]);
        this.postalCode = new PostalCode(addressArray[ADDRESS_POSTAL_CODE_INDEX]);
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}