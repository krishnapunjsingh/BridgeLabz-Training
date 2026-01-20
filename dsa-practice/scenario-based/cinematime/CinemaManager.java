import java.util.ArrayList;
import java.util.List;

public class CinemaManager {

    private List<String> movieTitles = new ArrayList<>();
    private List<String> showTimes = new ArrayList<>();

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        movieTitles.add(title);
        showTimes.add(time);
    }

    public void searchMovie(String keyword) {
        boolean found = false;

        for (int i = 0; i < movieTitles.size(); i++) {
            if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                try {
                    System.out.println(
                        String.format("Movie: %s | Time: %s",
                                movieTitles.get(i),
                                showTimes.get(i))
                    );
                    found = true;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Showtime missing for index: " + i);
                }
            }
        }

        if (!found) {
            System.out.println("No movies found for keyword: " + keyword);
        }
    }

    public void displayAllMovies() {
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println(
                "Movie: " + movieTitles.get(i) +
                " | Time: " + showTimes.get(i)
            );
        }
    }

    public void generateReport() {
        String[] titlesArray = movieTitles.toArray(new String[0]);
        String[] timesArray = showTimes.toArray(new String[0]);

        System.out.println("\n--- Printable Movie Report ---");
        for (int i = 0; i < titlesArray.length; i++) {
            System.out.println(titlesArray[i] + " @ " + timesArray[i]);
        }
    }

    private boolean isValidTime(String time) {
        if (!time.matches("\\d{2}:\\d{2}")) return false;

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
    }
}
