import java.io.*;
import java.net.*;
public class ClientSocket10 {
	public static void main(String [] args) throws IOException,EOFException{
		Socket s= null;
		PrintWriter textoAlServidor;
		BufferedReader textoDelTeclado;
		DataInputStream textoDelServidor;
		String teclado;
		try{
			s=new Socket("127.0.0.1",5432);
			System.out.println("Ya me conecte al servidor");
			//Abrimos conexion texto del teclado
			textoDelTeclado= new BufferedReader(new InputStreamReader(System.in));
			//texto al servidor
			textoAlServidor=new PrintWriter(s.getOutputStream(),true);
			//texto del servidor
			textoDelServidor=new DataInputStream(s.getInputStream());
			
			//do{
				System.out.println("Servidor recibiendo la información, textea max 10 numeros");
				teclado=textoDelTeclado.readLine();
				textoAlServidor.println(teclado);
				System.out.println("Respuesta ="+textoDelServidor.readUTF());
			//}while(teclado.length()!=0);
			System.out.println("Cliente termino de enviar datos");
			//cerramos conexiones abiertas
			textoDelServidor.close();
			textoDelTeclado.close();
			textoAlServidor.close();
			s.close(); 
		}
		catch(IOException e){
			System.out.println(e.getMessage());

		}
		
	}
}
