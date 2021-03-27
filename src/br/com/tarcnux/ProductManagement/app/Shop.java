/*
* Copyright  (C) 2021 Tarcnux
*/

package br.com.tarcnux.ProductManagement.app;

import br.com.tarcnux.ProductManagement.data.Product;
import java.math.BigDecimal;

/**
 * {@code Shop} class represents an application that manage Products
 * @version 1.0
 * @author tarcnux
 */
public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product();
        
        p1.setId(101);
        p1.setName("Tea");
        p1.setPrice(BigDecimal.valueOf(1.99));
        
        System.out.println(p1);               
                
    }
    
}
