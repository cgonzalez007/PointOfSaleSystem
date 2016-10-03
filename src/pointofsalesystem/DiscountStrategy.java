
package pointofsalesystem;

/**
 *
 * @author cgonz
 */
public interface DiscountStrategy {
    public abstract double getDiscount(double unitPrice, int productQty);
}
