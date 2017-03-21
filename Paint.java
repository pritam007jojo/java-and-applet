import java.applet.*;
import java.awt.*;
import java.awt.event.*; 
public class Paint extends Applet
{
	Button b1,b2,b3,b4;
	Button br,bg,bb,by;
	int ov=0,re=0,rr=0,li=0;
	int xov1,yov1,xov2,yov2,wov,hov;
	int xpos1,xpos2,ypos1,ypos2,wpos,hpos;
	int xl1,xl2,yl1,yl2;
	int xrr1,xrr2,yrr1,yrr2,wrr,hrr,xd=10,yd=10;
	Color colour;
	public void init()
	{
	b1= new Button("OVAL");
	b2= new Button("RECTANGLE");
	b3= new Button("ROUNDRECT");
	b4= new Button("LINE");
	br= new Button("RED");
	bg= new Button("GREEN");
	bb= new Button("BLUE");
	by= new Button("YELLOW");
	
	Panel p1=new Panel();
	Panel p2=new Panel();
	p1.setLayout(new GridLayout(1,4));
	p2.setLayout(new GridLayout(1,4));
	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	p1.add(b4);
	p2.add(br);
	p2.add(bg);
	p2.add(bb);
	p2.add(by);
	
	setLayout(new BorderLayout());
	add(p1,BorderLayout.NORTH);
	add(p2,BorderLayout.SOUTH);
	
	b1.addActionListener(new MyButton());
	b2.addActionListener(new MyButton());
	b3.addActionListener(new MyButton());
	b4.addActionListener(new MyButton());
	br.addActionListener(new MyButton());
	bg.addActionListener(new MyButton());
	bb.addActionListener(new MyButton());
	by.addActionListener(new MyButton());
	addMouseMotionListener(new Mymouse());
	}
	class MyButton implements ActionListener{
		public void actionPerformed(ActionEvent ae)		
		{
			String str = ae.getActionCommand();
			if(str.equals("OVAL"))
			{
				ov=1;
			}
			if(str.equals("RECTANGLE"))
			{
				re=1;
			}
			if(str.equals("ROUNDRECT"))
			{
				rr=1;
			}
			if(str.equals("LINE"))
			{
				li=1;
			}
			if(str.equals("RED"))
			{
				colour=Color.red;
			}
			if(str.equals("GREEN"))
			{
				colour=Color.green;
			}
			if (str.equals("BLUE"))
			{
				colour=Color.blue;
			}
			if(str.equals("YELLOW"))
			{
				colour=Color.yellow;
			}
		}
	}
class Mymouse implements MouseMotionListener{
		public void mouseMoved(MouseEvent e)
		{
			//oval
			xov1=e.getX();
			yov1=e.getY();
			//rectangle
			xpos1=e.getX();
			ypos1=e.getY();
			//line
			xl1=e.getX();
			yl1=e.getY();
			//roundrect
			xrr1=e.getX();
			yrr1=e.getY();
			
		}
		public void mouseDragged(MouseEvent e)
		{
			//oval
			xov2=e.getX();
			yov2=e.getY();
			wov=Math.abs((xov2-xov1));
			hov=Math.abs((yov2-yov1));
			
			repaint();
			//line
			xl2=e.getX();
			yl2=e.getY();
			repaint();
			
			//rectangle
			xpos2=e.getX();
			ypos2=e.getY();
			hpos=Math.abs((ypos2-ypos1));
			wpos=Math.abs((xpos2-xpos1));
			
			repaint();
			//roundrect
			xrr2=e.getX();
			yrr2=e.getY();
			wrr=Math.abs((xrr2-xrr1));
			hrr=Math.abs((yrr2-yrr1));
			repaint();
		}
	}
		public void paint(Graphics g)
		{
			if(re==1)
			{
				int x=xpos1<xpos2?xpos1:xpos2;
				int y=ypos1<ypos2?ypos1:ypos2;
				g.drawRect(x,y,wpos,hpos);
				g.setColor(colour);
				g.fillRect(x,y,wpos,hpos);
			}
			if(ov==1)
			{
				int x,y;
				x=xov1<xov2?xov1:xov2;
				y=yov1<yov2?yov1:yov2;
				g.drawOval(x,y,wov,hov);
				g.setColor(colour);
				g.fillOval(x,y,wov,hov);
			}
			if(li==1)
			{
				g.setColor(colour);
				g.drawLine(xl1,yl1,xl2,yl2);
			}
			
			if(rr==1)
			{
				int x=xrr1<xrr2?xrr1:xrr2;
				int y=yrr1<yrr2?yrr1:yrr2;
				g.drawRoundRect(x,y,wrr,hrr,xd,yd);
				g.setColor(colour);
				g.fillRoundRect(x,y,wrr,hrr,xd,yd);
			}
			
		}
}