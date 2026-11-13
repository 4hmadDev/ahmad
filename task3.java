import java.util.Scanner;

public class task3 {
public static void printLine(char ch, int n)
{
    System.out.print(String.valueOf(ch).repeat(n));
}
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a character: ");
    char ch = input.next().charAt(0);

    System.out.print("How many times the character should be repeated: ");
    int n = input.nextInt();

    printLine(ch, n);


}
}