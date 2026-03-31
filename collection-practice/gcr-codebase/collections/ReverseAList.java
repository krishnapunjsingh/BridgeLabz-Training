import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ReverseAList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("enter the no of element in list: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Original list " + list);
        int start = 0;
        int end = list.size()-1;
        while(start<=end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
            
        }
        System.out.println("Reversed List" + list);
    }
}
