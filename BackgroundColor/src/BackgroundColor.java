/* Mark Schuberth
 * Professor Abdollahzadeh
 * CS 152 - 02
 * 5/3/18
 */
import javax.swing.JFrame;

public class BackgroundColor 
{
	//creates and displays the application frame for Background Color program
	public static void main(String[] args)
	{
		//creates the frame and titles called "Background Colors"
		JFrame frame = new JFrame ("Background Colors");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add (new BackgroundColorPanel());
		//allows user to see the pane
		frame.pack();
		frame.setVisible(true);
	}
}