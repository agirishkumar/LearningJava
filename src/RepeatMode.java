import java.util.Scanner;

public class RepeatMode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean isOnLoop = true;

        while (isOnLoop){
            System.out.println("Playing current song");
            System.out.println("Would u like to change the song? ");
            String userinput =input.next();
            if (userinput.equals("yes")){
                isOnLoop = false;
            }
        };
        System.out.println("Playing next song");

    }
}
