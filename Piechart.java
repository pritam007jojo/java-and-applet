import java.applet.*;
import java.awt.*;
import java.awt.event.*; 

public class Piechart extends Applet
{
Label qty1,qty2,qty3,qty4;
TextField tf1,tf2,tf3,tf4;
Button btn1,btn2;
double a,b,c,d,total;
int a1,a2,a3,a4,flag,max;
public void init()
{
	flag=0;
	qty1 = new Label("QTY1");
	qty2 = new Label("QTY2");
	qty3 = new Label("QTY3");
	qty4 = new Label("QTY4");
	tf1 = new TextField(10);
	tf2 = new TextField(10);
	tf3 = new TextField(10);
	tf4 = new TextField(10);
	btn1 = new Button("PIE CHART");
	btn2 = new Button("BAR GRAPH");
	Panel p1=new Panel();
	p1.setLayout(new GridLayout(2,4));
	Panel p2=new Panel();
	p2.setLayout(new GridLayout(1,2));
	p1.add(qty1);
	p1.add(tf1);
	p1.add(qty2);
	p1.add(tf2);
	p1.add(qty3);
	p1.add(tf3);
	p1.add(qty4);
	p1.add(tf4);
	p2.add(btn1);
	p2.add(btn2);
	setLayout(new BorderLayout());
	add(p1,BorderLayout.NORTH);
	add(p2,BorderLayout.SOUTH);
	btn1.addActionListener(new MyButton());
	btn2.addActionListener(new MyButton());
}
	class MyButton implements ActionListener{
		public void actionPerformed(ActionEvent ae)
		{	
		double a11,a12,a13,a14;
		a=Double.parseDouble(tf1.getText());
		b=Double.parseDouble(tf2.getText());
		c=Double.parseDouble(tf3.getText());
		d=Double.parseDouble(tf4.getText());
		total = a+b+c+d;
		String str= ae.getActionCommand();
			if(str.equals("PIE CHART"))
			{
				a11=360*(a/total);
				a12=360*(b/total);
				a13=360*(c/total);
				a14=360*(d/total); 
				a1 = (int)a11;
				a2 = (int)a12;
				a3 = (int)a13;
				a4 = (int)a14;
				flag=1;
				repaint();
			}
			else
			{
				if(a>=b&&a>=c&&a>=d)
				{
					max=(int)a;
				}
				else if(b>=a&&b>=c&&b>=d)
				{
					max =(int)b;
				}
				else if(c>=a&&c>=b&&c>=d)
				{
					max = (int)c;
				}
				else 
				{
					max = (int)d;
				}
				a11=500*(a/max);
				a12=500*(b/max);
				a13=500*(c/max);
				a14=500*(d/max); 
				a1 = (int)a11;
				a2 = (int)a12;
				a3 = (int)a13;
				a4 = (int)a14;
				flag=2;
				repaint();
				
			}
		}
	}
	public void paint(Graphics g)
	{
		int x=250,y1=250,w1=250,h=250,sa=0,la=360,y2=600,w2=30,pt;
		double marking;
		if(flag==1)
		{
		g.setColor(Color.red);
		g.fillArc(x,y1,w1,h,sa,a1);
		g.setColor(Color.green);
		g.fillArc(x,y1,w1,h,a1,(360-a1-a3-a4));
		g.setColor(Color.yellow);
		g.fillArc(x,y1,w1,h,(a1+a2),(360-a1-a2-a4));
		g.setColor(Color.blue);
		g.fillArc(x,y1,w1,h,(a1+a2+a3),(360-a1-a2-a3));
		}
		if(flag==2)
		{
		g.drawLine(100,600,100,100);
		g.drawLine(100,600,600,600);
		g.drawString("Y AXIS",90,100);
		g.drawString("X AXIS",600,590);
		marking=0.10*(500);
		pt=(int)marking;
		for(int i=1;i<=10;i++)
		{
		g.drawString("__",100,(y2-(i*pt)));
		}
		g.setColor(Color.red);
		g.fillRect(200,(y2-a1),w2,(a1));
		g.setColor(Color.blue);
		g.fillRect(300,(y2-a2),w2,(a2));
		g.setColor(Color.green);
		g.fillRect(400,(y2-a3),w2,(a3));
		g.setColor(Color.yellow);
		g.fillRect(500,(y2-a4),w2,(a4));
		}
			
		}
	}
		
		


		
		
		
		
		
		
		
		
		
		
		