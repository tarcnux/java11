
package br.com.tarcnux.ProductManagement.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * {@code Product} class represents properties and behaviors of
 * products objects in the Product Management System.
 * <br>
 * Each product has an id, name, and price
 * <br>
 * Each product can have a discount, calculated based on a
 * {@link DISCOUNT_RATE discount rate }
 * @version 1.0
 * @author tarcnux
 */
public class Product {
    private Integer id;
    private String name;
    private BigDecimal price;
    /**
     * A constant that defines a
     * {@link java.math.BigDecimal BigDecimal} value of the discount rate
     * <br>
     * Discount rate is 10%
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private Rating rating;

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

    public Rating getRating() {
        return rating;
    }
    

    /**
     * calculates discount based on a product price and
     * {@link DISCOUNT_RATE discount rate}
     * @return {@link java.math.BigDecimal BigDecimal}
     * value of the discount
     */
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
