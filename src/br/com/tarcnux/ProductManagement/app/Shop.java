/*
* Copyright  (C) 2021 Tarcnux
 */
package br.com.tarcnux.ProductManagement.app;

//import br.com.tarcnux.ProductManagement.data.Drink;
//import br.com.tarcnux.ProductManagement.data.Food;
import br.com.tarcnux.ProductManagement.data.Product;
import br.com.tarcnux.ProductManagement.data.ProductManager;
import br.com.tarcnux.ProductManagement.data.Rating;
import java.math.BigDecimal;
import java.time.LocalDate;
//import java.time.LocalDate;
import java.util.Locale;

/**
 * {@code Shop} class represents an application that manage Products
 *
 * @version 1.0
 * @author tarcnux
 */
public class Shop {

    public static void main(String[] args) {
        
        ProductManager pm = new ProductManager(Locale.UK);
        
        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.65), 
                Rating.NOT_RATED);
        pm.printProductReport(p1);
        
        p1 = pm.reviewProduct(101, Rating.FOUR_STAR, "Chá do bão moço!");
        p1 = pm.reviewProduct(101, Rating.TWO_STAR, "Duas estrelas");
        p1 = pm.reviewProduct(101, Rating.ONE_STAR, "Uma estrela");
        p1 = pm.reviewProduct(101, Rating.FIVE_STAR, "Cinco estrelas");
        p1 = pm.reviewProduct(101, Rating.FIVE_STAR, "Mais Cinco estrelas");
        p1 = pm.reviewProduct(101, Rating.THREE_STAR, "Três estrelas");
        pm.printProductReport(101);
        
        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        p2 = pm.reviewProduct(102, Rating.THREE_STAR, "Coffe was ok");
        p2 = pm.reviewProduct(102, Rating.ONE_STAR, "Where is the milk");
        p2 = pm.reviewProduct(102, Rating.FIVE_STAR, "It's perfeect with then spoon of sugar");
        pm.printProductReport(102);
        
        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.NOT_RATED, LocalDate.now().plusDays(2));
        p3 = pm.reviewProduct(103, Rating.FIVE_STAR, "Very nice Cake");
        p3 = pm.reviewProduct(103, Rating.FOUR_STAR, "It is good, but I've expected more chocolate");
        p3 = pm.reviewProduct(103, Rating.FIVE_STAR, "This cake is perfect");
        pm.printProductReport(103);
                

    }

}
