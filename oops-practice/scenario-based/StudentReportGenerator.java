import java.util.ArrayList;

public class StudentReportGenerator {

    static class InvalidMarkException extends Exception {
        InvalidMarkException(String msg) {
            super(msg);
        }
    }

    static class Student {
        String name;
        String[] subjects;
        int[] marks;

        Student(String name, String[] subjects, int[] marks)
                throws InvalidMarkException {

            this.name = name;
            this.subjects = subjects;
            this.marks = marks;

            validateMarks();
        }

        void validateMarks() throws InvalidMarkException {
            for (int m : marks) {
                if (m < 0 || m > 100) {
                    throw new InvalidMarkException(
                        "Marks must be between 0 and 100"
                    );
                }
            }
        }

        double calculateAverage() {
            int sum = 0;
            for (int m : marks) {
                sum += m;
            }
            return (double) sum / marks.length;
        }

        String getGrade(double avg) {
            if (avg >= 80)
                return "A";
            else if (avg >= 60)
                return "B";
            else if (avg >= 40)
                return "C";
            else
                return "Fail";
        }

        void displayReport() {
            System.out.println("\n-------------------------");
            System.out.println("Name: " + name);
            System.out.println("Subject-wise Marks:");

            for (int i = 0; i < subjects.length; i++) {
                System.out.println(subjects[i] + ": " + marks[i]);
            }

            double avg = calculateAverage();
            System.out.println("Average: " + avg);
            System.out.println("Grade: " + getGrade(avg));
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        String[] subjects = {"Maths", "Science", "English"};

        try {
            studentList.add(new Student(
                "Krishnam",
                subjects,
                new int[]{85, 78, 90}
            ));

            studentList.add(new Student(
                "Amit",
                subjects,
                new int[]{60, 55, 70}
            ));

            studentList.add(new Student(
                "Wrong",
                subjects,
                new int[]{90, 120, 80}
            ));

        } catch (InvalidMarkException e) {
            System.out.println(e.getMessage());
        }

        for (Student s : studentList) {
            s.displayReport();
        }
    }
}
