import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class JsonCsvConverter {

    // Inner Student class (non-public, works in single file)
    static class Student {
        public int id;
        public String name;
        public int age;
        public int marks;

        // Default constructor required for Jackson
        public Student() {}

        public Student(int id, String name, int age, int marks) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return id + "," + name + "," + age + "," + marks;
        }
    }

    // Convert JSON file to CSV
    public static void jsonToCsv(String jsonFile, String csvFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // Read JSON into list of Student objects
        List<Student> students = mapper.readValue(new File(jsonFile), new TypeReference<List<Student>>() {});

        try (FileWriter writer = new FileWriter(csvFile)) {
            // Write header
            writer.write("ID,Name,Age,Marks\n");

            // Write each student
            for (Student s : students) {
                writer.write(s.toString() + "\n");
            }
        }

        System.out.println("JSON converted to CSV: " + csvFile);
    }

    // Convert CSV file back to JSON
    public static void csvToJson(String csvFile, String jsonFile) throws IOException {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                students.add(new Student(id, name, age, marks));
            }
        }

        // Write JSON
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(jsonFile), students);

        System.out.println("CSV converted to JSON: " + jsonFile);
    }

    public static void main(String[] args) throws IOException {
        String jsonFile = "students.json";
        String csvFile = "students.csv";
        String jsonFile2 = "students_from_csv.json";

        // Convert JSON to CSV
        jsonToCsv(jsonFile, csvFile);

        // Convert CSV back to JSON
        csvToJson(csvFile, jsonFile2);
    }
}
