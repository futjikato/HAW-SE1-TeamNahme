package informatik.hawhamburg.theamnahme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Implementation based on an ArrayList
 */
public class AssociationList<T> implements Association<T> {

    protected List<T> list = new ArrayList<T>();

    /**
     * Add the given object
     *
     * @param object
     *
     * @throws AssociationException
     *
     * @return index of added element
     */
    @Override
    public int add(T object) throws AssociationException {

        if(object == null) {
            throw new AssociationException("Null elements are not allowed to add to the list.");
        }

        list.add(object);

        // @todo does this work ? or better use indexOf .. would be more expensive
        return list.size() - 1;
    }

    /**
     * Get the object on the given index
     * Throws an AssociationException if the given index is invalid
     *
     * @param index
     * @return The requested object
     * @throws informatik.hawhamburg.theamnahme.AssociationException
     *
     */
    @Override
    public T get(int index) throws AssociationException {
        try {
            return list.get(index);
        } catch (IndexOutOfBoundsException e) {
            throw new AssociationException(e);
        }
    }

    /**
     * Return the amount of objects connected by this association
     *
     * @return amount
     */
    @Override
    public int getSize() {
        return list.size();
    }

    /**
     * Removes the object at the given index
     * Throws an AssociationException if the given index is invalid
     *
     * @param index
     */
    @Override
    public void remove(int index) throws AssociationException {
        try {
            // do not remove elements from list to keep index consistent
            list.set(index, null);
        } catch (IndexOutOfBoundsException e) {
            throw new AssociationException(e);
        }
    }

    /**
     * Returns an iterator over a set of elements of type T.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            protected int readCursor = 0;

            @Override
            public boolean hasNext() {
                return readCursor < AssociationList.this.getSize();
            }

            @Override
            public T next() {
                T elem;
                do {
                    elem = AssociationList.this.list.get(readCursor++);
                } while(elem == null);

                return elem;
            }

            @Override
            public void remove() throws UnsupportedOperationException {
                throw new UnsupportedOperationException("Method not implemented");
            }
        };
    }
}
