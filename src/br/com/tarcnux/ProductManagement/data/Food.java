
package br.com.tarcnux.ProductManagement.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author tarcnux
 */
public final class Food extends Product{
    
    private final LocalDate bestBefore;

    Food(Integer id, String name, BigDecimal price, Rating rating, 
            LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

    /**
     *
     * @param newRating
     * @return Food Object
     */
    @Override
    public Product applyRating(Rating newRating) {
        return new Food(getId(), getName(), getPrice(), newRating, bestBefore);
    }

    /**
     * Get the value of bestBefore
     *
     * @return the value of bestBefore
     */
    @Override
    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public BigDecimal getDiscount() {
        return (bestBefore.isEqual(LocalDate.now())? 
                super.getDiscount() : BigDecimal.ZERO); 

    }
}
