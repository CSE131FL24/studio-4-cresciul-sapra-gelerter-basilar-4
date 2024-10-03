package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		Color LightPink = new Color(255, 102, 102);
		double width = 0.5;
		double halfwidth = 0.5;
		double height = 0.25;
		double halfheight = 0.125;
		
		StdDraw.setPenColor(LightPink);
		StdDraw.filledRectangle( width , halfwidth , height , halfheight);
		
		
		StdDraw.setPenColor(Color.blue);
		double x = 0.5;
		StdDraw.filledCircle (x, x , x/5);
		Color LightBlue = new Color(51, 204, 255);
		StdDraw.setPenColor(LightBlue);
		StdDraw.filledCircle (x, x , x/7);
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledCircle (x, x , x/10);
		Color white = new Color(255, 255, 255);
		StdDraw.setPenColor(white);
		StdDraw.filledCircle (x, x , x/12);
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledCircle (x, x , x/15);
	}
}