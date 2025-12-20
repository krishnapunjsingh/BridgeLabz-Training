
import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int [] age = new int[3];        
        int [] height = new int[3];    
        for(int i=0;i<3;i++){
            System.out.print("Enter the age and height of "+ names[i]);
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }    
        int youngAgeIndex = 0;
        int tallHeightTndex = 0;
        for(int i=0;i<3;i++){
            if(age[i] < age[youngAgeIndex]){
                youngAgeIndex = i;
            }
            if(height[i] > height[tallHeightTndex]){
                tallHeightTndex = i;
            }
        }
        System.out.println("Youngest Friend: " + names[youngAgeIndex]);
        System.out.println("Tallest Friend: " + names[tallHeightTndex]);
    }
}
