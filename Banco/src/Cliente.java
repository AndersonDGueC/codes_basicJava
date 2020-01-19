
public class Cliente extends Persona {
public int noUsuario;

public Cliente()
{
	noUsuario=0;
	}
public Cliente(String nombre, int edad, char sexo, int id, int noUsuario) {
	super(nombre,edad,sexo,id);
	this.noUsuario=noUsuario;
}


}
