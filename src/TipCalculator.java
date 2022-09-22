import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the tip calculator!");

        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        double itemCost = 0;
        double itemCost1 = 0;
        double totalCost = 0;
        while (itemCost > -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.40 (type -1 to end): ");
            itemCost = scan.nextDouble();
            totalCost = itemCost + itemCost1;
            itemCost1 = totalCost;
        }
        totalCost= totalCost + 1;
        double totalTip = (tipPercentage * 0.01) * totalCost;


        System.out.println("---------------------");

        System.out.println("Total Bill Before Tip: " + totalCost);
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Total Tip: " + totalTip);
        System.out.println("Total Bill With Tip: " + (totalCost + totalTip));
        System.out.println("Per Person Cost Before Tip:" + (totalCost/numPeople));
        System.out.println("Tip Per Person: " + (totalTip/numPeople));
        System.out.println("Total Cost Per Person:" + ((totalCost/numPeople) + (totalTip/numPeople)));

        }
    }