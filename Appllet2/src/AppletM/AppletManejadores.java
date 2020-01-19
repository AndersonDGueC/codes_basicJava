package AppletM;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AppletManejadores extends JFrame {
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	public AppletManejadores(){
	super("Applet Manejadores"); 
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new GridLayout(3,1));
	l1=new JLabel("X");
	l2=new JLabel("Y");
	l3=new JLabel("RESULTADO");
	t1=new JTextField(14);
	t2=new JTextField(14);
	t3=new JTextField(14);
	t3.setEditable(false);
	b1=new JButton("+");
	b2=new JButton("-");
	b3=new JButton("*");
	b4=new JButton("/");
	b5=new JButton("Raizx");
	b6=new JButton("Raizy");
	b7=new JButton("x a la y");
	b8=new JButton("y a la x");
	b9=new JButton("x mod y");
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	p1.setLayout(new GridLayout(1,3));
	p1.add(l1);
	p1.add(l2);
	p1.add(l3);
    p2.setLayout(new GridLayout(1,3));
    p2.add(t1);
    p2.add(t2);
    p2.add(t3);
    p3.setLayout(new GridLayout(3,3));
    p3.add(b1);
    p3.add(b2);
    p3.add(b3);
    p3.add(b4);
    p3.add(b5);
    p3.add(b6);
    p3.add(b7);
    p3.add(b8);
    p3.add(b9);
	add(p1);
	add(p2);
	add(p3);
	b1.addActionListener(new OyenteB1());
	b2.addActionListener(new OyenteB2());
	b3.addActionListener(new OyenteB3());
	b4.addActionListener(new OyenteB4());
	b5.addActionListener(new OyenteB5());
	b6.addActionListener(new OyenteB6());
	b7.addActionListener(new OyenteB7());
	b8.addActionListener(new OyenteB8());
	b9.addActionListener(new OyenteB9());
	setSize(500,350);
	setVisible(true);
}
	class OyenteB1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());
			int z=x+y;
			t3.setText(String.valueOf(z));
		}
	}
	
	class OyenteB2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());
			int z=x-y;
			t3.setText(String.valueOf(z));
		}
			
	}
	
	class OyenteB3 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());
			int z=x*y;
			t3.setText(String.valueOf(z));
		}
			
	}
	
	class OyenteB4 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());
			int z=x/y;
			t3.setText(String.valueOf(z));
		}
			
	}
	
	class OyenteB5 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int x=Integer.parseInt(t1.getText());
			
			
			t2.setText(String.valueOf(0));
			
			
			//int y=Integer.parseInt(t2.getText());
		
			double z=Math.sqrt(x);
			t3.setText(String.valueOf(z));
		}
			
	}
	
	class OyenteB6 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int y=Integer.parseInt(t2.getText());
			
			
			t1.setText(String.valueOf(0));
			
			
			//int y=Integer.parseInt(t2.getText());
		
			double z=Math.sqrt(y);
			t3.setText(String.valueOf(z));
		}
			
	}
	
	class OyenteB7 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int x=Integer.parseInt(t1.getText());
			
			
			int y=Integer.parseInt(t2.getText());
		
			double z=Math.pow(x,y);
			t3.setText(String.valueOf(z));
		}
			
	}
	
	class OyenteB8 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int x=Integer.parseInt(t1.getText());
			
			
			int y=Integer.parseInt(t2.getText());
		
			double z=Math.pow(y,x);
			t3.setText(String.valueOf(z));
		}
			
	}
	
	class OyenteB9 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int x=Integer.parseInt(t1.getText());
			
			
			int y=Integer.parseInt(t2.getText());
		
			double z=x%y;
			t3.setText(String.valueOf(z));
		}
			
	}
	
	public static void main(String[] args){
		AppletManejadores frame= new AppletManejadores(); 
	}
	}

