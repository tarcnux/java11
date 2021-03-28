
package br.com.tarcnux.ProductManagement.data;

import static br.com.tarcnux.ProductManagement.data.Rating.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

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
public abstract class Product {
    
    /**
     * A constant that defines a
     * {@link java.math.BigDecimal BigDecimal} value of the discount rate
     * <br>
     * Discount rate is 10%
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    
    private final Integer id;
    private final String name;
    private final BigDecimal price;
    private final Rating rating;

    Product(Integer id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    
    Product(Integer id, String name, BigDecimal price) {
        this(id, name, price, NOT_RATED);
    }

//    Product() {
//        this(0,"no name", BigDecimal.ZERO);
//    }
    
    
    public Integer getId() {
        return id;
    }

//    public void setId(final Integer id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(final String name) {
//        this.name = name;
//    }

    public BigDecimal getPrice() {
        return price;
    }

//    public void setPrice(final BigDecimal price) {        
//        this.price = price;
//    }

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
    
    public abstract Product applyRating(Rating newRating);
    
    /**
     * Get the a fixed date of bestBefore
     *
     * @return the value of bestBefore
     */
    public LocalDate getBestBefore() {
        return LocalDate.now();
    }
    
    @Override
    public String toString() {
        return  "Product{" + "id= " + id 
                + ", name= " + name 
                + ", price= " + price 
                + ", discount= " + getDiscount()
                + ", rating= " + getRating().getStars()
                + ", bestBefore = " + getBestBefore()
                + ", " + super.toString()
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
