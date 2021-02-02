import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0-9: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number<5){
            System.out.println("Your friend brings you a good luck");
        }
        else {
            System.out.println("Your watch will get you good luck");
        }
    }
}
