public class SamAvg {
    public static void main(String[] args) {
        double physics = 95;
        double maths = 94;
        double chemistry = 96;
        double totalMarks = physics + maths + chemistry;
        double percentage = (totalMarks / 300.0) * 100;
        System.out.println("Sam's average mark in PCM is " + percentage );
    }
}
