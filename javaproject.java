/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner; 

/**
 *
 * @author sshlo
 */
public class JavaApplication1 {
    public static final String ANSI_RESET = "\u001B[0m"; 
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";

   
    static Scanner scanner = new Scanner(System.in);
    static String fullName, age, status, gradeLevel, favoriteSubject, username, password;

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.println(ANSI_RED_BACKGROUND + "WELCOME!!!" + ANSI_RESET);
        System.out.println("CHOOSE IN THE MENU WHERE YOU WANT TO GO:");
        System.out.println("[1] LOGIN"); 
        System.out.println("[2] REGISTRATION");
        System.out.println("[0] EXIT");
        System.out.println(ANSI_RED_BACKGROUND + "ENTER THE NUMBER OF YOUR CHOICE: " + ANSI_RESET);

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 0:
                exit();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                displayMainMenu();
        }
    }

    public static void register() {
        scanner.nextLine(); // Consume newline character
        System.out.println("ENTER YOUR FULL NAME:");
        fullName = scanner.nextLine();
        System.out.println("ENTER YOUR AGE:");
        age = scanner.nextLine();
        System.out.println("ENTER YOUR STATUS:");
        status = scanner.nextLine();
        System.out.println("ENTER YOUR GRADE LEVEL:");
        gradeLevel = scanner.nextLine();
        System.out.println("ENTER YOUR FAVORITE SUBJECT:");
        favoriteSubject = scanner.nextLine();
        System.out.println("ENTER YOUR USERNAME:");
        username = scanner.nextLine();
        System.out.println("ENTER YOUR PASSWORD:");
        password = scanner.nextLine();

        System.out.println(ANSI_RED_BACKGROUND + "REGISTRATION SUCESSFULY!!!\n" + ANSI_RESET);

        displayMainMenu();
    }

    public static void login() {
        System.out.println("ENTER YOUR USERNAME (enter 0 to go back): ");
        String inputUsername = scanner.next();
        if (inputUsername.equals("0")) {
            displayMainMenu();
            return;
        }
        System.out.println("ENTER YOUR PASSWORD: ");
        String inputPassword = scanner.next();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println(ANSI_RED_BACKGROUND + "\nHOME" + ANSI_RESET);
            System.out.println("USER INFO: ");
            System.out.println("FULLNAME: " + fullName);
            System.out.println("AGE: " + age);
            System.out.println("STATUS: " + status);
            System.out.println("GRADE LEVEL: " + gradeLevel);
            System.out.println("FAVORITE SUBJECT: " + favoriteSubject);
            System.out.println("USERNAME: " + username);
            System.out.println("[0] LOGOUT");

            int choice = scanner.nextInt();
            if (choice == 0) {
                displayMainMenu();
            } else {
                System.out.println("Invalid choice. Logging out...");
                displayMainMenu();
            }
        } else {
            System.out.println("Invalid username or password. Please try again.");
            login();
        }
    }

    public static void exit() {
        System.out.println(ANSI_RED_BACKGROUND + "DO YOU WANT TO EXIT? (Y/n)" + ANSI_RESET);
        String input = scanner.next();
        if (input.equalsIgnoreCase("Y")) {
            System.out.println("THANK YOU!!!");
            System.exit(0);
        } else {
            displayMainMenu();
        }
    }
    
}
