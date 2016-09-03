package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * Represents a Tagging in the address book.
 */
public class Tagging {
    
    private static final String PREFIX_ADD = "+";
    private static final String PREFIX_DELETE = "-";
    private static final String PRINT_FORMAT = "%1$s %2$s [%3$s]";

    public enum TaggingType {
        ADD, DELETE
    };

    private Person person;
    private Tag tag;
    private String prefix;
    
    public Tagging(Person person, Tag tag, TaggingType taggingType) {
        this.person = person;
        this.tag = tag;
        
        if(taggingType == TaggingType.ADD) {
            prefix = PREFIX_ADD;
        }
        
        if(taggingType == TaggingType.DELETE) {
            prefix = PREFIX_DELETE;
        }
    }

    @Override
    public String toString() {
        return String.format(PRINT_FORMAT, prefix, person.getName(), tag.tagName);
    }
    
}
