package variadorcol;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DibujoColorVar extends JFrame implements AdjustmentListener {
Scrollbar [] m;
int b,r,g;
Color colr,colr2;
JLabel[] lr;
JTextField[] tr;

Container p;
public DibujoColorVar(){
	super("Ventana de colores");
	p=this.getContentPane();
	m=new Scrollbar[3];
	lr=new JLabel[3];
	tr=new JTextField[3];
	tr[0]=new JTextField("");
	tr[0].setEditable(false);
	tr[0].setEnabled(false);
	tr[1]=new JTextField("");
	tr[1].setEditable(false);
	tr[1].setEnabled(false);
	tr[2]=new JTextField("");
	tr[2].setEditable(false);
	tr[2].setEnabled(false);
	lr[0]=new JLabel("Deslizador 1");
	lr[0].setForeground(colr2);
	lr[1]=new JLabel("Deslizador 2");
	lr[1].setForeground(colr2);
	lr[2]=new JLabel("Deslizador 3");
	lr[2].setForeground(colr2);
	m[0]=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
	m[1]=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
	m[2]=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
	
	setLayout(new GridLayout(9,1));
	add(m[0]);
	add(m[1]);
	add(m[2]);
	add(lr[0]);
	add(tr[0]);
	add(lr[1]);
	add(tr[1]);
	add(lr[2]);
	add(tr[2]);
	m[0].addAdjustmentListener(this);
	m[1].addAdjustmentListener(this);
	m[2].addAdjustmentListener(this);
	colr=new Color(r,g,b);
	p.setBackground(colr);
		
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(100,300);
	setVisible(true);
}
public void adjustmentValueChanged(AdjustmentEvent ae){
	if(ae.getSource()==m[0]){
		b=m[0].getValue();
		tr[0].setText(String.valueOf(b));
		tr[0].setBackground(colr);
		tr[0].setForeground(colr2);
		
	}
	else if(ae.getSource()==m[1]){
		r=m[1].getValue();
		tr[1].setText(String.valueOf(r));
		tr[1].setBackground(colr);
		tr[1].setForeground(colr2);
		
	}
	else if(ae.getSource()==m[2]){
		g=m[2].getValue();
		tr[2].setText(String.valueOf(g));
		tr[2].setBackground(colr);
		tr[2].setForeground(colr2);
	}
	colr=new Color(r,g,b);
	colr2=new Color(255-r,255-g,255-b);
	p.setBackground(colr);
	
}


public static void main(String [] args){
	DibujoColorVar frame1=new DibujoColorVar();
}
}
