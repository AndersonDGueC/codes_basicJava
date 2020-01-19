
/*@autor:
 * Anderson Danilo Guerrero Calpa
 */

public class Tiquets {
	private double valorPasaje;
	private int numeroDias;
	private float distanciaRecor;
	
	
	//contructor
	public Tiquets(){
		this.valorPasaje=0;
		this.numeroDias=0;
		this.distanciaRecor=0;
	}
	
	//constructor sobrecargado
	public Tiquets(int numeroDias, float distanciaRecor){
		
		this.numeroDias=numeroDias;
		this.distanciaRecor=distanciaRecor;
	}
	
	//metodos para el retonro de valores
	
	
	public int getNumeroDias(){
		return numeroDias;
	}
	
	public float getDistanciaRecor(){
		return distanciaRecor;
	}
	
	//metodos para la asignacion de valores
	
	
	public void setNumeroDias(int numeroDias){
		this.numeroDias=numeroDias;
	}
	
	public void setDistanciaRecor(float distanciaRecor){
		this.distanciaRecor=distanciaRecor;
	}
	/*
	 * para el calculo del valor del pasaje, estableceremos un
	 * metodo donde se cobrara cada dia $350.00   y $35.00 por cada 
	 * km de recorrido. 
	 */
	public double calculoValorPasaje(){
		int costoDias=0;
		float costoRecorrido=0;
		double descuento=0;
		if(distanciaRecor<=1000 && numeroDias<7){
			costoDias=numeroDias*350;
			costoRecorrido=distanciaRecor*35;
			return valorPasaje=(double)costoDias +(double)costoRecorrido;
		}
		else{
			costoDias=numeroDias*350;
			costoRecorrido=distanciaRecor*35;
			descuento=((double)costoDias +(double)costoRecorrido)*0.3;
			return valorPasaje=((double)costoDias +(double)costoRecorrido)-descuento;
		 
		}
	}
	
}
