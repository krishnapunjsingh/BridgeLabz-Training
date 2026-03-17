import java.util.*;

public class VersionControlledStorageSystem {

    static Map<String, Map<String, Integer>> storage = new HashMap<>();
    static Map<String, List<String>> order = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String[] input = sc.nextLine().split(" ");
            String op = input[0];

            switch (op) {

                case "UPLOAD":
                    upload(input[1], input[2], Integer.parseInt(input[3]));
                    break;

                case "FETCH":
                    fetch(input[1]);
                    break;

                case "LATEST":
                    latest(input[1]);
                    break;

                case "TOTAL_STORAGE":
                    totalStorage(input[1]);
                    break;
            }
        }
    }

    static void upload(String file, String version, int size) {
        storage.putIfAbsent(file, new HashMap<>());
        order.putIfAbsent(file, new ArrayList<>());

        // Ignore if version already exists
        if (storage.get(file).containsKey(version)) return;

        storage.get(file).put(version, size);
        order.get(file).add(version);
    }

    static void fetch(String file) {
        if (!storage.containsKey(file)) {
            System.out.println("File Not Found");
            return;
        }

        List<String> versions = new ArrayList<>(storage.get(file).keySet());

        // Sort by size, then version lexicographically
        Collections.sort(versions, (a, b) -> {
            int sizeA = storage.get(file).get(a);
            int sizeB = storage.get(file).get(b);

            if (sizeA != sizeB) return sizeA - sizeB;
            return a.compareTo(b);
        });

        for (String v : versions) {
            System.out.println(file + " " + v + " " + storage.get(file).get(v));
        }
    }

    static void latest(String file) {
        if (!order.containsKey(file) || order.get(file).isEmpty()) {
            System.out.println("File Not Found");
            return;
        }

        List<String> versions = order.get(file);
        String latestVersion = versions.get(versions.size() - 1);

        System.out.println(file + " " + latestVersion + " " +
                storage.get(file).get(latestVersion));
    }

    static void totalStorage(String file) {
        if (!storage.containsKey(file)) {
            System.out.println("File Not Found");
            return;
        }

        int total = 0;
        for (int size : storage.get(file).values()) {
            total += size;
        }

        System.out.println(file + " " + total);
    }
}