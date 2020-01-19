package apme;

public class Cuenta {
	private int numero;
	private String nombre;
	private double saldo;
	public Cuenta(){
	numero = 0;
	nombre=null;
	saldo=0;
} 
public Cuenta(int numero, String nombre, double saldo){
	this.numero=numero;
	this.nombre=nombre;
	this.saldo=saldo;
}
 
public double obtenSaldo(){
	return saldo; 
}


public String obtenNombre(){
	return nombre;
}

public int obtenNumero(){
	return numero;
}

public void cambioSaldo(double saldo){
	this.saldo=saldo;
}

public void cambioNumero(int numero){
	this.numero=numero;
}
public void cambioNombre(String nombre){
	this.nombre=nombre;
}


}
