public class DividePen {
    public static void main(String[] args) {
        int totalpens = 14;
        int students = 3;
        int perStudent = totalpens / students; 
        int remaining = totalpens % students;
        System.out.println("The Pen Per Student is " + perStudent + " and The remaining Pen not distributed is " + remaining);

    }
}
