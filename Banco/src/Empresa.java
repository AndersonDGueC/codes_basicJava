
public class Empresa {
public String nombreEmpresa;	
public int idCasaInv;
public String nivelConfianza;
public int retornoInv;	
public double montoInv;
public int plazos;
public String tipoInver;

public Empresa(){
	this.nombreEmpresa=null;
	this.idCasaInv=0;
	this.nivelConfianza=null;
	this.retornoInv=0;
	this.montoInv=0;
	this.plazos=0;
	this.tipoInver=null;
	
}

public Empresa(String nombreEmpresa, int idCasaInv, String nivelConfianza, int retornoInv, double montoInv, int plazos, String tipoInver){
	this.nombreEmpresa=nombreEmpresa;
	this.idCasaInv=idCasaInv;
	this.nivelConfianza=nivelConfianza;
	this.retornoInv=retornoInv;
	this.montoInv=montoInv;
	this.plazos=plazos;
	this.tipoInver=tipoInver;
}
}
