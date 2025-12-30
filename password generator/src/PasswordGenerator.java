import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        // Pool of characters for password
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter password length: ");
        int length = sc.nextInt(); // User input for password length

        String password = "";

        // Generate password
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length()); // Random index
            password = password + chars.charAt(index); // Append character
        }

        System.out.println("Generated Password: " + password);
    }
}