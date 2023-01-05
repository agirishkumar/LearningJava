import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases: ");
        int testcases = sc.nextInt();
        while (testcases > 0) {
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            System.out.println("Enter the integer elements: ");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Entered array is a palindrome? : " + isPalindrome(arr));
            testcases--;

        }
    }

    private static boolean isPalindrome(int[] arr) {
        return isPalindrome(arr, 0,arr.length-1);
    }

    private static boolean isPalindrome(int[] arr, int left, int right) {
        if(left >= right)
        {
            return true;
        }

        if(arr[left] == arr[right]){
            return isPalindrome(arr,left+1,right-1);
        }
        return false;
    }
}
