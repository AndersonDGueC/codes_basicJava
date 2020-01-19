import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ReproducirSonidoBotones extends Applet implements ActionListener{
Button play,stop;
AudioClip audioClip;
public void init(){
	play = new Button(" Reproducir indefinidamente ");
	add(play);
	play.addActionListener(this);
	stop = new Button(" Stop ");
	add(stop);
	stop.addActionListener(this);
	audioClip = getAudioClip(getDocumentBase(), "bip.wav");
}
public void actionPerformed(ActionEvent ae){
	Button source = (Button)ae.getSource();
	if (source.getLabel() == " Reproducir indefinidamente "){
	audioClip.loop();
	}
	else if(source.getLabel() == " Stop "){
	audioClip.stop();
	} 
}
}