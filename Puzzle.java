import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;


public class Puzzle extends Applet
{
	Button[] btn = new Button[16];
	Label lb,lb1,lb2,lb3;
	Button btn1;
	int arr[] = new  int[16];
	int temp,temp1=0,temp2=0,blank=0,count=0;
	
	public void init()
	{
		Button btn1= new Button("RESET");
		lb = new Label("                        15 PUZZLE GAME                   ");
		lb1 = new Label(" ");
		lb2 = new Label("");
		lb3 = new Label("");
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(4,4));
		Panel p2=new Panel();
		p2.setLayout(new GridLayout(1,2));
		for(int i=0;i<15;i++)
		{
			arr[i]=0;
		}		
		for(int i=0;i<16;i++)
		{
			int j;
			if(i<15)
			{
				j= calculate(i);
				String str= Integer.toString(j);
				btn[i] = new Button(str); 
				p1.add(btn[i]);
			}
			else{
				btn[i] = new Button(""); 
				p1.add(btn[i]);
				arr[i]=0;
			}
			
		}
		p2.add(btn1);
		p2.add(lb3);
		setLayout(new BorderLayout());
		add(p1,BorderLayout.CENTER);
		add(lb,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);
		add(lb1,BorderLayout.EAST);
		add(lb2,BorderLayout.WEST);
		for(int i=0;i<=15;i++)
		{
		btn[i].addActionListener(new MyButton());
		}
		btn1.addActionListener(new MyButton());
	}
	class MyButton implements ActionListener{
		public void actionPerformed(ActionEvent ae)
		{
			String str = ae.getActionCommand();
			
			if(str.equals("RESET"))
			{
				calculate1();
			}
			else if(str.equals(""))
			{
				
			}
			else{
				System.out.println("item clicked");
				
				int j =Integer.parseInt(str);
				System.out.println("button clicked is "+j);
				for(int i=0;i<16;i++)                                                  
				{
					if(arr[i]==j)
					{
						temp1=i;
						System.out.println("array index is "+temp1);
					}
					if(arr[i]==blank)
					{
						temp2=i;
						System.out.println("array index for blank is "+temp2);
					}
				}
				if(((temp1+4)==temp2)||((temp1-4)==temp2)||((temp1-1)==temp2)||((temp1+1)==temp2))
				{
					System.out.println("if true");
					String str1=Integer.toString(j);
					btn[temp1].setLabel("");
					btn[temp2].setLabel(str);
					arr[temp1]=0;
					arr[temp2]=j;
					calculate3();
					count++;
				}
			}
		}
	}
	int calculate(int i)
	{
		int j=(int)((Math.random()*15)+1);
		int value=0,count1=0,n;
		n=j;
		if(i==0)
		{
			arr[i]=j;
			value =arr[i];
		}
		if(i>0)
		{
			for(int l=0;l<i;l++)
			{
				
				if(arr[l]==n)
				{
					n=(int)((Math.random()*15)+1);
					l=-1;
					count1++;
				}
			}
			if(count1==0)
			{
				arr[i]=j;
				value=j;
			}
			else if(count1>=1)
			{
				arr[i]=n;
				value=n;
			}
			

		}
		return value;
	}
	void calculate1()
	{
		for(int i=0;i<16;i++)
		{
			arr[i]=0;
		}
		for(int i=0;i<15;i++)
		{
			btn[i].setLabel(""+calculate(i));
		}
		btn[15].setLabel("");
		
		
		
	}
	void calculate3()
	{
		int j=1,count2=0;
		for(int i=0;i<15;i++)
		{
			if(arr[i]==j)
			{
				count2++;
				
			}
			j++;
		}
		System.out.println(count2);
		if(count2==14)
		{
			for(int i=0;i<16;i++)
				btn[i].setEnabled(false);
			if(count<10)
			{
			lb3.setText("you are a genius!!!!your movement count is "+count);
			}
			else if(count>10&&count<50)
			{
			lb3.setText("you need to improve!!!!your movement count is "+count);	
			}
			else{
			lb3.setText("you are a noob!!!dont play this game.your movement count is "+count);
			}
		}
	}
}