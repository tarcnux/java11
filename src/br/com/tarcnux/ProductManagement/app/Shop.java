/*
* Copyright  (C) 2021 Tarcnux
 */
package br.com.tarcnux.ProductManagement.app;

import br.com.tarcnux.ProductManagement.data.Drink;
import br.com.tarcnux.ProductManagement.data.Food;
import br.com.tarcnux.ProductManagement.data.Product;
import br.com.tarcnux.ProductManagement.data.ProductManager;
import br.com.tarcnux.ProductManagement.data.Rating;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * {@code Shop} class represents an application that manage Products
 *
 * @version 1.0
 * @author tarcnux
 */
public class Shop {

    public static void main(String[] args) {
        
        ProductManager pm = new ProductManager();
        
        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), 
                Rating.TWO_STAR);
        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), 
                Rating.FOUR_STAR);
        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), 
                Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(0.99), 
                Rating.ONE_STAR, LocalDate.now());
        Product p5 = p3.applyRating(Rating.THREE_STAR);

        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), 
                Rating.FIVE_STAR);
        Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), 
                Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        
        Product p8 = p4.applyRating(Rating.FIVE_STAR);
        Product p9 = p1.applyRating(Rating.TWO_STAR);
        

        System.out.println("p6 é igual a p7? - " + p6.equals(p7));
        
        if (p3 instanceof Food) {
            LocalDate p3BestBefore = ((Food)p3).getBestBefore();
            System.out.println("p3BestBefore: " + p3BestBefore);
        }

//        p1.setId(101);
//        p1.setName("Tea");
//        p1.setPrice(BigDecimal.valueOf(1.99));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p8);
        System.out.println(p9);
        
        

    }

}
