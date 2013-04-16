package informatik.hawhamburg.teamnahme;

/**
 * Customer example
 *
 * @category Example
 */
public class Customer extends Entity {

    /**
     * List with all orders of this customer
     */
    protected Association<Integer, Order> orders = new AssociationHashMap<Integer, Order>();

    /**
     * Constructor
     *
     * @param id
     */
    public Customer(int id) {
        setId(id);
    }

    /**
     * Get the order association
     *
     * @return order association
     */
    public Association<Integer, Order> getOrders() {
        return orders;
    }
}
