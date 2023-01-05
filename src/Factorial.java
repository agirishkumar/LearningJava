import java.util.Scanner;

public class Factorial {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while (testcases > 0) {
            System.out.println("Enter the number to calculate factorial: ");
            int n = sc.nextInt();
            System.out.println(factorial(n));
            testcases--;

        }
    }

    private static int factorial(int n) {

        if(n<0)
            throw new IllegalArgumentException("n cant be less than zero");
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
