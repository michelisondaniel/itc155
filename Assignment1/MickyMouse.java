/* **************************************************************************
 * Name:			MickyMouse.java
 * Author(s):		Dan Micheli
 * Date:			April 5th, 2018
 * Title:			Homework Assignment 1
 * Description:		Draw a simple graphics image which resembles
 * 						Micky Mouse
 * 
 **************************************************************************** */

import java.awt.*;

public class MickyMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create drawing panel and graphics object
		DrawingPanel panel = new DrawingPanel(300,300);
		Graphics g = panel.getGraphics();
		
		panel.setBackground(Color.ORANGE);
		
		// draw ears
		g.setColor(Color.CYAN);
		g.fillOval(75, 75, 50, 50);
		g.fillOval(175, 75, 50, 50);
		
		// draw face or body
		g.setColor(Color.RED);
		g.fillRect(105, 100, 90, 90);
		
		// draw center line
		g.setColor(Color.BLACK);
		g.drawLine(105, 145, 195, 145);
		

	}

}
