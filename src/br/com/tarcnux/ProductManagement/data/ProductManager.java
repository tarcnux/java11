package br.com.tarcnux.ProductManagement.data;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 *
 * @author tarcnux
 */
public class ProductManager {

    private Locale locale;
    private ResourceBundle resources;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;
    
    private Map<Product, List<Review>> products = new HashMap<>();

//    private Product product;
//    private Review[] reviews = new Review[5];

    public ProductManager(Locale locale) {
        this.locale = locale;
        resources = ResourceBundle.getBundle("br.com.tarcnux.ProductManagement.data.resources", locale);
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);
    }

    public Product createProduct(Integer id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        Product product = new Food(id, name, price, rating, bestBefore);
        products.putIfAbsent(product, new ArrayList<>());
        return product;
    }

    public Product createProduct(Integer id, String name, BigDecimal price, Rating rating) {
        Product product = new Drink(id, name, price, rating);
        products.putIfAbsent(product, new ArrayList<>());
        return product;
    }

    public Product reviewProduct(Product product, Rating rating, String comments) {

        List<Review> reviews = products.get(product);
        products.remove(product, reviews);
        reviews.add(new Review(rating, comments));
        
        int sum = 0;
        
        for (Review review: reviews) {
            sum += review.getRating().ordinal();
        }
        
        product = product.applyRating(Rateable.convert(
                Math.round((float) sum / reviews.size())));
        products.put(product, reviews);
        return product;
    }

    public void printProductReport(Product product) {
        //Pega no HashMap a lista de reviews dado o produto
        List<Review> reviews = products.get(product);
        StringBuilder txt = new StringBuilder();
        txt.append(MessageFormat.format(resources.getString("product"),
                product.getName(),
                moneyFormat.format(product.getPrice()),
                product.getRating().getStars(),
                dateFormat.format(product.getBestBefore())
        ));
        txt.append('\n');
        for (Review review : reviews) {
            txt.append(MessageFormat.format(resources.getString("review"),
                    review.getRating().getStars(),
                    review.getComments()));
            txt.append('\n');
        }
        if (reviews.isEmpty()) {
            txt.append(resources.getString("no.reviews"));
            txt.append('\n');
        }
        System.out.println(txt);
    }
}
