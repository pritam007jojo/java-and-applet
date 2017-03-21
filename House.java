import java.applet.*;
import java.awt.*;
import java.awt.event.*; 

public class House extends Applet{
int xpos;
int ypos;
public void init(){
	addMouseMotionListener(new Mymouse());
}

class Mymouse implements MouseMotionListener{
public void mouseMoved(MouseEvent e)
{
	xpos= e.getX();
	ypos=e.getY();
	repaint();
}
public void mouseDragged(MouseEvent e)
{}
}
public void paint(Graphics g)
{
g.drawLine(200,200,xpos,10);
g.drawLine(xpos,10,600,200);
g.drawLine(200,200,600,200);
g.drawLine(200,200,200,600);
g.drawLine(600,200,600,600);
g.drawLine(200,600,600,600);
g.drawRect(250,300,50,50);
g.drawRect(500,300,50,50);
g.drawRect(350,400,100,200);


}
}