import java.applet.*;
import java.awt.*;
import java.awt.event.*; 
import java.lang.*;

public class Linemaker extends Applet{
int xpos1,xpos2,ypos1,ypos2,h,w;
public void init(){
	addMouseMotionListener(new Mymouse());
}

class Mymouse implements MouseMotionListener{
public void mouseMoved(MouseEvent e)
{
	xpos1=e.getX();
	ypos1=e.getY();
}
public void mouseDragged(MouseEvent e)
{
	xpos2=e.getX();
	ypos2=e.getY();
	h=Math.abs((ypos2-ypos1));
	w=Math.abs((xpos2-xpos1));
	
	repaint();
}
}
public void paint(Graphics g)
{
	int x=xpos1<xpos2?xpos1:xpos2;
	int y=ypos1<ypos2?ypos1:ypos2;
	g.drawRect(x,y,w,h);
	
}
}