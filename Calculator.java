import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;

public class Calculator extends Applet
{
Button[] btn = new Button[16];
TextField tf;
String s,s1,s2,flag;
int a,b,c=0;

	public void init()
	{
		tf = new TextField(30);
		btn[0]=new Button("7");
		btn[1]=new Button("8");
		btn[2]=new Button("9");
		btn[3]=new Button("+");
		btn[4]=new Button("4");
		btn[5]=new Button("5");
		btn[6]=new Button("6");
		btn[7]=new Button("-");
		btn[8]=new Button("1");
		btn[9]=new Button("2");
		btn[10]=new Button("3");
		btn[11]=new Button("*");
		btn[12]=new Button("/");
		btn[13]=new Button("0");
		btn[14]=new Button("C");
		btn[15]=new Button("=");
		
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(4,4));
		for(int i=0;i<16;i++)
		{
			p1.add(btn[i]);
		}	
		setLayout(new BorderLayout());
		add(tf,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		for(int i=0;i<16;i++)
		btn[i].addActionListener(new MyButton());
		
	}
	class MyButton implements ActionListener{
		public void actionPerformed(ActionEvent ae)
		{
			String str = ae.getActionCommand();
			if(str.equals("1")||str.equals("2")||str.equals("3")||str.equals("4")||str.equals("5")||str.equals("6")||str.equals("7")||str.equals("8")||str.equals("9")||str.equals("0"))
			{
				s=tf.getText()+str;
				tf.setText(s);
			}
			else if(str.equals("+"))
			  {
				  System.out.println("the flag int + is :" +flag );
				 if(flag=="-")
				 {
					s1=tf.getText();
					c=c-Integer.parseInt(s1); 
					tf.setText("");
					flag="+";
				 }
				 else if (flag=="*")
				 {
					  s1=tf.getText();
					  c=c*Integer.parseInt(s1);
					  tf.setText("");
					  flag="+";
				 }
				else if(flag=="/")
				 {	
					 s1=tf.getText();
					 try{
					 c=c/Integer.parseInt(s1);
					 tf.setText("");
					 flag="+";
					 throw new ArithmeticException();
					 }
					 catch(ArithmeticException e)
					 {
						  tf.setText("ERROR");
					 }
				 }
				 else{
					 s1=tf.getText();
					 System.out.println("c before addition :"+c);
					 c=c+Integer.parseInt(s1);
					 System.out.println("c after addition :"+c);
					 tf.setText("");
					flag="+";
				 }
			  }
			else if(str.equals("-"))
			  {
				  System.out.println("the flag int - is :" +flag );
				if(flag=="+")
					{
					 s1=tf.getText();
					 c=c+Integer.parseInt(s1);
					 tf.setText("");
					flag="-";
					}
				else if (flag=="*")
				 {
					  s1=tf.getText();
					  c=c*Integer.parseInt(s1);
					  tf.setText("");
					  flag="-";
				 }
				else if(flag=="/")
				 {	
					 s1=tf.getText();
					 try{
					 c=c/Integer.parseInt(s1);
					 tf.setText("");
					 flag="-";
					 throw new ArithmeticException();
					 }
					 catch(ArithmeticException e)
					 {
						  tf.setText("ERROR");
						  tf.setText("");
					 }
				 }
				else{
					 s1=tf.getText();
					 System.out.println("c before subtraction :"+c);
					 if(flag=="null")
					 {
						c=Integer.parseInt(s1);
					 }
					else
					 {
						try{
							c=c-Integer.parseInt(s1);
							throw new NumberFormatException();
						}
						catch(NumberFormatException nf)
						{
							tf.setText("input formmat error");
						}
					 }
					 System.out.println("c after subtraction :"+c);
					 tf.setText("");
					 flag="-";
					}
			  }
			else if(str.equals("*"))
			  {
				if(flag=="-")
				 {
					s1=tf.getText();
					c=c-Integer.parseInt(s1); 
					tf.setText("");
					flag="*";
				 }
				else if(flag=="+")
					{
					 s1=tf.getText();
					 c=c+Integer.parseInt(s1);
					 tf.setText("");
					flag="*";
					}
				else if(flag=="/")
				{
					 s1=tf.getText();
					 try{
					 c=c/Integer.parseInt(s1);
					 tf.setText("");
					 flag="*";
					 throw new ArithmeticException();
					 }
					 catch(ArithmeticException e)
					 {
						  tf.setText("ERROR");
						  tf.setText("");
					 }
				}
				else
				{
				s1=tf.getText();
				if(flag=="null")
				{
					c=Integer.parseInt(s1);
				}
				else{
				c=c*Integer.parseInt(s1);
				}
				tf.setText("");
			    flag="*";
				}
			  }
			else if(str.equals("/"))
			  {
				 if(flag=="-")
				 {
					s1=tf.getText();
					c=c-Integer.parseInt(s1); 
					tf.setText("");
					flag="/";
				 }
				 else if (flag=="*")
				 {
					  s1=tf.getText();
					  c=c*Integer.parseInt(s1);
					  tf.setText("");
					  flag="/";
				 }
				 else if(flag=="+")
				 {
					s1=tf.getText();
					c=c+Integer.parseInt(s1);
				    tf.setText("");
					flag="/";
				 }
				 else{
					 s1=tf.getText();
					 if(flag=="null")
					 {
					  c=Integer.parseInt(s1);
					 }
					 else{
					 try{
					 c=c/Integer.parseInt(s1);
					 throw new ArithmeticException();
					 }
					 catch(ArithmeticException e)
					 {
						  tf.setText("ERROR");
					 }
					 }
					 tf.setText("");
					 flag="/";
				 }
			  }
			else if(str.equals("="))
			  {
			   s2=tf.getText();
			   b=Integer.parseInt(s2);
			   System.out.println(b);
				   if(flag.equals("+"))
					c=c+b;
				   if(flag.equals("-"))
					c=c-b;
				   if(flag.equals("*"))
					c=c*b;
				   if(flag.equals("/"))
					c=c/b;
			   tf.setText(String.valueOf(c));
			  }
			  if(str.equals("C"))
			  {
				  tf.setText("");
				  c=0;
				  flag="null";
			  }

		}
	}
}