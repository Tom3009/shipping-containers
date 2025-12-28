package Main;
import java.util.Scanner;
import Containers.BigContainer;
import Containers.smallContainer;
import Method.Calculation;
import items.*;
import items.Desktop;
import items.Laptop;
import items.LCD;
import items.Mouse;

public class main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Read user input for the number of items ordered
        System.out.println("Enter number of Laptops:");
        int numLaptops = scanner.nextInt();
        System.out.println("Enter number of Mice:");
        int numMice = scanner.nextInt();
        System.out.println("Enter number of Desktops:");
        int numDesktops = scanner.nextInt();
        System.out.println("Enter number of LCD screens:");
        int numLCDScreens = scanner.nextInt();

        // Create item objects with specified dimensions and weight
        Laptop aLaptop = new Laptop(6500.00, 60, 50, 50);
        Mouse aMouse = new Mouse(200.00, 30, 30, 20);
        Desktop aDesktop = new Desktop(20000.00, 100, 150, 50);
        LCD aLCD = new LCD(2600.00, 120, 140, 80);

        // Create container objects with specified dimensions
        BigContainer aBigContainer = new BigContainer(2.59, 2.43, 12.01);
        smallContainer aSmallContainer = new smallContainer(2.59, 2.43, 6.06);

        // Array of items to be used in the calculation
        Item[] shapes = {aLaptop, aMouse, aDesktop, aLCD};
        // Array of ordered quantities
        int[] order = {numLaptops, numMice, numDesktops, numLCDScreens};

        // Create a Calculation object and add items and orders to it
        Calculation orderCalculation = new Calculation();
        orderCalculation.addItems(shapes);
        orderCalculation.addOrder(order);

        // Set the container types in the Calculation object
        orderCalculation.setBigContainer(aBigContainer);
        orderCalculation.setSmallContainer(aSmallContainer);

        // Calculate the shipping price
        orderCalculation.shippingPrice();
        
        // Print details of the items and the order
        orderCalculation.printItem();
        orderCalculation.printOrder();

        // Determine the best shipping method
        int[] nrOfContainers = orderCalculation.bestShipping();

        // Print total volume and weight of the order
        System.out.println("The Total Volume Is " + orderCalculation.totalVolume() / 1000000 + " m^3");
        System.out.println("The Total Weight Is " + orderCalculation.totalWeight() / 1000 + " kg");

        // Print the number of big and small containers needed
        System.out.println("The Number of big containers is " + nrOfContainers[0]);
        System.out.println("The Number of small containers is " + nrOfContainers[1]);

        // Print the total shipping price
        System.out.println("The Shipping price is: " + orderCalculation.shippingPrice() + " Euros");
    }
}
