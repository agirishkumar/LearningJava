import java.util.Scanner;
/* Compute all combinations of the values a, b, and c (each starting from 1 and less than
100) for which the following formula holds: a^2+b^2 = c^2  */
public class Combinatrics {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while (testcases > 0) {
            System.out.println("Enter a max number n: ");
            int n = sc.nextInt();
            getCombinations(n);
            testcases--;

        }
    }

    private static void getCombinations(int n) {
        for (int a = 1; a < n; a++)
        {
            for (int b = 1; b < n; b++)
            {
                int c = (int) Math.sqrt(a * a + b * b);
                if (c < 100 && a * a + b * b == c * c)
                {
                    System.out.println("a = " + a + "  b = " + b + "  c = " + c);
                }
            }
        }
    }
}
