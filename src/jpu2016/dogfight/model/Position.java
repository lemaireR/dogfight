package jpu2016.dogfight.model;

public class Position {
	double x, y, maxX, maxY;
	public Position(double x, double y, double maxX, double maxY)
	{
		this.x = x;
		this.y = y;
		this.maxX = maxX;
		this.maxY = maxY;
	}

	public Position(Position position)
	{
		this.x = position.x;
		this.y = position.y;
		this.maxX = position.maxX;
		this.maxY = position.maxY;
	}
	public Position()
	{
		this.x = 0;
		this.y = 0;
		this.maxX = 100;
		this.maxY = 100;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	
	public void setMaxY(double maxY) {
		this.maxY = maxY;
	}
}
