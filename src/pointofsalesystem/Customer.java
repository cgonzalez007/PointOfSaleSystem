
package pointofsalesystem;

/**
 *
 * @author cgonz
 */
public class Customer {

    private String CustomerId;
    private String CustomerName;

    public Customer(String CustomerId, String CustomerName) {
        this.CustomerId = CustomerId;
        this.CustomerName = CustomerName;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

}
