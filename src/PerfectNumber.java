/* a natural number is called a perfect number if its value is equal to the sum
of its real divisors.

Write method List<Integer> calcPerfectNumbers(int) that calculates the perfect
numbers up to a maximum value, say 10,000.

*/

import java.util.Scanner;

public class PerfectNumber {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while(testcases>0){
            System.out.println("Enter an integer n: ");
            int n = sc.nextInt();
            getPerfectNumbers(n);
            testcases--;
        }
    }

    private static void getPerfectNumbers(int n) {
        for(int i=1;i<n;i++){
            if (checkPerfect(i) == true){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean checkPerfect(int i) {
        int sum = 0;
        for(int k=1;k<((i/2)+1);k++){
            if(i%k == 0){
                sum = sum+k;
            }
        }
        if (sum == i){
            return true;
        }
        else
            return false;
    }
}
