import java.util.List;
import java.util.Scanner;

public class FibonnaciNumbers {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while (testcases > 0) {
            System.out.println("find the nth fibonnaci number: ");
            int n = sc.nextInt();
            System.out.println(fibonnaci(n));
            testcases--;

        }
    }

    private static int fibonnaci(int n) {
        if(n<1)
            throw new IllegalArgumentException("n cant be less than 1");
        if( n==1 || n==2){
            return 1;
        }
        return fibonnaci(n-1)+fibonnaci(n-2);
    }
}
