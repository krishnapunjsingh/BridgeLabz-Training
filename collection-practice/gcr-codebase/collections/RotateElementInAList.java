
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateElementInAList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("enter the no of element in list: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Original list " + list);
        System.out.println("enter the position by which you want to rotate: ");
        int k = sc.nextInt();
        k = k%n;
        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(list.subList(n-k, n));
        rotated.addAll(list.subList(0, n-k));
        System.out.println(rotated);

    }
}
