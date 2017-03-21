import java.applet.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class calender extends Applet{

	int MONTH_DAYS = 31;
	Label Month,Year;
	Label[] Lbarr = new Label[42];
	Choice mn;
	Scrollbar sb;
	TextField tf,tf1;
	int mon,year,y;
	public void init()
	{	
		Month =new Label("Month");
		mn = new Choice();
		tf = new TextField(7);
		Year = new Label("year");
		tf1=new TextField(5);
		sb = new Scrollbar(Scrollbar.HORIZONTAL, 1, 1,  1900, 2200);

		
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		p1.setLayout(new GridLayout(1,1));
		p2.setLayout(new GridLayout(6,7));
		p3.setLayout(new GridLayout(1,4));
		
		p1.add(Month);
		p1.add(mn);
		p3.add(Year);
		p3.add(sb);
		p3.add(tf1);
		p3.add(tf);

		for(int i=0;i<42;i++)
		{
			if(i<7)
			{
				Lbarr[0]=new Label("SUN");
				Lbarr[1]=new Label("MON");
				Lbarr[2]=new Label("TUE");
				Lbarr[3]=new Label("WED");
				Lbarr[4]=new Label("THURS");
				Lbarr[5]=new Label("FRI");
				Lbarr[6]=new Label("SAT");
			}
			else
			{
			Lbarr[i] = new Label("  "); 
			}
			p2.add(Lbarr[i]);
			
		}	
				
		mn.addItem("1");
		mn.addItem("2");
		mn.addItem("3");
		mn.addItem("4");
		mn.addItem("5");
		mn.addItem("6");
		mn.addItem("7");
		mn.addItem("8");
		mn.addItem("9");
		mn.addItem("10");
		mn.addItem("11");
		mn.addItem("12");
		
		setLayout(new BorderLayout());
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		
		mn.addItemListener(new MyChoice());
		sb.addAdjustmentListener(new MyScroll());
		
	}
	class MyChoice implements ItemListener{
		public void itemStateChanged(ItemEvent ie)
		{
			mon=Integer.parseInt(mn.getSelectedItem());
			int md = calculate();
			intializelabel(md);
		}
	}  
	class MyScroll implements   AdjustmentListener{
		public void adjustmentValueChanged(AdjustmentEvent e)
		{
			y= sb.getValue();
			tf1.setText( Integer.toString(y));
			year= Integer.parseInt(tf1.getText());
			int md = calculate();
			intializelabel(md);
		}
	}


	void intializelabel(int a)
	{
		
		for(int k=1,i=7;i<42&&k<=a;i++)
		{
			
			if(i > MONTH_DAYS+7)
			{
				
				Lbarr[i].setText("" + k);
				k++;
			}
			else
				Lbarr[i].setText("-");
		}
	}
	int leap(int y)
	{
		if(y%400==0 || (y%4==0 && y%100!=0))
			return 1;
		else return 0;
	}
	int calculate()
	{
		int x=0,count=0,temp = 0;
		int gtot=0;
		int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=1900;i<year;i++)
		{
			if(leap(i)==1)
				gtot+=366;
			else
				gtot+=365;
		}
		if(leap(year)==1)
			days[1]=29;
		for(int i=1;i<mon;i++)
		{
			gtot+=days[i-1];
		}
		temp = days[mon-1];
		MONTH_DAYS = (gtot % 7);
		if(gtot%7==0)
		{
			tf.setText("MONDAY");
		}
		if(gtot%7==1)
		{
			tf.setText("TUE");
		}
		if(gtot%7==2)
		{
			tf.setText("WED");
		}
		if(gtot%7==3)
		{
			tf.setText("THURS");
		}
		if(gtot%7==4)
		{
			tf.setText("FRI");
		}
		if(gtot%7==5)
		{
			tf.setText("SAT");
		}
		if(gtot%7==6)
		{
			tf.setText("FRI");
		}
		
		return temp;
	}
	
}