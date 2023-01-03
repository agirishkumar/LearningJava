import java.util.Scanner;

public class EvenOdd {

     private static boolean isEven(int n){
        if (n%2 == 0){
            return true;
        }
        else
            return false;
    }

     private static boolean isOdd(int n){
        if (n%2 == 1){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while(testcases>0){
            System.out.println("Enter an integer n: ");
            int n = sc.nextInt();
            System.out.println("Is the integer "+ n + " even ? " + isEven(n));
            System.out.println("Is the integer "+ n + " odd ? " + isOdd(n));
            testcases--;
        }
    }
}
