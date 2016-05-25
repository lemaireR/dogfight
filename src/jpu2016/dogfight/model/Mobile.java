package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;
import java.awt.color.*;

public  class Mobile implements IMobile{
	private int speed;
	private Direction direction;
	private Position position;
	private Dimension dimension;
	private String image;
	private Image monImage;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image)
	{
		this.speed = speed;
		this.direction = direction;
		this.position = position;
		this.dimension = dimension;
		this.image = image;
		
	}
	
	public Direction getDirection() {
		return this.direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
		
	}
	
	public Point getPosition() {
		return new Point();
	}
	
	public Dimension getDimension() {
		return this.dimension;
	}
	
	public int getWidth() {
		return this.dimension.getWidth();
	}
	
	public int getHeight() {
		return this.dimension.getHeight();
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public Image getImage() {
		
		return this.monImage;
	}
	
	public void move() {
		
	}
	
	public void placeInArea(IArea area) {
		
	}
	
	public boolean isPlayer(int player) {
		
		return false;
	}
	
	public void setDogfightModel(IDogfightModel dogfightmodel) {
		
	}
	
	public boolean hit() {
		boolean x = false;
		return x;
	}
	
	public boolean isWeapon() {
		boolean x = false;
		return x;
	}
}