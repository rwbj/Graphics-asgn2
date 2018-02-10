import java.awt.image.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.imageio.*;
import java.util.Random;
import java.io.*;
import java.util.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.imageio.*;
import java.util.Random;
import java.io.*;
import java.awt.geom.*;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.*;
import java.awt.Color;
import java.lang.Math;

public class MYJPanel extends JPanel{

	Graphics2D g2d;
	MyPoint p1;
	MyPoint p2;
	MyPoint p3;

	public MYJPanel() {

		super();
	}

	public void setPts(MyPoint mp1, MyPoint mp2, MyPoint mp3){
		p1=mp1;
		p2=mp2;
		p3=mp3;
	}

	public synchronized void paintComponent(Graphics g) {

		g2d = (Graphics2D) g;

		g2d.setBackground(Color.CYAN);

		g2d.setColor(Color.BLACK);
		
		//g2d.drawLine(x1, y1, x2, y2);

		g2d.drawLine(p1.x,p1.y,p2.x,p2.y);

		System.out.printf("points: %d %d, %d %d\n",p1.x,p1.y,p2.x,p2.y);

		//saves the buffered image to file (Bobby's code)
		/*try {
            File outputfile = new File("saved.png");
            ImageIO.write(img, "png", outputfile);
        } catch (IOException e) {
          System.out.println("Something went wrong with saving the file");
        }*/

    }
}