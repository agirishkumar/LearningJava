import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while (testcases > 0) {
            System.out.println("enter the string to find its permuatations: ");
            String str = sc.next();
            System.out.println("Possible permutations are:  " + calcPermutations(str));
            testcases--;

        }
    }

    private static Set<String> calcPermutations(String str) {
        if(str.isEmpty() || str.length() == 1){
            return Set.of(str);
        }

        Set<String> combinations = new HashSet<>();
        for(int i=0;i<str.length();i++){
            String newFirst = "" + str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            Set<String> permutations = calcPermutations(newstr);
            for (String perm : permutations){
                combinations.add(newFirst+perm);
            }
        }
        return combinations;
    }
}
