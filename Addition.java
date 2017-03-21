import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Addition extends Applet
{
	Label l1,l2,l3;
	TextField lf1,lf2,lf3;
	Button b1,b2,b3,b4;
	
	public void init()
	{
		l1= new Label("No1");
		l2= new Label("No2");
		l3= new Label("Result ");
		
		lf1 = new TextField(15);
		lf2 = new TextField(15);
		lf3 = new TextField(15);
		
		b1= new Button("ADD");
		b2= new Button("SUBSTRACT");
		b3= new Button("MULTIPLY");
		b4= new Button("DIVISION");

		
		add(l1);
		add(lf1);
		add(l2);
		add(lf2);
		add(l3);
		add(lf3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		b1.addActionListener(new MyButton());
		b2.addActionListener(new MyButton());
		b3.addActionListener(new MyButton());
		b4.addActionListener(new MyButton());
	}
	class MyButton implements ActionListener{
		public void actionPerformed(ActionEvent ae)
		{
			int a=Integer.parseInt(lf1.getText());
			int b=Integer.parseInt(lf2.getText());
			String str = ae.getActionCommand();
			if(str.equals("ADD"))
			{
				int c=a+b;
				lf3.setText(""+c);
			}
			
			else if(str.equals("SUBSTRACT"))
			{
				int d=a-b;
				lf3.setText(""+d);
			}
			else if(str.equals("MULTIPLY"))
			{
				int e=a*b;
				lf3.setText(""+e);
			}
			else
			{
				int f=a/b;
				lf3.setText(""+f);
			}
		}
	}

}
