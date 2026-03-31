import java.util.*;

// Base Class
abstract class Festival {
    String name, location;
    int date;

    Festival(String name, String location, int date) {
        this.name = name;
        this.location = location;
        this.date = date;
    }

    abstract void displayDetails();
}

// MUSIC
class MusicFestival extends Festival {
    String headliner, genre;
    int ticketPrice;

    MusicFestival(String name, String location, int date,
                  String headliner, String genre, int ticketPrice) {
        super(name, location, date);
        this.headliner = headliner;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
    }

    void displayDetails() {
        System.out.println("Festival Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Headliner: " + headliner);
        System.out.println("Music Genre: " + genre);
        System.out.println("Ticket Price: " + ticketPrice);
    }
}

// FOOD
class FoodFestival extends Festival {
    String cuisine;
    int numStalls, entryFee;

    FoodFestival(String name, String location, int date,
                 String cuisine, int numStalls, int entryFee) {
        super(name, location, date);
        this.cuisine = cuisine;
        this.numStalls = numStalls;
        this.entryFee = entryFee;
    }

    void displayDetails() {
        System.out.println("Festival Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("Number of Stalls: " + numStalls);
        System.out.println("Entry Fee: " + entryFee);
    }
}

// ART
class ArtFestival extends Festival {
    String artType;
    int numArtists, exhibitionFee;

    ArtFestival(String name, String location, int date,
                String artType, int numArtists, int exhibitionFee) {
        super(name, location, date);
        this.artType = artType;
        this.numArtists = numArtists;
        this.exhibitionFee = exhibitionFee;
    }

    void displayDetails() {
        System.out.println("Festival Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Art Type: " + artType);
        System.out.println("Number of Artists: " + numArtists);
        System.out.println("Exhibition Fee: " + exhibitionFee);
    }
}

public class EventPlannerFestivalManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Festival> map = new HashMap<>();

        while (true) {
            String line = sc.nextLine();
            String[] input = line.split(" ");

            if (input[0].equals("EXIT")) break;

            if (input[0].equals("ADD_FESTIVAL")) {
                String type = input[1];

                if (type.equals("MUSIC")) {
                    Festival f = new MusicFestival(
                            input[2], input[3], Integer.parseInt(input[4]),
                            input[5], input[6], Integer.parseInt(input[7])
                    );
                    map.put(input[2], f);
                }

                else if (type.equals("FOOD")) {
                    Festival f = new FoodFestival(
                            input[2], input[3], Integer.parseInt(input[4]),
                            input[5], Integer.parseInt(input[6]), Integer.parseInt(input[7])
                    );
                    map.put(input[2], f);
                }

                else if (type.equals("ART")) {
                    Festival f = new ArtFestival(
                            input[2], input[3], Integer.parseInt(input[4]),
                            input[5], Integer.parseInt(input[6]), Integer.parseInt(input[7])
                    );
                    map.put(input[2], f);
                }
            }

            else if (input[0].equals("DISPLAY_DETAILS")) {
                String name = input[1];

                if (map.containsKey(name)) {
                    map.get(name).displayDetails();
                }
            }
        }
    }
}