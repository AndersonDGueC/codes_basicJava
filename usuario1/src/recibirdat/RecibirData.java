 package recibirdat;
import javax.swing.*;



import java.awt.*;
import java.awt.event.*;

public class RecibirData extends JFrame implements ActionListener {
	JLabel l1,l2,l3;
	JTextField t1, t2;
	JTextArea ta1;
	JButton b1,b2,b3,b4,b5;
	JPanel p1,p2,p3;
	int [] m;
	int var=0;
	int var1=0;
	int prom=0;
public RecibirData(){
	
	super("5 números positivos y su promedio");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new GridLayout(3,1));
	p1=new JPanel();
	p2=new JPanel();
	p3=new JPanel();
	l1=new JLabel("Ingrese el número entero positivo");
	l2=new JLabel("valores promediados");
	l3=new JLabel("Valores en el arreglo");
	t1=new JTextField();
	t2=new JTextField();
	t2.setEditable(false);
	
	ta1=new JTextArea();
	ta1.setEditable(false);
	ta1.setSize(600, 500);
	b1= new JButton("Agregar");
	b2=new JButton("Ver vector");
	b3=new JButton("Limpiar campos");
	b4=new JButton("Limpiar vector");
	b5=new JButton("Promediar");
	m=new int[5];
	p1.setLayout(new GridLayout(3,2));
	p1.add(l1);
	p1.add(t1);
	p1.add(l2);
	p1.add(t2);
	p1.add(l3);
	add(p1);
	p2.setLayout(new GridLayout(1,1));
	
	p2.add(ta1);
	add(p2);
	p3.setLayout(new BorderLayout());
	//p4.setLayout(new GridLayout(1,3));
	p3.add(b5,BorderLayout.NORTH);
	p3.add(b3,BorderLayout.SOUTH);
	p3.add(b4,BorderLayout.EAST);
	//p5.setLayout(new GridLayout(1,2));
	p3.add(b1,BorderLayout.WEST);
	p3.add(b2,BorderLayout.CENTER);
	//p3.add(p4);
	//p3.add(p5);
	add(p3, BorderLayout.SOUTH);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	
	setSize(600,300);
	setVisible(true);
}


	

//class OyentButt implements ActionListener{
public void actionPerformed(ActionEvent e){
	if(e.getSource()==b1){
		
		
		if(var<m.length){
			
			
			try{
		int s= Integer.parseInt(t1.getText());
		verificacion(s);
			
		
			ta1.setText("");
		
		m[var]=s;
		var++;
		t1.setText("");
		
			}
			catch(NumberFormatException nfe){
				ta1.append("Invalido" +nfe.toString()+"\n");
				ta1.append("ingrese un número no una caracter");
				t1.setText("");
				
			}
			catch(MiexcNumN df){
				ta1.append("Invalido " +df.getMessage()+"\n");
				t1.setText("");
				ta1.append("Ingrese un numero positivo por favor \n");
			}	
		//
			}
		else{
			ta1.setText("No se puede añadir otro elemento");
		}//
		}
	else if(e.getSource()==b2){
		ta1.setText("");
		for(int i=0;i<m.length;i++){
			ta1.append(""+m[i]+"\n");
		}
	}
	else if(e.getSource()==b3){
		t1.setText("");
		t2.setText("");
		ta1.setText("");
				
	}
	else if(e.getSource()==b4){
		m=new int[5];
	}
	else if(e.getSource()==b5){
		for(int l=0;l<m.length;l++){
			var1=m[l]+var1;
			
		}
		prom=var1/m.length;
		t2.setText(String.valueOf(prom));
	}
}

public  void verificacion(int o) throws MiexcNumN{
	if(o<0){
		throw new MiexcNumN("Es un numero negativo");
	}
	
}


public static void main(String [] args) {
	RecibirData frame = new RecibirData();
	}

}