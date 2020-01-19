import java.applet.*;
import java.net.*;
public class ReproducirSonidoURL extends Applet {
    public void init() {
        URL url;
        try {
                     url = new URL("http://direccion_de_ubicacion_del_sonido_en$
        } catch (MalformedURLException e) {
            return;
        }

        play(url);
    }
}
