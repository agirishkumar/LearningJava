import java.util.Scanner;

/*  Write method List<Integer> calcPrimesUpTo(int) to compute all prime numbers up
to a given value  */
public class PrimeNumbers {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while (testcases > 0) {
            System.out.println("Enter an integer n: ");
            int n = sc.nextInt();
            getPrimes(n);

            testcases--;

        }
    }

    private static void getPrimes(int n) {
        for(int i=2; i<n;i++){
            if (checkprime(i) == true){
                System.out.print(i+ " ");
            }
        }
    }

    private static boolean checkprime(int i) {
        int count =0;
        for (int k=1;k<= Math.sqrt(i);k++){
            if (i%k==0){
                count++;
            }
        }
        if(count == 1){
            return true;
        }
        else{
            return false;
        }
    }
}