import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Ballgame extends Applet implements Runnable
{
	int x=0,y=300,w=100,h=100;
	boolean flag;
	Thread t;
	public void init()
	{
		flag=false;
		t=new Thread(this);
		t.start();
		addMouseListener(new Mymouse());
		
	}

	public void run()
	{
		for(;;)
		{
				if(flag==false)
				{
					for(int i=x;i<1250&&flag==false;i++)
					{
						x=i+5;
						y=300;
						repaint();
						try
						{
							t.sleep(5);
						}
						catch(InterruptedException e)
						{
							System.out.println("exception caught");
						}
					}
					for(int j=1250;j>0&&flag==false;j--)
					{
						x=j-5;
						y=300;
						repaint();
						try
						{
							t.sleep(5);
						}
						catch(InterruptedException e)
						{
							System.out.println("exception caught");
						}
					}
				}
			else
			{
				for(int i=300;i>0&&flag==true;i--)
				{
					y=i-5;
					repaint();
					try
						{
						t.sleep(5);
						}
					catch(InterruptedException e)
						{
						System.out.println("exception caught");
						}
				}
				for(int j=0;j<300&&flag==true;j++)
				{
					y=j+5;
					repaint();
					try
					{
						t.sleep(5);
					}
					catch(InterruptedException e)
					{
						System.out.println("exception caught");
					}
				}
			}
		}
		
	}
	class Mymouse implements MouseListener
	{
		public void mouseClicked(MouseEvent me)
		{
			if(flag==false)
				flag = true;
			else
				flag = false;
			
		}
		public void mouseExited(MouseEvent me)
		{
		}
		public void mouseEntered(MouseEvent me)
		{
		}
		public void mousePressed(MouseEvent me)
		{
		}
		public void mouseReleased(MouseEvent me)
		{
			
		}
	}

	public void paint(Graphics g)
	{
		
		g.drawOval(x,y,w,h);
		g.setColor(Color.red);
		g.fillOval(x,y,w,h);
	}
	
}