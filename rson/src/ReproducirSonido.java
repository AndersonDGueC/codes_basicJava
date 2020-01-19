import java.applet.*;

public class ReproducirSonido extends Applet {
    public void init() {
        play(getDocumentBase(), "bip.wav");
    }
}


