//@Autor: Anderson Danilo Guerrero Calpa
//fecha:16-sep-2019

package applettI123;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;






public class AppletInterfaz extends JFrame {
public Choice ch1,ch2;
JLabel l1,l2,l3;
Container p;
public Color [] c={Color.black, Color.green, Color.blue,Color.yellow, Color.red,  Color.white};
public Graphics g;
public JButton b1,b2;


public AppletInterfaz(){
	
	super("Applet Interfaz");
	setLayout(new GridLayout(3,1,1,1));
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	l1=new JLabel("       Dibuja tu Figura Favorita");
	Font f=new Font("Monospaced",Font.BOLD,24);
	l1.setFont(f);
	l1.setForeground(Color.blue);
	l2=new JLabel("Figura");
	l3=new JLabel("Color");
	ch1=new Choice();
	ch2=new Choice();
	ch1.add("");
	ch1.add("Cuadrado");
	ch1.add("Rectangulo");
	ch1.add("Circulo");
	ch1.add("Triangulo");
	ch2.add("");
	ch2.add("Verde");
	ch2.add("Azul");
	ch2.add("Amarillo");
	ch2.add("Rojo");
	ch2.add("Blanco");
	b1=new JButton("Crear");
	b2=new JButton("Borrar");
	JPanel p1= new JPanel();
	JPanel p2= new JPanel();
	JPanel p3= new JPanel();
	p1.setLayout(new BorderLayout());
	p1.add(l1);
	add(p1,BorderLayout.NORTH);
	p2.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
	p2.add(l2);
	
	p2.add(ch1);	
	p2.add(l3);
	p2.add(ch2);
	p2.add(b1);
	p2.add(b2);
	add(p2,BorderLayout.CENTER);
	
	b1.addActionListener(new OyenteB1());
	b2.addActionListener(new OyenteB2());
	add(new MiDibujo());
	
	setSize(550,500);
	setVisible(true);

	
}



public static void main (String[] args){
	AppletInterfaz frame=new AppletInterfaz();
	
}

class OyenteB1 implements  ActionListener{
	public void actionPerformed(ActionEvent e){
		repaint();
	}
}

class OyenteB2 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		ch1.select(0);
		ch2.select(0);
		repaint();
		
	
	}
}
	
	
class MiDibujo extends JPanel{
	
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if("Triangulo"==ch1.getSelectedItem()){
			
			g.setColor(c[ch2.getSelectedIndex()]);
			
			int [] vx1 = {270,320,220};
			int [] vy1 = {5,120,120};
			g.fillPolygon(vx1,vy1,3); 	
		}
		else if("Cuadrado"==ch1.getSelectedItem()){
			super.paintComponent(g);
			g.setColor(c[ch2.getSelectedIndex()]);
			g.fillRect(200, 1, 125, 125);
			
		}
		else if("Rectangulo"==ch1.getSelectedItem()){
			g.setColor(c[ch2.getSelectedIndex()]);
			g.fillRect(180, 1, 150, 125);
			}
		else if("Circulo"==ch1.getSelectedItem()){
			g.setColor(c[ch2.getSelectedIndex()]);
			g.fillOval(200,1,125,125);
		}
		
	}
}




}






