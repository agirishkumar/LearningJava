import java.util.Scanner;

public class NumbersSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while (testcases > 0) {
            System.out.println("find the sum to n natural numbers: ");
            int n = sc.nextInt();
            System.out.println(numbersSum(n));
            testcases--;

        }
    }

    private static int numbersSum(int n) {
        if(n<1)
            throw new IllegalArgumentException("n cant be less than zero");
        if(n==1){
            return 1;
        }
        return n + numbersSum(n-1);
    }
}
