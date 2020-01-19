package appb;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonesApplet extends JFrame implements ActionListener{
	JButton[] br;
	JLabel [] lr;
	JTextField [] tr;
	JPanel [] pr;
	double []dat;
	public BotonesApplet(){
		super("Botones Applet");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		br=new JButton[8];
		lr=new JLabel[3];
		tr=new JTextField[3];
		pr=new JPanel[3];
		dat=new double [3];
		br[0]=new JButton("Suma");
		br[1]=new JButton("Resta");
		br[2]=new JButton("Multiplica");
		br[3]=new JButton("Divide");
		br[4]=new JButton("Raiz de 1");
		br[5]=new JButton("Raiz de 2");
		br[6]=new JButton("Mayor");
		br[7]=new JButton("Limpia");
		lr[0]=new JLabel("Número 1");
		lr[1]=new JLabel("Número 2");
		lr[2]=new JLabel("Resultado");
		tr[0]=new JTextField("");
		tr[1]=new JTextField("");
		tr[2]=new JTextField("");
		tr[2].setEditable(false);
		pr[0]=new JPanel();
		pr[1]=new JPanel();
		pr[2]=new JPanel();
		
		setLayout(new BorderLayout());
		pr[0].setLayout(new GridLayout(2,2));
		pr[0].add(lr[0]);
		pr[0].add(tr[0]);
		pr[0].add(lr[1]);
		pr[0].add(tr[1]);
		pr[1].setLayout(new GridLayout(2,4));
		pr[1].add(br[0]);
		pr[1].add(br[1]);
		pr[1].add(br[2]);
		pr[1].add(br[3]);
		pr[1].add(br[4]);
		pr[1].add(br[5]);
		pr[1].add(br[6]);
		pr[1].add(br[7]);
		pr[2].setLayout(new GridLayout(1,2));
		pr[2].add(lr[2]);
		pr[2].add(tr[2]);
				
		add(pr[2],BorderLayout.SOUTH);
		add(pr[1],BorderLayout.CENTER);
		add(pr[0],BorderLayout.NORTH);
		for(int i=0;i<br.length;i++){
			br[i].addActionListener(this);
		}	
		
		
		setSize(400,300);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==br[0]){
			dat[0]=Double.parseDouble(tr[0].getText());
			dat[1]=Double.parseDouble(tr[1].getText());
			dat[2]=dat[0]+dat[1];
			tr[0].setText("");
			tr[1].setText("");
			tr[2].setText(String.valueOf(dat[2]));
		}
		else if(ae.getSource()==br[1]){
			dat[0]=Double.parseDouble(tr[0].getText());
			dat[1]=Double.parseDouble(tr[1].getText());
			dat[2]=dat[0]-dat[1];
			tr[0].setText("");
			tr[1].setText("");
			tr[2].setText(String.valueOf(dat[2]));
			
		}
else if(ae.getSource()==br[2]){
	dat[0]=Double.parseDouble(tr[0].getText());
	dat[1]=Double.parseDouble(tr[1].getText());
	dat[2]=dat[0]*dat[1];
	tr[0].setText("");
	tr[1].setText("");
	tr[2].setText(String.valueOf(dat[2]));
		}
else if(ae.getSource()==br[3]){
	dat[0]=Double.parseDouble(tr[0].getText());
	dat[1]=Double.parseDouble(tr[1].getText());
	dat[2]=dat[0]/dat[1];
	tr[0].setText("");
	tr[1].setText("");
	tr[2].setText(String.valueOf(dat[2]));
}
else if(ae.getSource()==br[4]){
	dat[0]=Double.parseDouble(tr[0].getText());
	//dat[1]=Double.parseDouble(tr[1].getText());
	dat[2]=Math.sqrt(dat[0]);
	tr[0].setText("");
	tr[1].setText("");
	tr[2].setText(String.valueOf(dat[2]));
	
}
else if(ae.getSource()==br[5]){
	//dat[0]=Double.parseDouble(tr[0].getText());
	dat[1]=Double.parseDouble(tr[1].getText());
	dat[2]=Math.sqrt(dat[1]);
	tr[0].setText("");
	tr[1].setText("");
	tr[2].setText(String.valueOf(dat[2]));
}
else if(ae.getSource()==br[6]){
	dat[0]=Double.parseDouble(tr[0].getText());
	dat[1]=Double.parseDouble(tr[1].getText());
	if(dat[0]>dat[1]){
		dat[2]=dat[0];
		tr[2].setText(String.valueOf(dat[2]));
		tr[0].setText("");
		tr[1].setText("");
	}
	else {
		dat[2]=dat[1];
		tr[2].setText(String.valueOf(dat[2]));
		tr[0].setText("");
		tr[1].setText("");
	}
	
	
}
else if(ae.getSource()==br[7]){
dat[0]=0;
dat[1]=0;
dat[2]=0;
tr[2].setText("");
tr[0].setText("");
tr[1].setText("");

}

	}
	

	
	public static void main(String [] args){
		BotonesApplet frame= new BotonesApplet();
	}


}
