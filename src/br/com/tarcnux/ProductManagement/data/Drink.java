
package br.com.tarcnux.ProductManagement.data;

import java.math.BigDecimal;
import java.time.LocalTime;

/**
 *
 * @author tarcnux
 */
public final class Drink extends Product{

    Drink(Integer id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }

    @Override
    public BigDecimal getDiscount() {
        LocalTime now = LocalTime.now();
        return (now.isAfter(LocalTime.of(17, 30))
                && now.isBefore(LocalTime.of(18, 30)))
                ? super.getDiscount() : BigDecimal.ZERO;
    }
    
    /**
     * @param newRating
     * @return Drink Object
     */
    @Override
    public Product applyRating(Rating newRating) {
        return new Drink(getId(), getName(), getPrice(), newRating);
    }
    
    
    
}
