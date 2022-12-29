import java.io.*;
public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter an Integer: ");
            int a  = Integer.parseInt(br.readLine());
            System.out.println("Enter a string: ");
            String b = br.readLine();
            System.out.printf("You have entered: " + a + " and name as " + b);
    }
}
