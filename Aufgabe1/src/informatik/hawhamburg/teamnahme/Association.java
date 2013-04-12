package informatik.hawhamburg.teamnahme;

/**
 * Interface
 */
public interface Association<P, E> extends Iterable<E> {

    /**
     * Add the given entity with the given primary
     *
     * @param entity
     * @param primary
     *
     * @throws AssociationException
     *
     * @return current association for chaining
     */
    public Association add(E entity, P primary) throws AssociationException;

    /**
     * Get the entity for the given primary
     * Throws an AssociationException if no association exists to the given primary
     *
     * @param primary
     *
     * @throws AssociationException
     *
     * @return The requested object
     */
    public E get(P primary) throws AssociationException;

    /**
     * Checks if an association exists to the given primary
     *
     * @param primary
     *
     * @return boolean
     */
    public boolean has(P primary) throws AssociationException;

    /**
     * Return the amount of entities associated
     *
     * @return amount
     */
    public int size();

    /**
     * Removes the entity with the given primary key
     *
     * @param primary
     *
     * @return current association for chaining
     */
    public Association remove(P primary) throws AssociationException;

}
