
package br.com.tarcnux.ProductManagement.data;

/**
 * 30/03/2021
 * @author tarcnux
 */
public class Review implements Comparable<Review> {
    
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

    /**
     * 03/04/2021
     * Compares reviews
     * @param other
     * @return int (>0, 0, <0) 
     */
    @Override
    public int compareTo(Review other) {
        return other.rating.ordinal() - this.rating.ordinal();
    }
    
}
