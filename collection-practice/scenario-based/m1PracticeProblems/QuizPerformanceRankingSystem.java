import java.util.*;

class Student {
    String name, dept;
    int q1, q2, q3;

    Student(String name, String dept, int q1, int q2, int q3) {
        this.name = name;
        this.dept = dept;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
    }

    int total() {
        return q1 + q2 + q3;
    }
}

public class QuizPerformanceRankingSystem {

    static List<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String[] input = sc.nextLine().split(" ");

            if (input[0].equals("Record")) {
                String name = input[1];
                String dept = input[2];
                int q1 = Integer.parseInt(input[3]);
                int q2 = Integer.parseInt(input[4]);
                int q3 = Integer.parseInt(input[5]);

                list.add(new Student(name, dept, q1, q2, q3));
                System.out.println("Record Added: " + name);
            }

            else if (input[0].equals("Top")) {

                if (list.isEmpty()) {
                    System.out.println("No Records Available");
                    continue;
                }

                String key = input[1];

                if (key.equals("Q1") || key.equals("Q2") || key.equals("Q3")) {
                    topQuiz(key);
                } else {
                    topDepartment(key);
                }
            }
        }
    }

    static void topDepartment(String dept) {
        int max = -1;
        boolean found = false;

        for (Student s : list) {
            if (s.dept.equals(dept)) {
                found = true;
                max = Math.max(max, s.total());
            }
        }

        if (!found) {
            System.out.println("Department Not Found");
            return;
        }

        for (Student s : list) {
            if (s.dept.equals(dept) && s.total() == max) {
                System.out.println(s.name + " " + max);
            }
        }
    }

    static void topQuiz(String quiz) {
        int max = -1;

        // find max
        for (Student s : list) {
            if (quiz.equals("Q1")) max = Math.max(max, s.q1);
            else if (quiz.equals("Q2")) max = Math.max(max, s.q2);
            else if (quiz.equals("Q3")) max = Math.max(max, s.q3);
        }

        // print all with max (in order)
        for (Student s : list) {
            if ((quiz.equals("Q1") && s.q1 == max) ||
                (quiz.equals("Q2") && s.q2 == max) ||
                (quiz.equals("Q3") && s.q3 == max)) {

                int score = (quiz.equals("Q1")) ? s.q1 :
                            (quiz.equals("Q2")) ? s.q2 : s.q3;

                System.out.println(s.name + " " + score);
            }
        }
    }
}