import java.io.*;

public class Ternary {
    public static void main(String[] args) {

        /* the conditional operator will implement numeric type promotion
         if there are two different types as 2nd and 3rd operand. */

        Object obj1 = true ? new Integer(4) : new Float(2.0f);
        System.out.println(obj1);

        Object obj2;
        if (true)
            obj2 = new Integer(4);
        else
            obj2 = new Float(2.0f);

        System.out.println(obj2);
    }
}
