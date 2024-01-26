import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);
        if(num == 1) {
            System.out.println("Bingo");
        }
        else {
            System.out.println("Sorry");
        }

        scanner.close(); // Don't forget to close the Scanner when done.

    }
}