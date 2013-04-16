package informatik.hawhamburg.teamnahme;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class AssociationHashMapTest {

    private AssociationHashMap<Integer, String> hashMap;

    @Before
    public void setup() {
        this.hashMap =  new AssociationHashMap<Integer, String>();
    }

    @Test(expected = AssociationException.class)
    public void testGetNonexistentKeyThrowsException() throws Exception {
        this.hashMap.get(1);
    }

    @Test
    public void testAddElement() throws Exception {
        this.hashMap.add("Foo", 1);
        assertEquals("Foo", this.hashMap.get(1));
    }

    @Test(expected = AssociationException.class)
    public void testAddDuplicateValueThrowsException() throws Exception {
        this.hashMap.add("Foo", 1);
        this.hashMap.add("Foo", 1);
    }

    @Test(expected = AssociationException.class)
    public void testAddWithoutPrimaryKeyThrowsException() throws Exception {
        this.hashMap.add("Foo", null);
    }

    @Test(expected = AssociationException.class)
    public void testAddWithoutEntityThrowsException() throws Exception {
        this.hashMap.add(null, 1);
    }

    @Test
    public void testSize() throws Exception {
        this.hashMap.add("Foo", 1);
        this.hashMap.add("Bar", 2);
        assertEquals(2, this.hashMap.size());
    }

    @Test
    public void testHas() throws Exception {
        this.hashMap.add("Foo", 1);
        assertTrue(this.hashMap.has(1));
    }

    @Test(expected = AssociationException.class)
    public void testHashWithoutPrimaryKeyThrowsException() throws Exception {
        this.hashMap.has(null);
    }

    @Test
    public void testRemove() throws Exception {
        this.hashMap.add("Foo", 1);
        assertTrue(this.hashMap.has(1));
        this.hashMap.remove(1);
        assertFalse(this.hashMap.has(1));
    }

    @Test(expected = AssociationException.class)
    public void testRemoveWithoutPrimaryKeyThrowsException() throws Exception {
        this.hashMap.remove(null);
    }

    @Test
    public void testIteratorNext() throws Exception {
        this.hashMap.add("Foo", 1);
        assertEquals("Foo", this.hashMap.iterator().next());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextWithoutElementsThrowsException() {
        this.hashMap.iterator().next();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextWithMissingPrimaryKeyThrowsException() throws Exception {
        this.hashMap.add("Foo", 1);
        Iterator<String> iterator = this.hashMap.iterator();
        this.hashMap.remove(1);
        iterator.next();
    }

    @Test
    public void testIteratorHasNext() throws Exception {
        assertFalse(this.hashMap.iterator().hasNext());
        this.hashMap.add("Foo", 1);
        Iterator<String> iterator = this.hashMap.iterator();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertFalse(iterator.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemove() throws Exception {
        this.hashMap.iterator().remove();
    }

}
