public class MiltipleCatchBlock {
    public static void printValueAtIndex(int [] arr, int index){
        try {
            int value = arr[index];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
        catch(NullPointerException e){
            System.out.println("Array is not initailized !");
        }
    }
    public static void main(String[] args) {
        int [] arr = {12, 23,13,14,50,38};
        int index = 2;
        // index = 10;
        // arr = null;
        printValueAtIndex(arr, index);
    }
}
