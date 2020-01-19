
public class Inversion extends Cuenta {
	public double montoI;
	public int porcenAhorroI;
	public int mesI;
	public int diaInicioI;
	
	public Inversion(){
		super();
		this.montoI=0;
		this.porcenAhorroI=0;
		this.mesI=0;
		this.diaInicioI=0;
	}
	public Inversion(double montoI, int porcenAhorroI){
		this.montoI=montoI;
		this.porcenAhorroI=porcenAhorroI;
		this.mesI=0;
		this.diaInicioI=0;
	}
	public String verificacionI(){
		if(montoI>25000){
			return "cantidad aceptada";
		}
		else{
			return "Cantidad no es sufiente";
		}
	}
	public double calculoInteresesI(double x){
		montoI=montoI*x*mesI;
		return montoI;
	}
	public void fechaInicioCuentaI(){
		int diasActual=diaInicioI+1;
		if(diasActual>31){
			mesI+=mesI;
			diaInicioI=0;
		}
		else{
			mesI=0;
		}
	}
	public String retiroAhorro(double cantidad){
		if(cantidad>1000)
		{
			return "Puede realizar el retiro";
		}
		else
		{
			return "no puede realizar el retiro";
		}
	}
}
