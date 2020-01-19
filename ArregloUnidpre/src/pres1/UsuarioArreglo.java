package pres1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UsuarioArreglo extends JFrame implements ActionListener {
 JLabel [] lt;
 JTextField [] tt;
 JTextArea ta1;
 JButton [] bt;
 JPanel [] pt;
 int [] m;
 int var,var1,prom;
 int s;
	
	public UsuarioArreglo(){
	super("Manejo de Arreglos");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	lt=new JLabel[4];
	tt=new JTextField[4];
	bt=new JButton[5];
	pt=new JPanel[3];
	lt[0]=new JLabel("Ingrese el numero");
	lt[1]=new JLabel("Ingrese la posicion en el arreglo");
	lt[2]=new JLabel("Que operación realizo");
	lt[3]=new JLabel("Resultado del promedio");
	tt[0]=new JTextField();
	tt[1]=new JTextField();
	tt[2]=new JTextField();
	tt[2].setEditable(false);
	tt[3]=new JTextField();
	tt[3].setEditable(false);
	ta1=new JTextArea();
	bt[0]=new JButton("Agregar dato");
	bt[1]=new JButton("Borrar dato");
	bt[2]=new JButton("Limpiar arreglo");
	bt[3]=new JButton("Consultar arreglo");
	bt[4]=new JButton("Calcular promedio");
	pt[0]=new JPanel();
	pt[1]=new JPanel();
	pt[2]=new JPanel();
	m=new int[10];
	pt[0].setLayout(new GridLayout(4,2));
	pt[0].add(lt[0]);
	pt[0].add(tt[0]);
	pt[0].add(lt[1]);
	pt[0].add(tt[1]);
	pt[0].add(lt[2]);
	pt[0].add(tt[2]);
	pt[0].add(lt[3]);
	pt[0].add(tt[3]);
	
	pt[1].setLayout(new GridLayout(1,1));
	pt[1].add(ta1);
	pt[2].setLayout(new BorderLayout());
	pt[2].add(bt[0],BorderLayout.NORTH);
	pt[2].add(bt[1],BorderLayout.SOUTH);
	pt[2].add(bt[2],BorderLayout.EAST);
	pt[2].add(bt[3],BorderLayout.WEST);
	pt[2].add(bt[4],BorderLayout.CENTER);
	add(pt[0],BorderLayout.NORTH);
	add(pt[1],BorderLayout.CENTER);
	add(pt[2],BorderLayout.SOUTH);
	bt[0].addActionListener(this);
	bt[1].addActionListener(this);
	bt[2].addActionListener(this);
	bt[3].addActionListener(this);
	bt[4].addActionListener(this);
	
	setSize(500,300);
	setVisible(true);
	
}
	public void actionPerformed(ActionEvent e){
	if(e.getSource() == bt[0]){
		s=Integer.parseInt(tt[0].getText());
		var=Integer.parseInt(tt[1].getText());
		if(var<m.length){
			m[var]=s;
			tt[0].setText("");
			tt[1].setText("");
			tt[2].setText("Agrego dato");
		}
		else{
			ta1.append("Fuera del tamaño del arreglo \n");
			ta1.append("intente otra posición");
		}
		
	}	
	else if(e.getSource()==bt[1]){
		tt[0].setText("");
		
		var=Integer.parseInt(tt[1].getText());
		m[var]=0;
		tt[2].setText("Borrar dato");
	}
	else if(e.getSource()==bt[2]){
		tt[0].setText("");
		tt[1].setText("");
		tt[2].setText("");
		tt[3].setText("");
		m=new int[10];
		tt[2].setText("Limpiar arreglo");
	}
	else if(e.getSource()==bt[3]){
		tt[0].setText("");
		tt[1].setText("");
		tt[2].setText("Consultar arreglo");
		tt[3].setText("");
		for(int i=0;i<m.length;i++){
			ta1.append(m[i]+"\n");
		}
	}
	else if(e.getSource()==bt[4]){
		var1=0;
		tt[2].setText("Calcular promedio");
		for(int i=0;i<m.length;i++){
			var1=m[i]+var1;
		}
		prom=var1/m.length;
		tt[3].setText(String.valueOf(prom));
		
	}
	
	}
	public static void main(String [] args){
		UsuarioArreglo frame = new UsuarioArreglo();
	}
}
