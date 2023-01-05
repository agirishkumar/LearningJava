import java.util.Scanner;
/* Create method int calcChecksum(String) that performs the following position-based
calculation for the checksum of a number of any length given as a string, with the n digits
modeled as z1 to zn:


 */
public class Checksum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while (testcases > 0) {
            System.out.println("Enter an integer as string n: ");
            String n = sc.next();
            System.out.println("checksum of "+n+ " is: "+ calcChecksum(n));

            testcases--;

        }
    }

    private static int calcChecksum(String n) {
        int sum = 0;
        for(int i=0;i<n.length();i++){
            sum = sum + (i+1)*Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        System.out.println("sum: " + sum);
        return sum%10;
    }
}
