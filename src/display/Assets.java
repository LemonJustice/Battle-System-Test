package display;

import java.awt.image.BufferedImage;

import display.ImageLoader;

public class Assets {
	
	//Add images to the "res" folder and initiate a variable on the line below as a BufferedImage
	
	public static BufferedImage slimeFront,slimeBack,slimeRight,slimeLeft;
	
	public void init() {
		
		// exampleImage = ImageLoader.loadImage("/textures/exampleImage.png");
		
		//player = ImageLoader.loadImage("/textues/player.png");
		slimeFront = ImageLoader.loadImage("/textues/SlimeFront.png");
		slimeBack = ImageLoader.loadImage("/textues/slimeBack.png");
		slimeRight = ImageLoader.loadImage("/textues/SlimeRight.png");
		slimeLeft = ImageLoader.loadImage("/textues/SlimeLeft.png");
	}
}
