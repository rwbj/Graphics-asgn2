import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

class Gui extends JFrame{

    JPanel p;
	int mx,my;
	MYJPanel p2, p3;
	Timer tm;
	int count=0;
	JButton jbn, jbw, jbs, jbe;
	JButton[] lbl;
	int x1,y1,x2,y2;

	public Gui(String img, int n1, int n2, int n3, int n4) {
		
		x1 = n1;
		y1 = n2;
		x2 = n3;
		y2 = n4;

        p2 = new MYJPanel();
		p2.setLnPts(n1,n2,n3,n4);

		try {
			//p2.img = ImageIO.read(new File("./bg.png"));
			p2.img = ImageIO.read(new File("./"+img));
		} catch (IOException e) {
			System.out.printf("img open failed\n");
			e.printStackTrace();
			System.exit(1);
		}

        p2.setSize(p2.img.getWidth(), p2.img.getHeight());

		this.add(p2);

		tm = new Timer(100,this);
		tm.setActionCommand("tm");
		tm.start();
	}

	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().compareTo("tm")==0){
			p2 = new MYJPanel();
			p2.setLnPts(x1+1,y1+1,x2+1,y2+1);
		}
	}

}