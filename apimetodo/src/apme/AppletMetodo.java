package apme;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppletMetodo extends JFrame implements ActionListener {
		JButton bt;
		JLabel [] lt;
		JTextField [] tt;
		JTextArea a;
		JPanel [] pt;
		
	public AppletMetodo(){
			
		super("Aplicacion Método");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			bt=new JButton("Despliegue Cuenta");
			lt=new JLabel[4];
			tt=new JTextField[3];
			pt=new JPanel[3];
			a=new JTextArea();
			lt[0]=new JLabel("Número de Cuenta");
			lt[1]=new JLabel("Nombre Cliente");
			lt[2]=new JLabel("Saldo de la cuenta");
			lt[3]=new JLabel("Resultado");
			tt[0]=new JTextField();
			tt[1]=new JTextField();
			tt[2]=new JTextField();
			pt[0]=new JPanel();
			pt[1]=new JPanel();
			pt[2]=new JPanel();
			setLayout(new GridLayout(3,1));
			pt[0].setLayout(new GridLayout(3,1));
			pt[0].add(lt[0]);
			pt[0].add(tt[0]);
			pt[0].add(lt[1]);
			pt[0].add(tt[1]);
			pt[0].add(lt[2]);
			pt[0].add(tt[2]);
			add(pt[0]);
			
			pt[1].add(bt);
			add(pt[1]);
			pt[2].setLayout(new GridLayout(1,2));
			pt[2].add(lt[3]);
			pt[2].add(a);
			bt.addActionListener(this);
			
			add(pt[2],BorderLayout.SOUTH);
			setSize(500,300);
			setVisible(true);
			
	}	
		public void actionPerformed(ActionEvent ae){
			
			int nc=Integer.parseInt(tt[0].getText());
			String n=tt[1].getText();
			double s=Double.parseDouble(tt[2].getText());
			Cuenta av=new Cuenta(nc,n,s);
			a.append(av.obtenNumero()+" "+av.obtenNombre()+" "+av.obtenSaldo()+"\n");
			
			 
		}
		
		
		
		public static void main(String [] args){
			AppletMetodo am= new AppletMetodo();
		}

}
