/* Mark Schuberth
 * Professor Abdollahzadeh
 * CS 152 - 02
 * 5/3/18
 */

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

//panel that creates a background color change effect when the mouse
//is moved from one half to the other half by the user
//left half of the panel will be ready and right half will be green
public class BackgroundColorPanel extends JPanel
{
	//sets up the panel as 500 x 500 pixels
	private final int WIDTH = 500, HEIGHT = 500;
	//int used to compare width of the panel later
	private int x;
	
	public BackgroundColorPanel()
	{
		//location listener and motion listener for the mouse
		LocationListener listener = new LocationListener();
		addMouseMotionListener(listener);
		//sets the background up as red and the preferred size as the
		//variables width and height which are used later to split the 
		//panel in half
		setBackground (Color.red);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
	
	public void paintComponent(Graphics page)
	{
		//splits the panel in half with the left half being red when
		//the mouse is on it and the right half being green when the mouse
		//moves over it
		super.paintComponent(page);
		Color newColor = (x < (getWidth()/2)) ? Color.red : Color.green;
		setBackground(newColor);
	}
	
	//locationlistener method that acts as the mouse motion listener
	//based on the location of the mouse
	public class LocationListener implements MouseMotionListener
	{
		public void mouseMoved (MouseEvent event)
		{
		  x = event.getX();
		  repaint();
		}
		
		public void mouseDragged (MouseEvent event)
		{}
	}
	
	public void mouseMoved (MouseEvent event) {}
	public void mouseDragged (MouseEvent event) {}
}