import java.io.*;

public class ChatApplication {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter message: ");
            String message = reader.readLine();
            System.out.println("Message received: " + message);
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
