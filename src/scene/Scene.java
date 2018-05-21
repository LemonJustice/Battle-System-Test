package scene;

import java.awt.Graphics;
import java.awt.Graphics2D;

import main.Battle;

public abstract class Scene{
		
	protected boolean running = false;
	
	public Scene(Battle battle) {
		
	}
	
	abstract public void update();
	abstract public void render(Graphics g, Graphics2D g2d);
	
	abstract void running(boolean state);
}
