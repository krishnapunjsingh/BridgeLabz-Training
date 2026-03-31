public class CinemaMain {

    public static void main(String[] args) {

        CinemaManager manager = new CinemaManager();

        try {
            manager.addMovie("Inception", "18:30");
            manager.addMovie("Interstellar", "21:00");
            manager.addMovie("Avatar", "25:99"); // Invalid time
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAll Movies:");
        manager.displayAllMovies();

        System.out.println("\nSearch Result:");
        manager.searchMovie("inter");

        manager.generateReport();
    }
}
