import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//exception = an event that disrupts the programs flow of instructions
try {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter whole number to divide: ");
    int x = scanner.nextInt();

    System.out.println("Enter whole number to divide by: ");
    int y = scanner.nextInt();

    int z = x / y;

    System.out.println("result" + z);
}
    catch (ArithmeticException e) {
    System.out.println("You can't divide by zero idiot");

}
    }
}