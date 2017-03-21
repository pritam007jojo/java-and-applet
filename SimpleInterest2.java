


import java.applet.*;
import java.awt.*;
import java.awt.event.*; 
public class SimpleInterest2 extends Applet{

	Label principle,rate,time,ammount,ul1,ul2,ul3;
	TextField tf1,tf4,tf2;
	//tf1 =principle textfield
	//tf4=ammount
	//tf2=time textfield
	Choice ratech1;
	Scrollbar timesc;
	Checkbox cb1,cb2;
	Button btn;
	int r,n,y,b;
	double sum=0;
	CheckboxGroup Grp1;
	public void init()
	{
		principle = new Label("PRINCIPLE");
		rate= new Label("RATE");
		time= new Label("TIME");
		ammount= new Label("AMMOUNT");
		ul1= new Label("");
		ul2= new Label("");
		ul3= new Label("");
		tf1 = new TextField(15);
		tf2= new TextField(11);
		tf4 = new TextField(15);
		ratech1 = new Choice();
		timesc  = new Scrollbar(Scrollbar.HORIZONTAL, 1, 1,  1, 11);
		btn= new Button("Reset");
		Grp1 = new CheckboxGroup();
		cb1=new Checkbox("Simple Interest",Grp1,true);
		cb2=new Checkbox("Compound Interest",Grp1,false);
		
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		p1.setLayout(new GridLayout(4,1));
		p2.setLayout(new GridLayout(4,1));
		p3.setLayout(new GridLayout(4,1));
		p4.setLayout(new GridLayout(1,1));
		setLayout(new BorderLayout());
		p1.add(principle);
		p2.add(tf1);
		p1.add(rate);
		p2.add(ratech1);
		p1.add(time);
		p2.add(timesc);
		p1.add(ammount);
		p2.add(tf4);
		p3.add(ul1);
		p3.add(ul2);
		p3.add(tf2);
		p3.add(ul3);
		p4.add(cb1);
		p4.add(cb2);
		
		ratech1.addItem("0");
		ratech1.addItem("2");
		ratech1.addItem("4");
		ratech1.addItem("6");
		ratech1.addItem("8");
		ratech1.addItem("10");
		
		
		add(p1,BorderLayout.WEST);
		add(p2,BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		add(p3,BorderLayout.EAST);
		add(p4,BorderLayout.NORTH);
		cb1.addItemListener(new MyGroup());
		cb2.addItemListener(new MyGroup());
		ratech1.addItemListener(new MyChoice());
		timesc.addAdjustmentListener(new MyScroll());
		tf1.addTextListener(new Myclass());
		btn.addActionListener(new MyButton());

			
	
	}
	class Myclass implements TextListener{
		public void textValueChanged(java.awt.event.TextEvent te) {
			String str,str1;
			str= tf1.getText();
			 b= Integer.parseInt(str);
			 if(checkCheckbox() == "Simple Interest")
				calculate();
			else
				calculate1();
		}
		
}
	class MyChoice implements ItemListener{
		public void itemStateChanged(ItemEvent ie)
		{
			r=Integer.parseInt(ratech1.getSelectedItem());
			 if(checkCheckbox() == "Simple Interest")
				calculate();
			else
				calculate1();
		}
	}  
		
	class MyScroll implements  AdjustmentListener{
		public void adjustmentValueChanged(AdjustmentEvent e)
		{	tf2.setText("");
			int x;
			n= timesc.getValue();
			x=n;
			tf2.setText( Integer.toString(x));
			y= Integer.parseInt(tf2.getText());
			 if(checkCheckbox() == "Simple Interest")
				calculate();
			else
				calculate1();
		}
	
	}
	class MyButton implements ActionListener{
		public void actionPerformed(ActionEvent ae)		
		{
			tf1.setText("");
			tf4.setText("");
			tf2.setText("");
			timesc.setValue(0);
			ratech1.select(0);
		}
	}
	class MyGroup implements ItemListener{
		public void itemStateChanged(ItemEvent ie)
		{
			if(cb1.getState()==true)
			{
				calculate();
			}
			else if(cb2.getState()==true)
			{
				calculate1();
			}
			
		}
	}

	void calculate()
	{
		sum = b+(b*y*r)/100;
		tf4.setText(Double.toString(sum));
	}
	void calculate1()
	{
		
		double j;
		j= r/100;
		sum = b+b*Math.pow((1+j),y);
		tf4.setText(Double.toString(sum));
	}
	String checkCheckbox()
	{
		Checkbox check = Grp1.getSelectedCheckbox();
		String checkName = check.getLabel();
		return checkName;
	}

}
