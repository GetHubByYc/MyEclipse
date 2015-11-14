import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class Swing_1 extends JFrame{
	DrawIcon icon = new DrawIcon(10, 20);
	Container ct = getContentPane();
	JLabel lb1 = new JLabel("test icon",icon,SwingConstants.CENTER);
	
	public Swing_1(){
		 JLabel  lb2 = new JLabel("this is a Jframe window",JLabel.CENTER);
		 Icon icon = new ImageIcon("src/mb.png");
		 lb2.setIcon(icon);
		 lb2.setHorizontalAlignment(SwingConstants.CENTER);
		 lb2.setOpaque(true);
		  ct.add(lb1,BorderLayout.NORTH);
	      ct.add(lb2);
	      setSize(300,300);
	      setVisible(true);
	 	 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing_1();
	}

}

 class DrawIcon implements Icon{
		private int width;
		private int height;
		public int getIconHeight(){
			return height;
		}
		public int getIconWidth(){
			return width;
		}
		
		public DrawIcon(int width,int height){
			this.width = width;
			this.height = height;
		}
		public void paintIcon(Component arg0,Graphics arg1,int x,int y){
			arg1.fillOval(x, y, width,height);
		}

}
