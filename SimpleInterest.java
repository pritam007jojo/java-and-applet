import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterest extends Applet{

	Label l1,l2,l3,l4;
	TextField tf1,tf2,tf3,tf4;
	Choice ch1;
	Button b1,b2;
	public void init()
	{
		l1= new Label("PRINCIPLE");
		l2= new Label("RATE");
		l3= new Label("TIME");
		l4= new Label("RATE");
		
		tf1 = new TextField(15);
		tf2 = new TextField(15);
		tf3 = new TextField(15);
		tf4 = new TextField(15);
		
		ch1 = new Choice();
		b1= new Button("CALCULATE");
		
		
		add(l1);
		add(tf1);
		add(l2);
		add(ch1);
		add(l3);
		add(tf3);
		add(l4);
		add(tf3);
		add(b1);
		add(tf4);
		
		ch1.addItem("2");
		ch1.addItem("4");
		ch1.addItem("6");
		ch1.addItem("8");
		ch1.addItem("10");
		
		ch1.addItemListener(new MyChoice());
		b1.addActionListener(new MyButton());
	}
	class MyButton implements ActionListener{
		public void actionPerformed(ActionEvent ae)		
		{
			float x=Float.parseFloat(tf1.getText());
			float y=Float.parseFloat(tf2.getText());
			float z = (x*y*r)/100; 
			tf3.setText(""+z);
		}
	}
	class MyChoice implements ItemListener{
		public void itemStateChanged(ItemEvent ie)
		{
			r=Integer.parseInt(ch1.getSelectedItem());
		}
	}   
	
	
	
	
	}

}