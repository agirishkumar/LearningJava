public class BitwiseOperations {

    public static void main(String[] args) {
        String binary[] = {
                "0000","0001","0010","0011","0100","0101",
                "0110","0111","1000","1001","1010",
                "1011","1100","1101","1110","1111"
        };
        int a = 3;
        int b = 6;

        // bitwise OR
        int c = a|b;

        // bitwise AND
        int d = a & b;

        // bitwise XOR
        int e = a ^ b;

        // bitwise not
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

        System.out.println(" a = "+binary[a]);
        System.out.println(" b = "+binary[b]);
        System.out.println(" a|b = "+binary[c]);
        System.out.println(" a&b = "+binary[d]);
        System.out.println(" a^b = "+binary[e]);
        System.out.println("~a & b|a&~b= "+binary[f]);
        System.out.println("~a= "+binary[g]);
    }
}
