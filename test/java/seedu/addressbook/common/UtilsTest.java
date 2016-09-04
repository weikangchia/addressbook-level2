package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {

    @Test
    public void isAnyNull_emptyInput_returnsFalse() {
        assertEquals(false, Utils.isAnyNull());
    }

    @Test
    public void isAnyNull_allNullInput_returnsTrue() {
        assertEquals(true, Utils.isAnyNull(null, null));
    }

    @Test
    public void isAnyNull_oneNonNullInput_returnsTrue() {
        assertEquals(true, Utils.isAnyNull(null, "hello world"));
    }

    @Test
    public void isAnyNull_multInput_returnsTrue() {
        assertEquals(true, Utils.isAnyNull(null, "hello world", 123));
    }

    @Test(expected = NullPointerException.class)
    public void elementsAreUnique_null_throwsNullPointerException() {
        assertEquals(true, Utils.elementsAreUnique(null));
    }

    @Test
    public void elementsAreUnique_emptyList_returnTrue() {
        assertEquals(true, Utils.elementsAreUnique(new ArrayList<String>()));
    }

    @Test
    public void elementsAreUnique_uniqueStringList_returnTrue() {
        ArrayList<String> uniqueList = new ArrayList<String>();
        uniqueList.add("hello");
        uniqueList.add("world");
        assertEquals(true, Utils.elementsAreUnique(uniqueList));
    }
    
    @Test
    public void elementsAreUnique_uniqueObjectList_returnTrue() {
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        uniqueList.add(new Integer(1));
        uniqueList.add(new Integer(2));
        assertEquals(true, Utils.elementsAreUnique(uniqueList));
    }
    
    @Test
    public void elementsAreUnique_uniqueObjectListWithNull_returnTrue() {
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        uniqueList.add(new Integer(1));
        uniqueList.add(new Integer(2));
        uniqueList.add(null);
        assertEquals(true, Utils.elementsAreUnique(uniqueList));
    }
    
    @Test
    public void elementsAreUnique_nonUniqueStringList_returnFalse() {
        ArrayList<String> nonUniqueList = new ArrayList<String>();
        nonUniqueList.add("hello");
        nonUniqueList.add("world");
        nonUniqueList.add("hello");
        assertEquals(false, Utils.elementsAreUnique(nonUniqueList));
    }
    
    @Test
    public void elementsAreUnique_nonUniqueObjectList_returnFalse() {
        ArrayList<Object> nonUniqueList = new ArrayList<Object>();
        nonUniqueList.add(new Integer(1));
        nonUniqueList.add(new Integer(2));
        nonUniqueList.add(new Integer(2));
        assertEquals(false, Utils.elementsAreUnique(nonUniqueList));
    }
    
    @Test
    public void elementsAreUnique_nonUniqueObjectListWithNull_returnFalse() {
        ArrayList<Object> nonUniqueList = new ArrayList<Object>();
        nonUniqueList.add(new Integer(1));
        nonUniqueList.add(new Integer(2));
        nonUniqueList.add(new Integer(2));
        nonUniqueList.add(null);
        assertEquals(false, Utils.elementsAreUnique(nonUniqueList));
    }
}
