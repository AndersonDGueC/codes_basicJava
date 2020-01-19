import java.awt.*;
import java.applet.*;

public class ImgFotomi extends Applet {
Image imagen1;
public void init(){
	imagen1=getImage(getDocumentBase(),"foto.png");
}

public void paint(Graphics g){
	g.drawImage(imagen1,0,0, 200,200, this);
	g.setColor(Color.red);
	g.drawString("Anderson", 80, 90);
}
}
