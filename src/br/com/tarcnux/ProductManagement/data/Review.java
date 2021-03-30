
package br.com.tarcnux.ProductManagement.data;

/**
 * 30/03/2021
 * @author tarcnux
 */
public class Review {
    
    private final Rating rating;
    private final String comments;

    public Review(Rating rating, String comments) {
        this.rating = rating;
        this.comments = comments;
    }

    public Rating getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Review{" + "rating=" + rating + ", comments=" + comments + '}';
    }
    
}
