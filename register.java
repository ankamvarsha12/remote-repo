import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class register {

    // Simulated user database (username -> password)
    private static Map<String, String> userDatabase = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registration Page ===");
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        if (registerUser(username, password, confirmPassword)) {
            System.out.println("Registration successful! You can now log in.");
        } else {
            System.out.println("Registration failed. Please try again.");
        }

        scanner.close();
    }

    public static boolean registerUser(String username, String password, String confirmPassword) {
        if (username == null || username.trim().isEmpty()) {
            System.out.println("Error: Username cannot be empty.");
            return false;
        }

        if (password == null || password.length() < 6) {
            System.out.println("Error: Password must be at least 6 characters.");
            return false;
        }

        if (!password.equals(confirmPassword)) {
            System.out.println("Error: Passwords do not match.");
            return false;
        }

        if (userDatabase.containsKey(username)) {
            System.out.println("Error: Username already exists.");
            return false;
        }

        userDatabase.put(username, password);
        System.out.println("User '" + username + "' registered successfully.");
        return true;
    }
}
