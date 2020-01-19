package bd;
import java.sql.*;
public class ConexionBD1 {
static String basededatos="biblioteca";
static String usuario = "root";
static String password = "";
static String url="jdbc:mysql://localhost/"+basededatos;
static Connection conexion = null;

public ConexionBD1(){
	
}

public static Connection getConexion(){
	if(conexion==null){
		try{
			conexion = DriverManager.getConnection(url,usuario,password);
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	return conexion;
}

public static void desconectar(){
	try{
		if(conexion!=null){
			conexion.close();
			conexion=null;
			System.out.println("Conexion Cerrada");
		}
	}
	catch(SQLException e){
		e.printStackTrace();	
	}
}


}


