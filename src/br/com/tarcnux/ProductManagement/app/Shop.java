/*
* Copyright  (C) 2021 Tarcnux
*/

package br.com.tarcnux.ProductManagement.app;

import br.com.tarcnux.ProductManagement.data.Product;
import br.com.tarcnux.ProductManagement.data.Rating;
import java.math.BigDecimal;

/**
 * {@code Shop} class represents an application that manage Products
 * @version 1.0
 * @author tarcnux
 */
public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Tea", BigDecimal.valueOf(1.99));
        Product p2 = new Product(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p3 = new Product(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR);
        Product p4 = new Product();
        
//        p1.setId(101);
//        p1.setName("Tea");
//        p1.setPrice(BigDecimal.valueOf(1.99));
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
                
    }
    
}
