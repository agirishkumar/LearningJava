import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world from Girish!");
        String StudentFirstName = "Girish";
        String StudentLastName = "Kumar";
        char StudentFirstInitial = StudentFirstName.charAt(0);
        char StudentLastInitial = StudentLastName.charAt(0);
        int StudentAge = 15;
        double StudentGpa = 9.33;
        boolean StudentHasattendance = true ;


        System.out.println(StudentFirstName);
        System.out.println(StudentLastName);
        System.out.println(StudentFirstName+" " +StudentLastName);
        System.out.println(StudentAge);
        System.out.println(StudentGpa);
        System.out.println(StudentFirstInitial);
        System.out.println(StudentLastInitial);
        System.out.println(StudentHasattendance);
        System.out.println("Enter the new Gpa: ");
        Scanner input = new Scanner(System.in);
        StudentGpa = input.nextDouble();
        System.out.println("New GPA is :" + StudentGpa);



    }
}
