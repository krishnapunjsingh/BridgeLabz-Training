public class NastedTryCatchBlock {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60};
        int index = 2;
        // index = 10;
        int divisior = 0;
        try {
            try {
                int value = arr[index];
                int result = value/divisior;
                System.out.println("Result: " + result);
                
            } catch(ArithmeticException e) {
                System.out.println("cannot devided by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index!");
        }
    }
}
