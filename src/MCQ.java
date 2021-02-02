import java.util.Scanner;

public class MCQ {
    public static void main(String[] args) {
        String Question = "What is the name of our country";
        String choice1 = "japan";
        String choice2 = "india";
        String choice3 = "egypt";
        String correctanswer = choice2;
        System.out.println(Question);
        System.out.println(choice1);
        System.out.println(choice2);
        System.out.println(choice3);
        Scanner input = new Scanner(System.in);
        String useranswer = input.next();
        if (correctanswer.equals(useranswer.toLowerCase())){
            System.out.println("Congratulations");
        }
        else {
            System.out.println("Incorrect answer");
            System.out.println("correct answer to the question is: "+correctanswer);
        }


    }
}
