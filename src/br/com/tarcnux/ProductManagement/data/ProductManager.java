
package br.com.tarcnux.ProductManagement.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author tarcnux
 */
public class ProductManager {
    
    public Product createProduct(Integer id, String name, BigDecimal price,
            Rating rating, LocalDate bestBefore) {
        return new Food(id, name, price, rating, bestBefore);
    }
    
    public Product createProduct(Integer id, String name, BigDecimal price,
            Rating rating) {
        return new Drink(id, name, price, rating);
    }
    
}
