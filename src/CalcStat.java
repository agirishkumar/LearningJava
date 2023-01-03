import java.util.Scanner;

/*
  Find the number as well as the sum of natural numbers, which are divisible by 2 or 7 up
to a given maximum value (exclusive) and output it to the console. Write method void
calcSumAndCountAllNumbersDivBy_2_Or_7(int). Extend it so that it returns the two
values instead of performing the console output.

 */
public class CalcStat {

    public static void calcsum(int m){
        int x = 2;
        int sum = 0;
        while(x<m){
            if (x%2 == 0 || x%7 == 0){
                System.out.println(x + " ");
                sum = sum+x;
            }
            x++;
        }
        System.out.println("sum of the numbers: "+ sum);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while(testcases>0){
            System.out.println("Enter the max integer m: ");
            int m = sc.nextInt();
            calcsum(m);
            testcases--;
        }

    }
}
