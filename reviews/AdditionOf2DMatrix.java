import java.util.Scanner;
class AdditionOf2DMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr1 = new int[3][3];
        int [][] arr2 = new int[3][3];
        int [][] ans = new int[3][3];
        System.out.println("enter the element of arr1");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the element of arr2");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                ans[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("ans is");
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}