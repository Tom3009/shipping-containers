package Method;
import Containers.BigContainer;
import Containers.smallContainer;
import items.Item;


public class Calculation {
    // Array of items available for shipping
    Item[] item = {};
    // Array to store the quantity of each item ordered
    int[] order = {};
    // Container objects for big and small containers
    BigContainer bigContainer = null;
    smallContainer smallContainer = null;

    // Method to add items to the item array
    public void addItems(Item[] item) {
        this.item = item;
    }

    // Method to add order quantities to the order array
    public void addOrder(int[] order) {
        this.order = order;
    }

    // Setter method for the big container
    public void setBigContainer(BigContainer bigContainer) {
        this.bigContainer = bigContainer;
    }

    // Setter method for the small container
    public void setSmallContainer(smallContainer smallContainer) {
        this.smallContainer = smallContainer;
    }

    // Method to calculate the total volume of all items in the order
    public double totalVolume() {
        double volOfLaptop = item[0].getVolume() * order[0];
        double volOfMice = item[1].getVolume() * order[1];
        double volOfDesktops = item[2].getVolume() * order[2];
        double volOfLcds = item[3].getVolume() * order[3];
        return volOfDesktops + volOfMice + volOfLaptop + volOfLcds;
    }

    // Method to calculate the total weight of all items in the order
    public double totalWeight() {
        double weiOfLaptop = item[0].getWeight() * order[0];
        double weiOfMice = item[1].getWeight() * order[1];
        double weiOfDesktops = item[2].getWeight() * order[2];
        double weiOfLcds = item[3].getWeight() * order[3];
        return weiOfDesktops + weiOfMice + weiOfLcds + weiOfLaptop;
    }

    // Method to determine the best shipping method based on volume and weight
    public int[] bestShipping() {
        int bigContainerCount = 0;
        int smallContainerCount = 0;

        // Calculate total volume in cubic meters
        double totalVolume = this.totalVolume() / 1000000;
        double bigContainerVol = this.bigContainer.getVolume();
        double smallContainerVol = this.smallContainer.getVolume();

        // Determine the number of containers needed
        while (totalVolume > 0) {
            if (totalVolume > smallContainerVol) {
                if (totalVolume > bigContainerVol && totalVolume <= (smallContainerVol * 2)) {
                    smallContainerCount += 2;
                    bigContainerCount -= 1;
                    totalVolume = totalVolume - (smallContainerVol * 2);
                } else {
                    bigContainerCount++;
                    totalVolume = totalVolume - bigContainerVol;
                }
                continue;
            } else {
                totalVolume = totalVolume - smallContainerVol;
                smallContainerCount++;
            }
        }
        int[] sample = {bigContainerCount, smallContainerCount};
        return sample;
    }

    // Method to calculate the total shipping price
    public int shippingPrice() {
        int[] containerCounts = this.bestShipping();
        int bigContainerCount = containerCounts[0];
        int smallContainerCount = containerCounts[1];

        double totalWeight = this.totalWeight();
        int smallContainerCost = 0;

        // Determine the cost of small containers based on weight
        if (totalWeight / smallContainerCount > 500) {
            smallContainerCost = 1200;
        } else {
            smallContainerCost = 1000;
        }

        // Calculate total cost
        int totalCost = bigContainerCount * 1800 + smallContainerCount * smallContainerCost;
        return totalCost;
    }

    // Method to print the details of each item
    public void printItem() {
        System.out.println("Laptop: Volume = " + this.item[0].getVolume() + " cm^3, Weight = " + this.item[0].getWeight() + " g");
        System.out.println("Mouse: Volume = " + this.item[1].getVolume() + " cm^3, Weight = " + this.item[1].getWeight() + " g");
        System.out.println("Desktop: Volume = " + this.item[2].getVolume() + " cm^3, Weight = " + this.item[2].getWeight() + " g");
        System.out.println("LCD: Volume = " + this.item[3].getVolume() + " cm^3, Weight = " + this.item[3].getWeight() + " g");
    }

    // Method to print the details of the order
    public void printOrder() {
        System.out.println("Order details:");
        System.out.println("Laptops ordered: " + this.order[0]);
        System.out.println("Mice ordered: " + this.order[1]);
        System.out.println("Desktops ordered: " + this.order[2]);
        System.out.println("LCD screens ordered: " + this.order[3]);
    }
}


    		   
       
        
        
        

