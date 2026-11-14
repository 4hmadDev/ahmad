import java.util.Scanner;
public class task6 {
   public static double grossPay(double hours, double rate)
   {
          return hours * rate;
   }
   public static double tax(double gross)
    {
             return gross * 0.5;
    }
public static double netPay(double hours, double rate)
    {
        double gross = grossPay(hours, rate);
        double taxAmount = tax(gross);
        return gross - taxAmount;
    }
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly rate: ");
        double rate = input.nextDouble();
        double gross = grossPay(hours, rate);
        double taxAmount = tax(gross);
        double net = netPay(hours, rate);
        System.out.println("Gross Pay = " + gross);
        System.out.println("Tax Amount = " + taxAmount);
        System.out.println("Net Pay = " + net);
}
}
