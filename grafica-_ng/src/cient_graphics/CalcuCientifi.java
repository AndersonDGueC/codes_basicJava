package cient_graphics;
import java.awt.*;
import javax.swing.*;

public class CalcuCientifi extends JFrame {
	JButton [] bt;
	JLabel l;
	JTextField t;
	JPanel [] pt;
public CalcuCientifi(){
	super("Calculador cientifica");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	l=new JLabel("Resultado: ");
	t=new JTextField();
	t.setEditable(false);
	pt=new JPanel[2];
	pt[0]=new JPanel();
	pt[1]=new JPanel();
	
	pt[0].setLayout(new GridLayout(1,2));
	pt[0].add(l);
	pt[0].add(t);
	pt[1].setLayout(new GridLayout(7,3));
	bt= new JButton[21];
	bt[10]=new JButton("+");
	bt[11]=new JButton("-");
	bt[12]=new JButton("*");
	bt[13]=new JButton("/");
	bt[14]=new JButton(".");
	bt[15]=new JButton("sin");
	bt[16]=new JButton("cos");
	bt[17]=new JButton("tan");
	bt[18]=new JButton("raiz cuadrada");
	bt[19]=new JButton("CE");
	bt[20]=new JButton("C");
	for(int i=0;i<21;i++){
		if(i<10){
		bt[i]=new JButton(""+i);
		pt[1].add(bt[i]);
		}
		else{
		pt[1].add(bt[i]);
		}
		
	}
	
	
	//pt[1].add(bt[10]);
	add(pt[0],BorderLayout.NORTH);
	add(pt[1],BorderLayout.CENTER);
	setSize(400,500);
	setVisible(true);
	}

public static void main(String [] args){
	CalcuCientifi cc=new CalcuCientifi();
}
}
