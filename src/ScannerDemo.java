import java.util.Scanner;
public class ScannerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String input
        String name = sc.nextLine();

        // Character input
        char gender = sc.next().charAt(0);

        // numerical input
        int age = sc.nextInt();
        long mnumber = sc.nextLong();
        double gpa = sc.nextDouble();

        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mnumber);
        System.out.println("GPA: "+ gpa);


    }
}
