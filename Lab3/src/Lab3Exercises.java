import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Ismael");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	    int width = (int) screenSize.getWidth();      // the screen width
	    int height = (int) screenSize.getHeight();    // the screen height
	    myFrame.setLocation((width/2) -100, (height/2) -100);
		myFrame.setSize(200, 200);
		
		MyPanelClass myPanel = new MyPanelClass();
		myFrame.getContentPane().add(myPanel);
		
		myFrame.setVisible(true);
	}
}