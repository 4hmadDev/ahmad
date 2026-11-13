import java.util.Scanner;
import java.lang.Math;
public class main {
    public static int square(int n)
    {
            return n * n;    
        }
    public static int cube(int n)
     {
        return n * n * n;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println("Square of " + n + " is " + square(n));
        System.out.println("Cube of " + n + " is " + cube(n));
    }        
}
