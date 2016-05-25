package jpu2016.dogfight.model;

import java.awt.Dimension;
import java.awt.geom.Area;
import java.util.ArrayList;

public interface IDogfightModel {
	public IArea getArea();
	public void buildArea(Dimension dimension);
	public void addMobile(IMobile Mobile);
	public void removeMobile(IMobile Mobile);
	public ArrayList<IMobile> getMobiles();
	public IMobile getMobileByPlayer(int player);
	public void setMobilesHavesMoved();
	
	
}
