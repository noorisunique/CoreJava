package com.file;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ReadAndWriteImage {
	public static void main(String[] args) {
		File file = new File("D:/input.jpg");

		BufferedImage image = null;

		try {
			image = ImageIO.read(file);

			ImageIO.write(image, "jpg", new File("D:/output.jpg"));

			ImageIO.write(image, "png", new File("D:/output.png"));

			ImageIO.write(image, "gif", new File("D:/output.gif"));

			ImageIO.write(image, "bmp", new File("D:/output.bmp"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("done");
	}
}