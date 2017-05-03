import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;


public class BackgroundColor extends Applet
{
	Label lbred,lbgreen,lbblue,lb1,lb2,lb3;
	Scrollbar sb1,sb2,sb3;
	TextField tf1,tf2,tf3;
	TextArea te;
	public void init()
	{
	te  =new TextArea(10,40);
	lbred= new Label("RED");
	lbblue= new Label("GREEN");
	lbgreen= new Label("BLUE");
	sb1  = new Scrollbar(Scrollbar.HORIZONTAL, 1, 1,  0, 255);
	sb2  = new Scrollbar(Scrollbar.HORIZONTAL, 1, 1,  0, 255);
	sb3  = new Scrollbar(Scrollbar.HORIZONTAL, 1, 1,  0, 255);
	tf1 = new TextField(3);
	tf2 = new TextField(3);
	tf3 = new TextField(3);
	Panel p1 = new Panel();
	p1.setLayout(new GridLayout(3,3));
	p1.add(lbred);
	p1.add(sb1);
	p1.add(tf1);
	p1.add(lbgreen);
	p1.add(sb2);
	p1.add(tf2);
	p1.add(lbblue);
	p1.add(sb3);
	p1.add(tf3);
	setLayout(new BorderLayout());
	add(p1,BorderLayout.SOUTH);
	add(te,BorderLayout.CENTER);
	sb1.addAdjustmentListener(new MyScroll());
	sb2.addAdjustmentListener(new MyScroll());
	sb3.addAdjustmentListener(new MyScroll());
	}
	
	class MyScroll implements  AdjustmentListener{
		public void adjustmentValueChanged(AdjustmentEvent e)
		{
			int x,y,z;
			x= sb1.getValue();
			y= sb2.getValue();
			z= sb3.getValue();
			Color c= new Color(x,y,z);
			te.setBackground(c);
			tf1.setText( Integer.toString(x));
			tf2.setText( Integer.toString(y));
			tf3.setText( Integer.toString(z));
		}
	}
}
	
/*<applet code="BackgroundColor.class" width=500 height=500></applet>*/
	