public class AutoBoxing {
    public static void main(String[] args) {
        Integer x = 400, y = 400;
        if(x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        /* In Java, values from -128 to 127 are cached, so the same objects are returned. The implementation of valueOf() uses cached objects if the value is between -128 to 127.
         */

         Integer a =20,b=20;

        if(a == b)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        int x1 = 400, y1 = 400;
        if(x1 == y1)
            System.out.println("Same");
        else
            System.out.println("Not Same");

    }
}
