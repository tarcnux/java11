/*
* Copyright  (C) 2021 Tarcnux
*/

package br.com.tarcnux.ProductManagement.app;

import br.com.tarcnux.ProductManagement.data.Drink;
import br.com.tarcnux.ProductManagement.data.Food;
import br.com.tarcnux.ProductManagement.data.Product;
import br.com.tarcnux.ProductManagement.data.Rating;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * {@code Shop} class represents an application that manage Products
 * @version 1.0
 * @author tarcnux
 */
public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Tea", BigDecimal.valueOf(1.99));
        Product p2 = new Drink(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p3 = new Food(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        Product p4 = new Product();
        Product p5 = p3.applyRating(Rating.THREE_STAR);
        
        Product p6 = new Drink(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
        Product p7 = new Food(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        
        System.out.println("p6 é igual a p7? - " + p6.equals(p7));
        
        
//        p1.setId(101);
//        p1.setName("Tea");
//        p1.setPrice(BigDecimal.valueOf(1.99));
        
        System.out.println(p1);
        System.out.println(p2);        
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
                
    }
    
}
