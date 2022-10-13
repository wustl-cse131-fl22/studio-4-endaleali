package studio4;

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
		Scanner in = new Scanner(f); // making Scanner with a File

		/*
		 * public class TestStdDraw { public static void main(String[] args) {
		 * StdDraw.setPenRadius(0.05); StdDraw.setPenColor(StdDraw.BLUE);
		 * StdDraw.point(0.5, 0.5); StdDraw.setPenColor(StdDraw.MAGENTA);
		 * StdDraw.line(0.2, 0.2, 0.8, 0.2); } }
		 */
		String shape = in.next();
		if (shape.equals("rectangle")) {
			StdDraw.setPenRadius(0.05);
			int red = in.nextInt();
			int green = in.nextInt();
			int blue = in.nextInt();
			StdDraw.setPenColor(red, green, blue);
			if(in.next().equals("true")) {
				StdDraw.filledRectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			else {
				StdDraw.rectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			
		}
		
		else if (shape.equals("ellipse")){
			StdDraw.setPenRadius(0.05);
			int red = in.nextInt();
			int green = in.nextInt();
			int blue = in.nextInt();
			StdDraw.setPenColor(red, green, blue);
			if(in.next().equals("true")) {
				StdDraw.filledEllipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			else {
				StdDraw.ellipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
		}
		else if (shape.equals("triangle")){
			StdDraw.setPenRadius(0.01);
			int red = in.nextInt();
			int green = in.nextInt();
			int blue = in.nextInt();
			StdDraw.setPenColor(red, green, blue);
			// double[] x = { 0.1, 0.2, 0.3, 0.2 };
			// double[] y = { 0.2, 0.3, 0.2, 0.1 };
			//StdDraw.filledPolygon(x, y);
			String fill = in.next();
			double [] x = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
			double [] y = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
			
			if(fill.equals("true")) {
				StdDraw.filledPolygon(x, y);
			}
			else {
				StdDraw.line(x[0], y[0], x[1], y[1]);
				StdDraw.line(x[1], y[1], x[2], y[2]);
				StdDraw.line(x[2], y[2], x[0], y[0]);
				
			}
	}
}
}
