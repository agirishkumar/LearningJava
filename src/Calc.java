/*
* Write method int calc(int, int) that multiplies two variables, m and n of type int,
then divides the product by two, and outputs the remainder with respect to division by 7
*
*  */

import java.util.Scanner;

public class Calc {

    public static int calc(int n , int m){
        return (n*m/2)%7;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while(testcases>0){
            System.out.println("Enter the integer n: ");
            int n = sc.nextInt();
            System.out.println("Enter the integer m: ");
            int m = sc.nextInt();
            System.out.println("result: " + calc(n,m));
            testcases--;
        }


    }
}
