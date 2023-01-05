import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while (testcases > 0) {
            System.out.println("enter the number: ");
            int n = sc.nextInt();
            System.out.println("Number of digits in the number: " + getDigitsCount(n));
            testcases--;

        }
    }

    private static int getDigitsCount(int n) {
        int remainder = n;
        if(remainder == 0){
            return 0;
        }

        return 1+getDigitsCount(remainder/10);


    }
}
