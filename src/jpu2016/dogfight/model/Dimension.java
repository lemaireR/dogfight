package jpu2016.dogfight.model;

public class Dimension {
	private int width;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	private int height;
	public Dimension(int pWidth, int pHeight)
	{
		this.width = pWidth;
		this.height = pHeight;
	}
	public Dimension(Dimension dimension)
	{
		
	}
}
