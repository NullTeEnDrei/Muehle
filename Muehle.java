import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import javax.imageio.*;

/**
 * 
 *	@version pre at 06 Jun '13
 *	@author Tim D. Koerber <>
 *	@author Alexander F. Krebs <>
 *	@author Timo S. Prinz <prinz628@gmail.com>
 *
 */
public class Muehle {
	
	public Muehle(String title) {
		//Frame-initialisierung
		JFrame f = new JFrame();	
		// \u00FC is Unicode U-umlaut
		f.setTitle("M\u00FChle");
		f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 600; 
	    int frameHeight = 600;
	    f.setSize(frameWidth, frameHeight);
	    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (d.width - f.getSize().width) / 2;
	    int y = (d.height - f.getSize().height) / 2;
	    f.setLocation(x, y);
	    f.setResizable(false);
	    JLabel backImgPanel = new JLabel(new ImageIcon("Muehle.jpg"));
	    backImgPanel.setLayout(null);
        backImgPanel.setOpaque(false);
        f.getContentPane().add(backImgPanel);
        backImgPanel.setBounds(0,0,600,600);
	    // Anfang Komponenten
	    // Ende Komponenten
	    f.setVisible(true);
	  } //end of Muehle()
	//Anfang Methoden
	//Ende Methoden

	public static void main(String[] args) {
		new Muehle("muehle");
	} //end of main()

} //end of class Muehle_frame