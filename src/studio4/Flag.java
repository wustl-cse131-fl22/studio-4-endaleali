package studio4;

import java.awt.Color;

import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(0, 0, 0);
		/*/
		 * SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
		 */
		StdDraw.rectangle(0.5, 0.5, 0.3, 0.2); 
		StdDraw.circle(0.5, 0.5, 0.10);
		//double[] x = {0.3, 0.3, 0.3};
		//double[] y = {0.3, 0.3, 0.3};
		//StdDraw.polygon();
		//StdDraw.line(0, 0, 0, 0);
		
	}
}