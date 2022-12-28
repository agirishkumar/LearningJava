public class ShiftOperators {

    public static void main(String[] args) {

        // Signed Right Shift Operation
        int x = -4;
        System.out.println(x>>1);

        int y = 4;
        System.out.println(y>>1);

        // Unsigned right shift operator
        int u = -4;
        System.out.println(u>>>1);

        int v = 4;
        System.out.println(v>>>1);

        // left shift operator
        int a = 6;
        System.out.println(a<<1);

        int b = -8;
        System.out.println(b << 1);
    }
}
