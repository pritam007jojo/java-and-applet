import java.applet.*;
import java.awt.*;


public class Addition extends Applet
{
	Label l1,l2,l3;
	TextField lf1,lf2,lf3;
	Button b1;
	
	public void init()
	{
		l1= new Label("No1");
		l2= new Label("No1");
		l3= new Label("No1");
		
		lf1 = new TextField(15);
		lf2 = new TextField(15);
		lf3 = new TextField(15);
		
		b1= new Button("ADD");
		
		add(l1);
		add(lf1);
		add(l2);
		add(lf2);
		add(l3);
		add(lf3);
		add(b1);
		
	}

}
