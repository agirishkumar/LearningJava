import java.util.Scanner;

public class PrimePairs {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while (testcases > 0) {
            System.out.println("Enter an integer n: ");
            int n = sc.nextInt();
            System.out.println("Twin Primes: ");
            getTwinPrimes(n);
            System.out.println("Cousin Primes: ");
            getCousinPrimes(n);
            System.out.println("Sexy Primes: ");
            getSexyprimes(n);

            testcases--;

        }
    }

    private static void getSexyprimes(int n) {
        for(int i=2;i<n-6;i++){
            if(checkPrime(i) && checkPrime(i+6) == true){
                System.out.print(i + " ");
                System.out.print(i+6);
                System.out.println();
            }
        }
    }

    private static void getCousinPrimes(int n) {
        for(int i=2;i<n-4;i++){
            if(checkPrime(i) && checkPrime(i+4) == true){
                System.out.print(i + " ");
                System.out.print(i+4);
                System.out.println();
            }
        }
    }

    private static boolean checkPrime(int i) {
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

    private static void getTwinPrimes(int n) {
        for(int i=2;i<n-2;i++){
            if(checkPrime(i) && checkPrime(i+2) == true){
                System.out.print(i + " ");
                System.out.print(i+2);
                System.out.println();
            }
        }
    }

}
