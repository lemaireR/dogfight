package jpu2016.dogfight.model;

import java.awt.Image;

public class Sky implements IArea{
	Image image;
	Dimension dimension;
	public Sky(Dimension dimension)
	{
		this.dimension = dimension;
	}
	
	public Dimension getDimension()
	{
		return this.dimension;
	}
	
	public Image getImage()
	{
		return this.image;
	}
}
