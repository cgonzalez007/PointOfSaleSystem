
package pointofsalesystem;

/**
 *
 * @author cgonz
 */
public class FakeDatabase implements DataAccessStrategy {

    Customer[] customers = new Customer[]{
        new Customer()
    };
    Product[] products = new Product[]{
        new Product()
    };

    @Override
    public Customer findCustomer(String customerId) {
        //requires validation!
    }

    @Override
    public Product findProduct(String productId) {
        // requires validation!
    }

}
