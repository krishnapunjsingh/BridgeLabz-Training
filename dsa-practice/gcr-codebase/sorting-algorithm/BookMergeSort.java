import java.util.Arrays;
import java.util.Scanner;

public class BookMergeSort {
    public static void mergeSort(int [] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    private static void merge(int [] arr, int left, int mid, int right){
        int n1 = mid-left+1;
        int n2 = right-mid;
        int [] leftArr = new int[n1];
        int [] rightArr = new int[n2];
        for(int i=0;i<n1;i++){
            leftArr[i] = arr[left + i];
        }
        for(int j=0;j<n2;j++){
            rightArr[j] = arr[mid + 1 +j];
        }
        int i=0;
        int j=0;
        int k = left;
        while(i<n1 && j<n2){
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            }
            else{
                arr[k++] = rightArr[j++];
            }
        }
        while(i<n1){
            arr[k++] = leftArr[i++];
        }
        while(j<n2){
            arr[k++] = rightArr[j++];
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
