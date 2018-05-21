package scene;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;

import display.Assets;
import main.Battle;

public class Menuing extends Scene{	
	
	private AffineTransform rotation = new AffineTransform();
	private Font labelFont = new Font("labelFont", Font.PLAIN, 100);
	private Color labelColor = new Color(55, 45, 29, 255);
	private String label = "Map";
	double labeloffx = 100;
	double labeloffy = 110;
	Battle battle;
	double labelx = 10;
	double labely = 580;
	
	public Menuing(Battle battle) {
		super(battle);
		running = true;
		rotation.rotate((-1*Math.PI/15), labelx, labely);
		rotation.translate(labelx, labely);
	}

	@Override
	public void render(Graphics g, Graphics2D g2d) {
		if(!running) 
			return;
		g2d.drawImage(Assets.mapMenu, 0, 0, null);
		g2d.drawImage(Assets.mapLabel, rotation, null);
	
		g2d.setFont(labelFont);
		g2d.setColor(labelColor);
		g2d.transform(rotation);
		g2d.drawString(label, (int)labeloffx, (int)labeloffy);
	}

	@Override
	public void update() {
		if(!running)
			return;
		if(battle.keyManager.keyJustPressed(KeyEvent.VK_ESCAPE)) running = false;
	}

	@Override
	void running(boolean state) {
		// TODO Auto-generated method stub
		
	}

}
