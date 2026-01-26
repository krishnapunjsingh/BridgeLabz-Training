import java.io.*;

public class StudentDataStream {

    public static void main(String[] args) {

        String fileName = "students.dat";

        try (
                DataOutputStream dos =
                        new DataOutputStream(new FileOutputStream(fileName))
        ) {

            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(3.8);

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.5);

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing student data.");
        }

        try (
                DataInputStream dis =
                        new DataInputStream(new FileInputStream(fileName))
        ) {

            while (dis.available() > 0) {
                int rollNo = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println(
                        "Roll No: " + rollNo +
                        ", Name: " + name +
                        ", GPA: " + gpa
                );
            }

        } catch (IOException e) {
            System.out.println("Error reading student data.");
        }
    }
}
