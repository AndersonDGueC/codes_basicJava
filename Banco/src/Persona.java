
public class Persona {
protected  String nombre;
protected int edad;
protected char sexo;
protected int id;

public Persona()
{
	nombre=new String();
	edad=0;
	sexo=' ';
	id=0;
	}

public Persona(String nombre, int edad, char sexo, int id ){

this.nombre=nombre;
this.edad=edad;
this.sexo=sexo;
this.id=id;
}


public String getNombre()
{
	return nombre;
	}
public int getEdad(){
	return edad;
}

public int getSexo(){
	return sexo;
}

public int getId(){
	return id;
}
}
