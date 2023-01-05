import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*  This exercise deals with three-digit Armstrong numbers. By definition, these are
numbers for whose digits x, y, and z from 1 to 9 satisfy the following equation:
x*100 + y*10+z = x^3+y^3+z^3 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while (testcases > 0) {
            System.out.println(calcArmstrongNumbers());
            testcases--;

        }
    }

    static List<Integer> calcArmstrongNumbers()
    {
        final List<Integer> results = new ArrayList<>();
        for (int x = 1; x < 10; x++)
        {
            for (int y = 1; y < 10; y++)
            {
                for (int z = 1; z < 10; z++)
                {
                    final int numericValue = x * 100 + y * 10 + z;
                    final int cubicValue = (int) (Math.pow(x, 3) +
                            Math.pow(y, 3) +
                            Math.pow(z, 3));
                    if (numericValue == cubicValue)
                        results.add(numericValue);
                }
            }
        }
        return results;
    }
}
