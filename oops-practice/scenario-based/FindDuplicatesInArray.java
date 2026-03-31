import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FindDuplicatesInArray
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    List<Integer> list = new ArrayList<>();
	    int [] arr = new int[n];
	    for(int i=0;i<arr.length;i++){
	        arr[i] = sc.nextInt();
	    }
	    for(int i=0;i<arr.length;i++){
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[i] == arr[j]){
	                if(list.contains(arr[j])){
	                    continue;
	                }
	                else{
	                    list.add(arr[i]);
	                }
	            }
	        }
	    }
	   // System.out.println(list);
	   for(int element : list){
	      System.out.println(element);
	   }
	}
}
