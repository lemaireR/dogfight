package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

public class DogfightView implements IViewSystem, Runnable{
	
	private GameFrame gameFrame;
	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicsBuilder;

	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable){
		this.eventPerformer = new EventPerformer(orderPerformer);
		this.graphicsBuilder = new GraphicsBuilder(dogfightModel);
	}
	
	public void run(){
	}
	
	public void displayMessage(String message){
		
	}
	
	public void closeAll(){
		
	}

}
