
/*
 * @autor Anderson Danilo Guerrero Calpa
 */
public class RecepTiq {
	
	private float pesoBulto;
	private double precioPorBulto;
	private static int noDeBultos;

	public RecepTiq(){
		pesoBulto=0;
		precioPorBulto=0;
		noDeBultos++;
	}
	
	public RecepTiq(float pesoBulto){
		this.pesoBulto=pesoBulto;
		noDeBultos++;
	}
	
	public void setValorPorkl(){
		if(pesoBulto<=25){
			this.precioPorBulto=0;
		}
		else if(pesoBulto>25 && pesoBulto<=300){
			this.precioPorBulto=(double)pesoBulto*1500;
		}
		else if(pesoBulto>300 && pesoBulto<=500){
			this.precioPorBulto=(double)pesoBulto*2500;
		}
		else{
			System.out.println("excede el peso permitido");
		}
	}
	
	public double getValorPorkl(){
		return precioPorBulto;
	}
	
	public static int noDeBultosIng(){
		return noDeBultos;
	}
	
	public float getPesoBulto(){
		return pesoBulto;
	}
}
