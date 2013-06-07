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
 *	@version pre at 07 Jun '13
 *	@author Tim D. Koerber <>
 *	@author Alexander F. Krebs <>
 *	@author Timo S. Prinz <prinz628@gmail.com>
 *
 */
public class Muehle {
	
	public Muehle(String title) {
		//Attribs
			JFrame f;
			int frameWidth, frameHeight;
			int frameX, frameY;
			JLabel backImgPanel;
			JButton feld01, feld02, feld03, feld04, feld05, feld06, feld07, feld08;
			JButton feld11, feld12, feld13, feld14, feld15, feld16, feld17, feld18;
			JButton feld21, feld22, feld23, feld24, feld25, feld26, feld27, feld28;
			
		//Frame-initialisierung
			f = new JFrame();	
			// \u00FC is Unicode U-umlaut
			f.setTitle("M\u00FChle");
			f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			frameWidth = 600; 
			frameHeight = 600;
			f.setSize(frameWidth, frameHeight);
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			frameX = (d.width - f.getSize().width) / 2;
			frameY = (d.height - f.getSize().height) / 2;
			f.setLocation(frameX, frameY);
			f.setResizable(false);
			backImgPanel = new JLabel(new ImageIcon("img/muehlefeld.jpg"));
			backImgPanel.setLayout(null);
			backImgPanel.setOpaque(false);
			f.getContentPane().add(backImgPanel);
			feld01 = new JButton();
			feld01.setBounds(190, 190, 20, 20);
			backImgPanel.setBounds(0,0,600,600);
		// Components
			
		//Show frame
			f.setVisible(true);
			
	} //end of Muehle()
	
	//Methoden

	public static void main(String[] args) {
		new Muehle("muehle");
		
	} //end of main()
	
} //end of class Muehle_frame