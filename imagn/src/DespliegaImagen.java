import java.awt.*;
import java.applet.*;

public class DespliegaImagen extends Applet {
	Image miImagen;
	public void init() {
		miImagen = getImage(getDocumentBase(), "logo_sena.png");
	}
	public void paint(Graphics g){
		g.drawImage(miImagen, 0, 0, 100, 100, this);
	}

}