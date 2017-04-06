import java.applet.*;
import java.awt.*;
import java.awt.event.*; 
public class Bargraph extends Applet
{
Label qty1,qty2,qty3,qty4;
TextField tf1,tf2,tf3,tf4;
Button btn;
double a,b,c,d,total;
int a1,a2,a3,a4,flag,max,per;
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
	btn = new Button("SHOW");
	Panel p1=new Panel();
	p1.setLayout(new GridLayout(2,4));
	p1.add(qty1);
	p1.add(tf1);
	p1.add(qty2);
	p1.add(tf2);
	p1.add(qty3);
	p1.add(tf3);
	p1.add(qty4);
	p1.add(tf4);
	setLayout(new BorderLayout());
	add(p1,BorderLayout.NORTH);
	add(btn,BorderLayout.SOUTH);
	btn.addActionListener(new MyButton());
}
	class MyButton implements ActionListener{
		public void actionPerformed(ActionEvent ae)
		{	
		double a11,a12,a13,a14;
		a=Double.parseDouble(tf1.getText());
		b=Double.parseDouble(tf2.getText());
		c=Double.parseDouble(tf3.getText());
		d=Double.parseDouble(tf4.getText());
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
		if(a1>=a2&&a1>=a3&&a1>=a4)
		{
			per=(int)a1;
		}
		else if(a2>=a1&&a2>=a3&&a2>=a4)
		{
			per=(int)a2;
		}
		else if(a3>=a1&&a3>=a2&&a3>=a4)
		{
			per=(int)a3;
		}
		else 
		{
			per=(int)a4;
		}
		flag=1;
		repaint();
		}
	}
	public void paint(Graphics g)
	{
		int y=600,w=30,h,pt;
		double mark;
		g.drawLine(100,600,100,100);
		g.drawLine(100,600,600,600);
		g.drawString("Y AXIS",90,100);
		g.drawString("X AXIS",600,590);
		if (flag==1)
		{
		mark =0.10*(per);
		System.out.println("mark is =" +mark);
		pt=(int)mark;
		System.out.println("pt is =" +pt);
		for(int i=1;i<=10;i++)
		{
		g.drawString("__",100,(y-(i*pt)));
		
		}
		g.setColor(Color.red);
		g.fillRect(200,(y-a1),w,(a1));
		g.setColor(Color.blue);
		g.fillRect(300,(y-a2),w,(a2));
		g.setColor(Color.green);
		g.fillRect(400,(y-a3),w,(a3));
		g.setColor(Color.yellow);
		g.fillRect(500,(y-a4),w,(a4));
		}
	}
}