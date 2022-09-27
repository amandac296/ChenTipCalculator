import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //user input
        System.out.println("Welcome to the tip calculator!");

        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        //Cost of each item
        double itemCost = 0;
        double itemCost1 = 0;
        double totalCost = 0;
        while (itemCost > -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.40 (type -1 to end): $" );
            itemCost = scan.nextDouble();
            totalCost = itemCost + itemCost1;
            itemCost1 = totalCost;
        }

        //Total Tip
        totalCost= totalCost + 1;
        double totalTip = (tipPercentage * 0.01) * totalCost;
        //Total Bill With Tip
        double totalBill= totalCost + totalTip;
        //per person cost before tip
        double costPerPerson = totalCost/numPeople;
        //tip per person
        double tipPerPerson = totalTip/numPeople;
        //total per person
        double BillPerPerson = costPerPerson + tipPerPerson;

        //output and results of required information after user input
        System.out.println("---------------------");
        System.out.println("Total Bill Before Tip: $" + formatter.format(totalCost));
        System.out.println("Tip Percentage: $" + formatter.format(tipPercentage));
        System.out.println("Total Tip: $" + formatter.format(totalTip));
        System.out.println("Total Bill With Tip: $" + formatter.format(totalBill));
        System.out.println("Per Person Cost Before Tip: $" + formatter.format(costPerPerson));
        System.out.println("Tip Per Person: $" + formatter.format(tipPerPerson));
        System.out.println("Total Cost Per Person: $" + formatter.format(BillPerPerson));

        }
    }