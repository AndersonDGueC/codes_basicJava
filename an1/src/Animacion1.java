import java.awt.*;
import java.applet.*;
public class Animacion1 extends Applet {
	 Image ImagenDobleBuffer;//Imagen que servira para el doubleBuffer
	 Graphics contextoGrafico; //Contexto gráfico en el que dibujaremos
	 public void init() {
	        // Inicializa el doble buffer
		 ImagenDobleBuffer = createImage( 300,300 );
	        contextoGrafico = ImagenDobleBuffer.getGraphics();
         // Construye un área gráfica de trabajo
	      //coloreamos el contexto amarillo para visualizarlo
	        contextoGrafico.setColor( Color.yellow );
	        //delimitamos el area del contexto como un cuadrado
	        contextoGrafico.fillRect( 0,0,300,300 );
	        resize( 500,450 );
	        }
	    public void paint( Graphics g ) {
	        // Presenta la imagen del buffer ubicada en la posicion 30,30
	        g.drawImage( ImagenDobleBuffer,30,30,this );
	        }
	   
	    public void dibujarCirculoRojo() {
	        contextoGrafico.setColor( Color.red );
	        //Dibujo circulo Rojo en la posicion 20,20 de tamaño 30 ancho,30 alto
	        contextoGrafico.drawOval( 20,20,30,30 );
	          
	        }
	    public void dibujarCirculoAzul() {
	        contextoGrafico.setColor( Color.blue );
	        //Dibujo circulo Rojo en la posicion 50,60 de tamaño 40 ancho,40 alto
	        contextoGrafico.drawOval( 50,60,40,40 );
	        }
	    public void start() {
	        // Hace el dibujo off-line
	        dibujarCirculoRojo();
	        dibujarCirculoAzul();
	        // Muestra la imagen de golpe
	        repaint();
	    }
	 
}