
public class Cuenta {
public Cliente titular;
public double saldo;


public Cuenta(){
	this.titular=null;
	this.saldo=0;
	
}
public Cuenta(Cliente titular, double saldo){
	this.titular=titular;
	this.saldo=saldo;
			}

public double getSaldo(){
	return saldo;

}
public void deposito(double cantidad){
	saldo=saldo+cantidad;
}

public double retiro(double cantidad){
		saldo=saldo-cantidad;
		return saldo;
		}



}
