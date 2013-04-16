package informatik.hawhamburg.teamnahme;

/**
 * Main class shows usage of example classes customer and order
 *
 * @dcategory Example
 */
public class  Main {

    public static void main(String[] args) {
        Customer cus1 = new Customer(1);

        Order order1 = new Order(1, cus1, "First order");
        Order order2 = new Order(2, cus1, "Second order");
        Order order3 = new Order(3, cus1, "Third order");
        Order order4 = new Order(4, cus1, "Fourth order");

        try {
            cus1.getOrders().add(order1, 1);
            cus1.getOrders().add(order2, 2);
            cus1.getOrders().add(order3, 3);
            cus1.getOrders().add(order4, 4);

            System.out.println(cus1.getOrders().get(2).getDescription());
        } catch (AssociationException e) {
            e.printStackTrace();
        }
    }
}
