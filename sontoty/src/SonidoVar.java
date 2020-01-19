import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class SonidoVar extends Applet implements ActionListener{
Button [] bt;
AudioClip [] aud;
public void init(){
	bt = new Button[5];
	bt[0]= new Button("Play1");
	bt[1]= new Button("Play2");
	bt[2]= new Button("Play1In");
	bt[3]= new Button("Play2In");
	bt[4]= new Button("Stop");
	for(int i=0; i<5; i++){
		add(bt[i]);
		bt[i].addActionListener(this);
	}
	aud=new AudioClip[2];
	aud[0]=getAudioClip(getDocumentBase(),"storm.wav");
	aud[1]=getAudioClip(getDocumentBase(),"pluie_sur_le_toit.wav");
}

public void actionPerformed(ActionEvent ae){
	Button source = (Button)ae.getSource();
	if(source.getLabel() == "Play1"){
		aud[0].play();
	}
	else if(source.getLabel() == "Play2"){
		aud[1].play();
	}
	else if(source.getLabel() == "Play1In"){
		aud[0].loop();
	}
	else if(source.getLabel() == "Play2In"){
		aud[1].loop();
	}
	else if(source.getLabel() == "Stop"){
		aud[0].stop();
		aud[1].stop();
	}
}
}
