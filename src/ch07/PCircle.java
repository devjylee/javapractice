package ch07;

public class PCircle {
	public double radius;
	
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
	public PCircle() {
		this(1);
	}
	
	public PCircle(double radius) {
		this.radius = radius;
	}
	
}
