import javax.swing.*;
public class ImagenEnJframe extends JFrame{
	JLabel label;
	ImageIcon imagenIcono;
	
	public ImagenEnJframe(){
		super("Hola");
		imagenIcono=new ImageIcon("logo_sena.png");
		//la imagen debe estar en la carpeta raiz del proyecto
		label=new JLabel(imagenIcono);
		//this.add(label);
		add(label);
		setVisible(true);
		setSize(500,500);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImagenEnJframe frame=new ImagenEnJframe();
	}  
 
}