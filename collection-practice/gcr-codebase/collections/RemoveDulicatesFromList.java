
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDulicatesFromList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("enter the no of element in list: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Original list " + list);
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(list.get(i));
        }
        System.out.println(set);
    }
}
