

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

public class BenefiEconBanc extends JFrame {
	JLabel [] lt;
	JButton [] bt;
	JPanel [] pt;
	JTextField []tt;
	JTextArea ta;
	DefaultTableModel modelTable;

	public BenefiEconBanc(){
		super("Aplicación CDT");
		modelTable=new DefaultTableModel();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		lt=new JLabel[3];
		lt[0]=new JLabel("Dinero a depositar");
		lt[1]=new JLabel("Porcentaje de interés mensual");
		lt[2]=new JLabel("número de meses");
		pt=new JPanel[3];
		tt=new JTextField[3];
		ta=new JTextArea();
		bt=new JButton[2];
		bt[0]=new JButton("Crear Lista");
		bt[1]=new JButton("Borrar");
		for(int i=0;i<3;i++){
			pt[i]=new JPanel();
			tt[i]=new JTextField();
		}
		
		pt[0].setLayout(new GridLayout(3,2));
		pt[0].add(lt[0]);
		pt[0].add(tt[0]);
		pt[0].add(lt[1]);
		pt[0].add(tt[1]);
		pt[0].add(lt[2]);
		pt[0].add(tt[2]);
		pt[1].setLayout(new GridLayout(1,1));
		pt[1].add(ta);
		pt[2].setLayout(new FlowLayout());
		pt[2].add(bt[0]);
		pt[2].add(bt[1]);
		
		add(pt[0],BorderLayout.NORTH);
		add(pt[1],BorderLayout.CENTER);
		add(pt[2],BorderLayout.SOUTH);
		setSize(400,450);
		setVisible(true);
	}
	
	public double calculoInteres(int mes, double interes, double cantidad){
		if(mes==0){
			return cantidad;
		}
		else {
			
			return  calculoInteres(mes-1,interes,cantidad)*interes+calculoInteres(mes-1,interes,cantidad);
		}
	}
	
	public static void main(String [] args){
		BenefiEconBanc frame= new BenefiEconBanc();
		System.out.println(frame.calculoInteres(2,0.05,1000000));
	}
}
