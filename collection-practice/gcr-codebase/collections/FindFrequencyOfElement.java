
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindFrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("enter the no of element in list: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        System.out.println("Original list " + list);
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }
        for(String ele : map.keySet()){
            System.out.println("frequency of " + ele + " is " + map.get(ele));
        }
    }
}
