public class FormattedOutputPrintf {

    public static void main(String[] args) {
        int x =100;
        System.out.printf("printing integer: x = %d\n", x);
        System.out.printf("printing with precision: Pi = %.2f\n", Math.PI);
        float n = 5.2f;
        n = 2324435.3f;
        System.out.printf("Formatted to right margin: n = %20.4f\n", n);

    }
}
