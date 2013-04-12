package informatik.hawhamburg.teamnahme;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class AssociationListTest {

    protected AssociationList<String> list = new AssociationList<String>();

    @Before
    public void setup() {
        list.add("Entry 1");
        list.add("Entry 2");
        list.add("Entry 3");
    }

    @Test
    public void adding() {
        int index = list.add("New entry");
        assertEquals("Add returns incorrect new index for added element.", 3, index);
    }

    @Test
    public void getting() throws AssociationException {
        String entry3 = list.get(2);
        assertEquals("Getting incorrect object.", "Entry 3", entry3);
    }

    @Test
    public void size() {
        int size = list.getSize();
        assertEquals("Incorrect size returned.", 3, size);
    }

    @Test
    public void remove() throws AssociationException {
        list.remove(1);
        String entry2 = list.get(1);
        assertNull("Object is after removing still in list.", entry2);
    }

    @Test
    public void removeIntegrityTest() throws AssociationException {
        String beforeRemove = list.get(2);
        list.remove(1);
        String afterRemove = list.get(2);
        assertEquals("List integrity damaged after removing element from list.", afterRemove, beforeRemove);
    }
}
