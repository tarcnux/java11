
package br.com.tarcnux.ProductManagement.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author tarcnux
 */
public class Product {
    private Integer id;
    private String name;
    private BigDecimal price;
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {        
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2,RoundingMode.HALF_UP);
    }
    
    @Override
    public String toString() {
        return "Product{" + "id= " + id + ", name= " + name + ", price= " + price 
                + ", discount= " + getDiscount()
                + '}';
    }
      
}
