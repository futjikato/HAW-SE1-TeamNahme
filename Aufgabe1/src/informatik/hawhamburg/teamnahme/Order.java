package informatik.hawhamburg.teamnahme;

/**
 * Order entity
 *
 * @category Example
 */
public class Order extends Entity {

    /**
     * Client of this order
     */
    protected Customer client;

    /**
     * A short description of the order
     */
    protected String description;

    /**
     * Constructor
     *
     * @param id
     * @param client
     * @param description
     */
    public Order(int id, Customer client, String description) {
        setId(id);
        setClient(client);
        setDescription(description);
    }

    /**
     * Retrieve the client of this order
     *
     * @return client
     */
    public Customer getClient() {
        return client;
    }

    /**
     * Set the client for this order
     *
     * @param client
     * @return current instance for chaining
     */
    public Order setClient(Customer client) {
        this.client = client;

        return this;
    }

    /**
     * Get the description
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description
     *
     * @param description
     * @return current instance for chaining
     */
    public Order setDescription(String description) {
        this.description = description;

        return this;
    }
}
