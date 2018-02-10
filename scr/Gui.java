import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

class Gui extends JFrame implements ActionListener{

    JPanel p;
	int mx,my;
	MYJPanel mp2, mp3;
	Timer tm;
	int count=0;
	JButton jbn, jbw, jbs, jbe;
	JButton[] lbl;
	MyPoint p1 ,p2, p3;

	public Gui(){

		//read from file
			
		p1 = new MyPoint(150,150);
		p2 = new MyPoint(300,300);
		p3 = new MyPoint(0,0);

		mp2 = new MYJPanel();
		
		mp2.setPts(p1,p2,p3);

		mp2.setSize(1040,551);
		
		this.add(mp2);
		
		tm = new Timer(100,this);
		tm.setActionCommand("tm");

		tm.start();
	}

	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().compareTo("tm")==0){
			//p2 = new MYJPanel();
			mp2.repaint();
			p1.x+=10;
			p1.y-=10;
			p2.x-=10;
			p2.y+=10;
			mp2.setPts(p1,p2,p3);
		}
	}

}