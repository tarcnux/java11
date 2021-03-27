
package br.com.tarcnux.ProductManagement.data;

import java.math.BigDecimal;

/**
 *
 * @author tarcnux
 */
public class Drink extends Product{

    public Drink(Integer id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }
    
}
