import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double lumberCost = 8;
        double windowCost = 11;
        double taxRate, total;
        int numBoards, numWindows;

        System.out.println("Enter the sales tax rate: ");
        taxRate = in.nextDouble();
        System.out.println("How many boards do you need? ");
        numBoards = in.nextInt();
        System.out.println("How many windows do you need? ");
        numWindows = in.nextInt();

        Construction worker = new Construction(lumberCost, windowCost, taxRate);

        total = worker.lumberCost(numBoards) + worker.windowCost(numWindows);
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + worker.grandTotal(total));
    }
}
