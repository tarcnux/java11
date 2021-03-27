
package br.com.tarcnux.ProductManagement.data;

/**
 *
 * @author tarcnux
 */
public enum Rating {
    NOT_RATED("\u2606\u2606\u2606\u2606\u2606"),
    ONE_STAR("\u2605\u2606\u2606\u2606\u2606"),
    TWO_STAR("\u2605\u2605\u2606\u2606\u2606"),
    THREE_STAR("\u2605\u2605\u2605\u2606\u2606"),
    FOUR_STAR("\u2605\u2605\u2605\u2605\u2606"),
    FIVE_STAR("\u2605\u2605\u2605\u2605\u2605");
    private final String stars;

    private Rating(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }

}
