package main;

import display.Display;
import main.KeyManager;

public class Battle implements Runnable {
	Thread thread;
	KeyManager keyManager;
	boolean running;
	private int width;
	private int height;
	private String title;

	public Battle(String string, int i, int j) {
		this.width = i;
		this.height = j;
		this.title = string;
	}
	
	private void init() {
		keyManager = new KeyManager();
		Display display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		
	}
	
	private void render() {
		// TODO Auto-generated method stub
		
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
