
package br.com.tarcnux.ProductManagement.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author tarcnux
 */
public class Food extends Product{
    
    private final LocalDate bestBefore;

    public Food(Integer id, String name, BigDecimal price, Rating rating, 
            LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }


    /**
     * Get the value of bestBefore
     *
     * @return the value of bestBefore
     */
    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public String toString() {
        return super.toString() 
                + " Food{" + "bestBefore=" + bestBefore + '}';
    }
    
    

    
}
