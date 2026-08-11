import java.util.Scanner;

public class login {

    // Simulated stored credentials
    private static final String STORED_USERNAME = "admin";
    private static final String STORED_PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Login Page ===");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        scanner.close();
    }

    public static boolean authenticate(String username, String password) {
        return STORED_USERNAME.equals(username) && STORED_PASSWORD.equals(password);
    }
}
