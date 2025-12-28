package Containers;

abstract class Container {

	private double height = 0.0;
	private double wide = 0.0;
	private double length = 0.0;
	

	public Container (double height, double wide, double length) {
		
    this.height = height;
	this.wide = wide;
	this.length = length;
		
	}
	
	public double getHeight() {
		return this.height;
	}
	
	
	public double getWide() {
		return this.wide;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength() {
		length = this.length;
	}
	
	public void setHeight() {
		height = this.height;
	}
	
	public void setWide() {
		wide = this.wide;
	}
	
	public double getVolume() {
		return this.wide * this.height * this.length;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
