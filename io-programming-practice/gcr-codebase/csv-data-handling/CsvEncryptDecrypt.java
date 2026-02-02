import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    public int id;
    public String name;
    public String department;
    public double salary;

    public Employee() {}

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + department + "," + salary;
    }
}

public class CsvEncryptDecrypt {

    // AES key (for demo purposes, we generate one key)
    private static SecretKey secretKey;

    static {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128); // 128-bit AES
            secretKey = keyGen.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Encrypt a string
    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    // Decrypt a string
    public static String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decoded = Base64.getDecoder().decode(encryptedData);
        byte[] decrypted = cipher.doFinal(decoded);
        return new String(decrypted);
    }

    // Write CSV with encrypted salary
    public static void writeEncryptedCSV(String filePath, List<Employee> employees) throws Exception {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("ID,Name,Department,Salary\n");
            for (Employee e : employees) {
                String encryptedSalary = encrypt(String.valueOf(e.salary));
                writer.write(e.id + "," + e.name + "," + e.department + "," + encryptedSalary + "\n");
            }
        }
        System.out.println("Encrypted CSV written to: " + filePath);
    }

    // Read CSV and decrypt salary
    public static List<Employee> readEncryptedCSV(String filePath) throws Exception {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(decrypt(data[3]));
                employees.add(new Employee(id, name, department, salary));
            }
        }
        return employees;
    }

    public static void main(String[] args) throws Exception {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Krishnam", "IT", 75000));
        employees.add(new Employee(102, "Amit", "HR", 60000));
        employees.add(new Employee(103, "Riya", "Finance", 80000));

        String csvFile = "employees_encrypted.csv";

        // Write encrypted CSV
        writeEncryptedCSV(csvFile, employees);

        // Read CSV and decrypt
        List<Employee> decryptedEmployees = readEncryptedCSV(csvFile);
        System.out.println("Decrypted CSV data:");
        for (Employee e : decryptedEmployees) {
            System.out.println(e);
        }
    }
}
