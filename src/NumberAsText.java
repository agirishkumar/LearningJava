import java.util.Map;
import java.util.Scanner;

public class NumberAsText {

    static String numberastext(int n){
        String value = "";
        while (n>0){
            String text = digittoText(n%10);
            value = text + " " + value;
            n = n/10;
        }


        return value;
    }

    static Map<Integer,String> valueTotextMap = Map.of(0,"Zero",1,"One",2,"Two",3,"Three",
            4,"Four",5,"Five",6,"Six",7,"Seven",8,"Eight",9,"Nine");
     static String digittoText(int i) {
        return  valueTotextMap.get(i%10);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while(testcases>0)

        {
            System.out.println("Enter an integer n: ");
            int n = sc.nextInt();
            System.out.println( n + " in words: " + numberastext(n));
            testcases--;
        }
    }
}
