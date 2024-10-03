package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		String Shape = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		
		
		Color Flag = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(Flag);
		boolean Isfilled = in.nextBoolean();
		
		
	
		System.out.print(Isfilled);
		
		if (Shape.equals("Rectange")){
			
			Color Pen = new Color(redComponent, greenComponent, blueComponent);
			double ParameterOne = in.nextDouble();
			double ParameterTwo = in.nextDouble();
			double ParameterThree = in.nextDouble();
			double ParameterFour = in.nextDouble();
			StdDraw.filledRectangle(ParameterOne, ParameterTwo, ParameterThree, ParameterFour);
		}
		
		
		
		
	}
}
