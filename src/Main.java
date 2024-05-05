import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//exception = an event that disrupts the programs flow of instructions
try {

    System.out.println("Enter whole number to divide: ");
    int x = scanner.nextInt();

    System.out.println("Enter whole number to divide by: ");
    int y = scanner.nextInt();

    int z = x / y;

    System.out.println("result " + z);
}
    catch (ArithmeticException e) {
    System.out.println("You can't divide by zero idiot");

}
catch (InputMismatchException e) {
    System.out.println("PLEASE ENTER A NUMBER OMFG YOU IDIOT");
}
catch (Exception e) {
    System.out.println("Something went wrong :(");
}
finally {
    System.out.println("This will always prints (ignore this)");
    scanner.close();

}

    }
}