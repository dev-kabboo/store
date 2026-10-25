import java.util.Scanner;

public class MyStore {
    public static void main(String[] args) {
        // Store Introduction
        System.out.println("Welcome to my Store");
                Scanner sc = new Scanner(System.in);

                System.out.println("Which product do you want?");
                System.out.print("Your choice: ");
                String demand1 = sc.nextLine();
                System.out.println("Wait a minuet...\nHere is your " + demand1 + ".");
                System.out.println("Thank you for coming. See you again.");
                sc.close();
    }
}
