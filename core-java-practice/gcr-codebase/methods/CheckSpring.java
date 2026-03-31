
import java.util.Scanner;

public class CheckSpring {
    public static boolean checkSpring(int m, int d){
        if((m==3 && d >=20)||m==4||m==5||(m==6&&d<=20)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if(checkSpring(month, day)){
            System.out.println("Its a Spring Season");
        }
        else{
            System.out.println("Not a spring seasons");
        }

    }
}
