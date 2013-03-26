package informatik.hawhamburg.theamnahme;

/**
 * Interface
 */
public interface Association<T> {

    /**
     * Add the given object
     *
     * @param object
     */
    public void add(T object);

    /**
     * Get the object on the given index
     * Throws an AssociationException if the given index is invalid
     *
     * @param index
     *
     * @throws AssociationException
     *
     * @return The requested object
     */
    public T get(int index) throws AssociationException;

    /**
     * Return the amount of objects connected by this association
     *
     * @return amount
     */
    public int getSize();

    /**
     * Removes the object at the given index
     * Throws an AssociationException if the given index is invalid
     *
     * @param index
     */
    public void remove(int index) throws AssociationException;

}
