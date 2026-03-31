import java.util.Arrays;
import java.util.List;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
}

public class TrendingMovies {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.9, 2024),
            new Movie("Movie B", 9.1, 2023),
            new Movie("Movie C", 7.8, 2022),
            new Movie("Movie D", 9.3, 2024),
            new Movie("Movie E", 8.5, 2023),
            new Movie("Movie F", 9.0, 2024),
            new Movie("Movie G", 8.2, 2021)
        );

        movies.stream()
              // filter recent movies
              .filter(m -> m.releaseYear >= 2022)

              // sort by rating (high to low)
              .sorted((m1, m2) -> Double.compare(m2.rating, m1.rating))

              // take top 5
              .limit(5)

              // print result
              .forEach(m ->
                  System.out.println(m.name + " | Rating: " + m.rating + " | Year: " + m.releaseYear)
              );
    }
}
