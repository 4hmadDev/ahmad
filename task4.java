import java.util.Scanner;
import java.lang.Math;

public class task4{
public static double area(double r)
{
    double result = Math.PI * Math.pow(r, 2);
        return Math.round(result * 100) / 100.0;
}

public static double circumference(double r)
{
    double result = 2 * Math.PI * r;
        return Math.round(result * 100) / 100.0;
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a radius: ");
    double r = input.nextDouble();

    System.out.println("Area of Circle = " + area(r));
    System.out.println("Circumference of Circle = " + circumference(r));
}
}
