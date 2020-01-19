
import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class Icon extends JApplet{
	ImageIcon miIcono;
	
	public void init() {
		miIcono = new ImageIcon ("logo_sena.png");
	}
	public void paint(Graphics g){
		miIcono.paintIcon(this, g, 0, 0);
	}
} 