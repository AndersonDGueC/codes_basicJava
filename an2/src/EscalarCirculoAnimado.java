import java.awt.*;
import java.applet.*;
public class EscalarCirculoAnimado extends Applet implements Runnable{
	Image miImagen;
	Graphics contextoGrafico; 
	Thread hiloAnimacion;	
	int ancho,alto,posicionx,posiciony;
	public void init() {
		//valores iniciales del circulo
		ancho=0;
		alto=0;
		//ubicacion del circulo
		posicionx=100;
		posiciony=100;
		//creamos el contexto grafico
        miImagen=createImage(300, 300);
        contextoGrafico=miImagen.getGraphics();
        resize( 500,500 );
	}
	public void paint(Graphics g){
	}
	public void run() {
		//Creamos un retardo de 20 ms por 50 veces
		for ( int contador = 1; contador <= 50; contador ++ ) {
	        escalar();
	        try{
	            Thread.sleep(20);
	        } catch(InterruptedException ex){
	            break;
	        }
	    }
	}
	public void stop(){
	     if(hiloAnimacion!=null){
	    	 hiloAnimacion.stop();
	    	 hiloAnimacion=null;
	     }
	  }
	public void start(){
	     if(hiloAnimacion ==null){
	    	 hiloAnimacion=new Thread(this);
	    	 hiloAnimacion.start();
	     }
	  }
	public void escalar(){
		//en cada interaccion escalamos la imagen en 2 pixeles
		ancho+=2;
		alto+=2;
		//volvemos a pintar pantalla. Se ejecuta update(); en el cual 
		//solo se actualiza el contexto gráfico
		repaint();
	}
	public void update(Graphics g){
		 contextoGrafico.setColor(getBackground());
		 contextoGrafico.fillRect(0,0, 500, 500);
	     //dibuja la pelota
		 contextoGrafico.setColor(Color.red);
		 contextoGrafico.fillOval(posicionx, posiciony, ancho, alto);
	     //transfiere la imagen al contexto gráfico del applet
	     g.drawImage(miImagen, 0, 0, null);
	}
}
