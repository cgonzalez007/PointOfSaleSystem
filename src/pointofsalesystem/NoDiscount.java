
package pointofsalesystem;

/**
 *
 * @author cgonz
 */
public class NoDiscount implements DiscountStrategy {
    private final int NO_DISCOUNT = 0;
    @Override
    public final double getDiscount(double unitPrice, int productQty) {
        return NO_DISCOUNT;
    }
    
}
