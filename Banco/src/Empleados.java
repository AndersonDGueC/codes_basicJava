
public class Empleados extends Persona {

public int idenE;
private double sueldo;
private int meses;
public int diasv;

public Empleados()
{
	super();
	this.idenE=0;
	this.sueldo=0;
	this.meses=0;
	this.diasv=0;
	}

public Empleados(String nombre, int edad, char sexo, int id, int idenE, double sueldo){
	super(nombre,edad,sexo,id);
	this.idenE=idenE;
	this.sueldo=sueldo;
	this.meses=0;
	this.diasv=0;
}

public double cobrarSueldo(){
	meses+=meses;
	return sueldo;
}


public void vacaciones(){
	int m=0;
	int n=0;
	if(meses>12 && meses<24){
	 m=5;
}
	else if(meses>24){
		 n=0;
		n=n+2;
		if(n==20){
			n=n;
		}
	}
	
	else{
		m=0;
	}
	diasv=m+n;
	}


}
