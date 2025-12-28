package items;


public abstract class Item{
	
// declaring private variables 	
	
private double weight = 0.0;
private double length = 0; 
private double width = 0;
private double height = 0;


//Initialising class

public Item(double weight, double length, double width, double hight) {
	 this.width = width;
	 this.weight = weight;
	 this.height = hight;
	 this.length = length;
	 

}
// adding getters and setters 
public double getWeight() {
	return this.weight;
	
	
}
public double getWidth() {
	return this.width;
	
	
}
public double getHeight() {
	return this.height;
	
	
}

public double getLength() {
	return this.length;
	
	
}
public void setWeight(double weight) {
    this.weight = weight; 
    
	
}

public void setLength(double length) {
    this.length = length; 
    
	
}

public void setHeight(double height) {
    this.height = height; 
    
	
}

public void setWidth(double width) {
    this.width = width; 
    
	
	
}

public double getWeightInGrams() {
	return this.weight * 1000;
	
}

public double getVolume() {
	return this.width * this.height * this.length;


}
}








