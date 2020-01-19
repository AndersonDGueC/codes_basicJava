
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class IndiceMC extends HttpServlet {
      String denpeso;
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		//recibimos los parametros de peso y estatura
		String nombre = req.getParameter("nombre");
		String peso = req.getParameter("peso");
		String estatura = req.getParameter("estatura");
		
		//para realizar los calculos convertimos a float
		 	float num1=Float.parseFloat(peso);
		 	float num2=Float.parseFloat(estatura);
		 	float numr=num1/(num2*num2);
		 	
		 		if(numr<18.5){
		 			denpeso="Peso Bajo";
		 		}
		 		else if((numr>=18.5)&&(numr<25)){
		 			denpeso="Peso Normal";
		 		}
		 		else if((numr>=25)&&(numr<30)){
		 			denpeso="Peso Alto";
		 		}
		 		else if(numr>=30){ 
		 			denpeso="Obesidad";
		 		}
		 		else{
		 			denpeso="invalido";
		 		}
		 		PrintWriter salida = resp.getWriter();
		 		salida.println("<html>");
		 		salida.println("<body>");
		 		salida.println("Nombre "+nombre);
		 		salida.println("Peso "+peso);
		 		salida.println("Estatura "+estatura);
		 		salida.println("Su indice de masa corporal es "+numr+". Usted se encuentra en "+denpeso+".");
		 		salida.println("</body>"); 
		 		salida.println("</html>");
	}
}
