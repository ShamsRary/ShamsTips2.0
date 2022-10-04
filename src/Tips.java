import java.util.Scanner;
public class Tips {
    public static void main(String[] args)
    {
        System.out.println("Welocome user type in your bill.");
        Scanner input = new Scanner(System.in);
        double totalBill = input.nextDouble();

        System.out.println("Type in your Tip Percentage.");
        double tipPercentage = input.nextDouble();

        System.out.println("Type in your the amount of people in your party.");
        int totalpeople = input.nextInt();


        double totaltip = tipPercentage * totalBill * 0.01;
        double totalCost = totaltip + totalBill;
        double tipPerPerson =  totaltip/totalpeople;
        double totalPerPerson = totalCost/totalpeople;

        System.out.println("Total tip = " + totaltip);
        System.out.println("Total cost including tip = " + totalCost);
        System.out.println("Total tip for a person = " + tipPerPerson);
        System.out.println("Total cost including tip for a person = " +  totalPerPerson);
        System.out.println("Thank you for using");

    }
}