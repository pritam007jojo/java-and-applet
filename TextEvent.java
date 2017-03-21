import java.applet.*;
import java.awt.*;
import java.awt.event.*; 
public class TextEvent extends Applet{
	Button upper,lower,proper;
	TextArea te;
	public void init()
	{
		te  =new TextArea(10,40);
		upper=new Button("UPPER");
		lower=new Button("LOWER");
		proper=new Button("PROPER");
		Panel p=new Panel();
		p.setLayout(new GridLayout(1,3));
		p.add(upper);
		p.add(lower);
		p.add(proper);
		
		setLayout(new BorderLayout());
		add(te,BorderLayout.CENTER);
		add(p,BorderLayout.SOUTH);
		
		upper.addActionListener(new MyButton());
		lower.addActionListener(new MyButton());
		proper.addActionListener(new MyButton());
	}
	class MyButton implements ActionListener{
		public void actionPerformed(ActionEvent ae)
		{
			String str=(te.getText());
			int length= str.length();
			String str1 = ae.getActionCommand();
			String temp="",temp1;
			temp1=str;
			if(str1.equals("UPPER"))
			{
				for(int i=0;i<length;i++)
				{
					char cr= str.charAt(i);
					if(Character.isLowerCase(cr))
					{
						temp+=Character.toUpperCase(cr);
					}
					else 
					{
						temp+=cr;
					}
				}
				te.setText(temp);
				
			}
			else if(str1.equals("LOWER"))
			{
				for(int i=0;i<length;i++)
				{
					char cr= str.charAt(i);
					if(Character.isUpperCase(cr))
					{
						temp+=Character.toLowerCase(cr);
					}
					else 
					{
						temp+=cr;
					}
				}
				te.setText(""+temp);
				
			}
			else{
					str=" "+str.toLowerCase();
					 temp = "";
				for(int i=1;i<str.length();i++)
				{
					char cr= str.charAt(i);
					if((str.charAt(i-1)) == ' ' || str.charAt(i-1)=='\n') 		
					{
						
						temp= temp+Character.toUpperCase(cr);
						
					}
					
					else
					{
						temp+=cr;
					
				}
				}
				temp=temp.trim();
				te.setText(""+temp);
				
			
			}
			
		}
	}
}