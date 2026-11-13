import java.util.Scanner;
public class task5 {

    static Scanner input = new Scanner(System.in);

    public static void showWelcome() {
        System.out.println("Welcome to my Program");
    }

    public static int readNumber() {
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        return n;
    }

    public static void printSquare(int n) {
        System.out.println("Square = " + (n * n));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        showWelcome();

        int num1 = readNumber();
        int num2 = readNumber();

        printSquare(num1);

        System.out.println("Sum = " + add(num1, num2));
    }
}
