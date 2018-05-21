package display;

import java.awt.image.BufferedImage;

import display.ImageLoader;

public class Assets {
	
	//Add images to the "res" folder and initiate a variable on the line below as a BufferedImage
	
	public static BufferedImage mapMenu,mapLabel,slimeFront,slimeBack,slimeRight,slimeLeft;
	
	public void init() {
		
		// exampleImage = ImageLoader.loadImage("/textures/exampleImage.png");
		
		//player = ImageLoader.loadImage("/textues/player.png");
		mapMenu = ImageLoader.loadImage("/textures/Map.png");
		mapLabel = ImageLoader.loadImage("/textures/Label.png");
		slimeFront = ImageLoader.loadImage("/textures/SlimeFront.png");
		slimeBack = ImageLoader.loadImage("/textures/slimeBack.png");
		slimeRight = ImageLoader.loadImage("/textures/SlimeRight.png");
		slimeLeft = ImageLoader.loadImage("/textures/SlimeLeft.png");
	}
}
