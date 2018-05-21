package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

import display.Assets;
import display.Display;
import main.KeyManager;
import scene.Menuing;

public class Battle implements Runnable {
	Thread thread;
	public KeyManager keyManager;
	Display display;
	Menuing menuing;
	Assets assets;
	
	boolean running;
	private int width;
	private int height;
	private String title;
	private Graphics g;
	private Graphics2D g2d;
	private BufferStrategy buffer;

	public Battle(String string, int i, int j) {
		this.width = i;
		this.height = j;
		this.title = string;
	}
	
	private void init() {
		keyManager = new KeyManager();
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		assets = new Assets();
		assets.init();
		menuing = new Menuing(this);
		
	}
	
	private void render() {
		buffer = display.getCanvas().getBufferStrategy();
		if(buffer == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = buffer.getDrawGraphics();
		g2d = (Graphics2D)g;
		g.clearRect(0, 0, width, height);
		//start calling those renders
		menuing.render(g, g2d);
		//thats too much maybe
		buffer.show();
		g.dispose();
		
	}

	private void update() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void run() {
		init();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			lastTime = now;
			
			if(delta >= 1){
				update();
				render();
				delta--;
			}
		}
		stop();
		
	}
	
	public void start() {
		if(running)
			return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
		
	}
	
	public synchronized void stop(){
		if(!running)
			return;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
