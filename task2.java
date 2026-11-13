import java.util.Scanner;
import java.lang.Math;

public class task2 {
    public static double hypo (double a, double b)
    {
        return Math.pow(a,2) + Math.pow(b,2);
    }
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        double a = input.nextDouble();

    System.out.print("Enter another Number: ");
    double b = input.nextDouble();

System.out.println("Hypotenuse = " + hypo(a, b));   

}
}