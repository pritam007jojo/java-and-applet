import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;


public class MyWord extends Applet
{
	Label lbbackcolor,lbfontcolor,lbsize,lbstyle,lbfont;
	List bc,fc;
	TextArea te;
	Choice font,style;
	Scrollbar sb;
	TextField tf;
	int sizes,index;
	Color colour1,colour2;
	Font f;
	String  str1,str2,str3,str4;
	public void init()
	{
	tf= new TextField(3);
	bc= new List(6); 
	fc= new List(6); 
	te= new TextArea(10,40);
	sb  = new Scrollbar(Scrollbar.HORIZONTAL, 1, 1,  1, 40);
	lbbackcolor= new Label("BACK COLOR");
	lbfontcolor= new Label("FONT COLOR");
	lbstyle =  new Label("STYLE");
	lbfont = new Label("FONT");
	lbsize= new Label("SIZE");
	font = new Choice();
	style= new Choice();
	font.addItem("Arial");
	font.addItem("Courier");
	font.addItem("Serif");
	style.addItem("BOLD");
	style.addItem("ITALICS");
	style.addItem("REGULAR");
	style.addItem("Bold + Italics");
	bc.add("red"); 
	bc.add("green"); 
	bc.add("black"); 
	bc.add("white"); 
	bc.add("yellow"); 
	bc.add("blue"); 
	fc.add("red"); 
	fc.add("green"); 
	fc.add("black"); 
	fc.add("white"); 
	fc.add("yellow"); 
	fc.add("blue");
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Panel p4 = new Panel();
	p1.setLayout(new GridLayout(1,4));
	p2.setLayout(new GridLayout(2,1));
	p3.setLayout(new GridLayout(2,1));
	p4.setLayout(new GridLayout(1,3));
	p1.add(lbfont);
	p1.add(font);
	p1.add(lbstyle);
	p1.add(style);
	p2.add(lbbackcolor);
	p2.add(bc);
	p3.add(lbfontcolor);
	p3.add(fc);
	p4.add(lbsize);
	p4.add(sb);
	p4.add(tf);
	
	
	setLayout(new BorderLayout());
	add(p1,BorderLayout.NORTH);
	add(te,BorderLayout.CENTER);
	add(p2,BorderLayout.EAST);
	add(p3,BorderLayout.WEST);
	add(p4,BorderLayout.SOUTH);
	font.addItemListener(new Myclass());
	style.addItemListener(new Myclass());
	sb.addAdjustmentListener(new MyScroll());
	bc.addItemListener(new Myclass());
	fc.addItemListener(new Myclass());
	}
	class Myclass implements ItemListener{
		public void itemStateChanged(ItemEvent ie)
		{
			index=-1;
			str1="-";
			str1=font.getSelectedItem();
			index=style.getSelectedIndex();
			edit1();
			str3=fc.getSelectedItem();
			setEditor();
			str4=bc.getSelectedItem();
			setEditor();
		}
	}
	class MyScroll implements  AdjustmentListener{
		public void adjustmentValueChanged(AdjustmentEvent e)
		{
			sizes=0;
			sizes= sb.getValue();
			tf.setText( Integer.toString(sizes));
			edit1();
		}
	}
	void setEditor()
	{
		if(str3=="red");
		{
			colour1=Color.red;
		}
		if(str3=="green")
		{
			colour1=Color.green;
		}
	    if(str3=="black")
		{
			colour1=Color.black;
		} 
		if(str3=="white")
		{
			colour1=Color.white;
		}
		if(str3=="yellow")
		{
			colour1=Color.yellow;
		}
		if(str3=="blue")
		{
			colour1=Color.blue;
		}
		if(str4=="red");
		{
			colour2=Color.red;
		}
		if(str4=="green")
		{
			colour2=Color.green;
		}
	    if(str4=="black")
		{
			colour2=Color.black;
		} 
		if(str4=="white")
		{
			colour2=Color.white;
		}
		if(str4=="yellow")
		{
			colour2=Color.yellow;
		}
		if(str4=="blue")
		{
			colour2=Color.blue;
		}
		te.setForeground(colour1);
		te.setBackground(colour2);
	}
	void edit1()
	{
		if(index==0)
		{
			f= new Font(str1,Font.BOLD,sizes);
			te.setFont(f);
		}
		else if(index==1)
		{
			f= new Font(str1,Font.ITALIC,sizes);
			te.setFont(f);
		}
		else if(index==1)
		{
			f= new Font(str1,Font.PLAIN,sizes);
			te.setFont(f);
		}
		else 
		{
			f= new Font(str1,Font.BOLD+Font.ITALIC,sizes);
			te.setFont(f);
		}
	}
}
	
/*<applet code="MyWord.class" width=500 height=500></applet>*/
	