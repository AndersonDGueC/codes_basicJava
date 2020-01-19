
public class Ahorro extends Cuenta {

	public double monto;
	public int porcenAhorro;
	public int mes;
	public int diaInicio;
	public Ahorro(){
		super();
		this.monto=0;
		this.porcenAhorro=0;
		this.mes=0;
		this.diaInicio=0;
	}
	public Ahorro(double monto, int porcenAhorro){
		this.monto=monto;
		this.porcenAhorro=porcenAhorro;
		this.mes=0;
		this.diaInicio=0;
	}
	
	public String verificacion(){
		if(monto>1000){
			return "cantidad aceptada";
		}
		else{
			return "Cantidad no es sufiente";
		}
	}
	
	public double calculoIntereses(double x){
		monto=monto*x*mes;
		return monto;
	}
	
	public void fechaInicioCuenta(){
		int diasActual=diaInicio+1;
		if(diasActual>31){
			mes+=mes;
			diaInicio=0;
		}
		else{
			mes=0;
		}
		
		
		
	}
	
	public String retiroAhorro(double cantidad){
		if(cantidad>500)
		{
			return "Puede realizar el retiro";
		}
		else
		{
			return "no puede realizar el retiro";
		}
	}
}
