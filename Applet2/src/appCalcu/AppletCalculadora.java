package appCalcu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppletCalculadora extends JFrame {
	JTextField t1;
	JButton [] bt;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	public double x=0;
	public double y=0;
	public double z=0;
	String var1;
	public AppletCalculadora(){
	super("Applet Calculadora");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	t1=new JTextField();
	t1.setEditable(false);
	JPanel p1=new JPanel();
	bt=new JButton[19];
	//p1.setLayout(new GridLayout(1,1));
	//p1.add(l1);
	add(t1,BorderLayout.NORTH);
	p1.setLayout(new GridLayout(6,3,5,5));
	for(int i=1;i<10;i++)
	{
		
		p1.add(bt[i]=new JButton(" "+i));
	}
	bt[10]=new JButton(".");
	bt[11]=new JButton(" "+0);
	bt[12]=new JButton("CE");
	bt[13]=new JButton("+");
	bt[14]=new JButton("-");
	bt[15]=new JButton("=");
	bt[16]=new JButton("*");
	bt[17]=new JButton("/");
	bt[18]=new JButton("C");
	p1.add(bt[10]);
	p1.add(bt[11]);
	p1.add(bt[12]);
	p1.add(bt[13]);
	p1.add(bt[14]);
	p1.add(bt[15]);
	p1.add(bt[16]);
	p1.add(bt[17]);
	p1.add(bt[18]);
	add(p1);
	for(int m=1;m<19;m++){
	bt[m].addActionListener(new Oyente1());
	}
	
	setSize(400,500);
	setVisible(true);
	
}
	
	class Oyente1 implements ActionListener{
			
		
		String var;
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == bt[1]){
				var=t1.getText();
				t1.setText(var+String.valueOf(1));
				
			}
			else if(e.getSource() == bt[2]){
				var=t1.getText();
				t1.setText(var+String.valueOf(2));
			}
			else if(e.getSource() == bt[3]){
				var=t1.getText();
				t1.setText(var+String.valueOf(3));
			}
			else if(e.getSource() == bt[4]){
				var=t1.getText();
				t1.setText(var+String.valueOf(4));
			}
			else if(e.getSource() == bt[5]){
				var=t1.getText();
				t1.setText(var+String.valueOf(5));
			}
			else if(e.getSource() == bt[6]){
				var=t1.getText();
				t1.setText(var+String.valueOf(6));
			}
			else if(e.getSource() == bt[7]){
				var=t1.getText();
				t1.setText(var+String.valueOf(7));
			}
			else if(e.getSource() == bt[8]){
				var=t1.getText();
				t1.setText(var+String.valueOf(8));
			}
			else if(e.getSource() == bt[9]){
				var=t1.getText();
				t1.setText(var+String.valueOf(9));
			}
			else if(e.getSource() == bt[10]){
				var=t1.getText();
				
				t1.setText(var+".");
			}
			else if(e.getSource() == bt[11]){
				var=t1.getText();
				t1.setText(var+String.valueOf(0));
			}
			else if(e.getSource() == bt[12]){
				if(t1.getText().length()!=0){
					t1.setText(t1.getText().substring(0,t1.getText().length()-1));
				}
			}
			else if(e.getSource() == bt[13]){
				x= Double.parseDouble(t1.getText());
				t1.setText(t1.getText().substring(0,t1.getText().length()-t1.getText().length()));
				var1="+";
			    //y= Double.parseDouble(t1.getText());
			}
			else if(e.getSource() == bt[14]){
				x=Double.parseDouble(t1.getText());
				t1.setText(t1.getText().substring(0,t1.getText().length()-t1.getText().length()));
				var1="-";
			}
			else if(e.getSource() == bt[16]){
				x=Double.parseDouble(t1.getText());
				t1.setText(t1.getText().substring(0,t1.getText().length()-t1.getText().length()));
				var1="*";
			}
			else if(e.getSource() == bt[17]){
				x=Double.parseDouble(t1.getText());
				t1.setText(t1.getText().substring(0,t1.getText().length()-t1.getText().length()));
				var1="/";
			}
			else if(e.getSource() == bt[15]){
				y=Double.parseDouble(t1.getText());
				if(var1 == "+"){
					
					z=x+y; 
					
					t1.setText(String.valueOf(z));
					
				}
				else if(var1 == "-"){
					z=x-y;
					
					t1.setText(String.valueOf(z));
				}
				else if(var1 == "*"){
					z=x*y;
					t1.setText(String.valueOf(z));
				}
				else if(var1 == "/"){
					z=x/y;
					t1.setText(String.valueOf(z));
				}
				else{
					t1.setText("null");
				}
			}
			
			else if(e.getSource() == bt[18]){
				x=0;
				y=0;
				z=0;
				var1="";	
				t1.setText(t1.getText().substring(0,t1.getText().length()-t1.getText().length()));
			}
		}
		
	
	}
	
	
	
public static void main(String[] args){
	AppletCalculadora frame = new AppletCalculadora();
}
}
