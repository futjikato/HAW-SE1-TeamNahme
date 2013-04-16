package informatik.hawhamburg.teamnahme;

/**
 * Abstract implementation of a database entity
 *
 * @category Example
 */
public abstract class Entity {

    /**
     * Primary ID
     */
    protected int id;

    /**
     * Retrieve the ID of the entity
     *
     * @return ID
     */
    public int getId() {
        return id;
    }

    /**
     * Set the ID of this entity
     *
     * @param id
     * @return current instance for chaining
     */
    public Entity setId(int id) {
        this.id = id;

        return this;
    }
}
