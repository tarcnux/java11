package br.com.tarcnux.ProductManagement.data;

/**
 * 28/03/2021
 *
 * @author tarcnux
 */

@FunctionalInterface
public interface Rateable<T> {

    // Variáveis em interface são aceitas desde que sejam final
    // ou seja, constantes.
    public static final Rating DEFAULT_RATING = Rating.NOT_RATED;

    // Uma interface funcional, permite apenas um método por interface
    T applyRating(Rating rating);

    // Métodos default não são obrigatórios serem implementados
    // por isso são permitidos mesmo em uma interface funcional
    public default T applyRating(int stars) {
        return applyRating(Rateable.convert(stars));
    }

    public default Rating getRating() {
        return DEFAULT_RATING;
    }

    // Método estático também é permitido na interface, pois não é necessário
    // instanciar
    public static Rating convert(Integer stars) {
        return (stars >= 0 && stars <= 5)
                ? Rating.values()[stars]
                : DEFAULT_RATING;
    }
}
