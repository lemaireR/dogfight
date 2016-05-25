package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.*;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;

public class GraphicsBuilder {
	
	private BufferedImage emptySky;
	private IDogfightModel dogfight;

	public GraphicsBuilder(IDogfightModel dogfightModel){
		this.emptySky = new BufferedImage(0,0,BufferedImage.TYPE_INT_RGB);
		this.dogfight = dogfightModel;
		
	}
	
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer){
		
	}
	
	private void buildEmptySky(){
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){
		
	}
	
	public int getGlobalWidth(){
		return 1;
	}
	
	public int getGlobalHeight(){
		return 1;
	}

}
