import java.net.*;
//import java.util.Arrays;
import java.io.*;
public class ServerSocket10 {

	public static void main(String[] args) throws IOException{
		Socket 	s=null;
		ServerSocket ss = null;
		BufferedReader textoRecibidoDelCliente;
		DataOutputStream textoEnviarAlCliente;
		String stringRecibido;
		int sumaTotal=0;
		int numMax=0; 
		int numMin=0;
		int aux=0;
		try{
			ss= new ServerSocket(5432);
			System.out.println("Esperando conexion, escuchando");
		//En linea de espera hasta conectarse
			s=ss.accept();
			System.out.println("Ya se conecto al cliente");
		System.out.println("He recibido conexion desde la IP"+s.getInetAddress());
		textoRecibidoDelCliente=new BufferedReader(new InputStreamReader(s.getInputStream()));
		textoEnviarAlCliente=new DataOutputStream(s.getOutputStream());
		
		//do{
			stringRecibido=textoRecibidoDelCliente.readLine();
			while(stringRecibido.length()>10){
			System.out.println("Ingrese nuevamente el valor menor igual a 10 digitos");
			stringRecibido=textoRecibidoDelCliente.readLine();
			}
			
			//char [] cadaCaracter= stringRecibido.trim().toCharArray();
			int numTotal=Integer.parseInt(stringRecibido.trim());
			int numtest=numTotal;
			int [] arrayNum=new int[10];
			for(int i=0; i<stringRecibido.trim().length(); i++){
				arrayNum[i]=numtest%10;
				numtest=numtest/10;
				System.out.print(arrayNum[i]);
				sumaTotal+=arrayNum[i];
				}
			for(int j=0;j<stringRecibido.trim().length()-1;j++){
				for(int k=0;k<stringRecibido.trim().length()-j-1;k++){
					if(arrayNum[k+1]<arrayNum[k]){
						aux=arrayNum[k+1];
						arrayNum[k+1]=arrayNum[k];
						arrayNum[k]=aux;
					}
					
				}
			}
			
			//Arrays.sort(arrayNum); 
			numMax=arrayNum[stringRecibido.trim().length()-1];
			numMin=arrayNum[0];
			textoEnviarAlCliente.writeUTF("El numero maximo "+String.valueOf(numMax)+" El numero minimo "+String.valueOf(numMin)+" La suma total "+String.valueOf(sumaTotal));
			 
		//}while(stringRecibido.length()!=0);
		System.out.println("Ya termine de recibir y procesar, cerrando conexion");
		//finaliza envio de datos al cliente
		textoEnviarAlCliente.close();
		//finaliza recepcion de datos al cliente
		textoRecibidoDelCliente.close();
		//cierra conexion servidor cliente  
		s.close();
		//cierra servidor 
		ss.close();
		}
		catch(NumberFormatException nfe){
			System.out.println(nfe.getMessage());
		}
		catch(IOException e){
			System.err.println(e.getMessage());
			System.exit(1);
		}
		
	}
	
	
}
