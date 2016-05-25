package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.view.GraphicsBuilder;

public class GameFrame extends JFrame implements KeyListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 302494905294115089L;
	private IEventPerformer eventPerformer;

	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder, Observable observable){
		this.eventPerformer = performer;
		
	}
	
	public void keyPressed(KeyEvent keyEvent){
		
	}
	
	public void keyReleased(KeyEvent keyEvent){
		
	}
	
	public void keyTyped(KeyEvent keyEvent){
		
	}

}
