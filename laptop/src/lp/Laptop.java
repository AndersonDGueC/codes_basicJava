package lp;
import java.lang.*;
public class Laptop {
	
	private String marca;
	private String modelo;
	private Integer memoria;
	private double precio;
	private static int cuenta=0;
	
	public Laptop(){
		marca=null;
		modelo=null;
		memoria= null;
		precio=0;
		cuenta++;
	}
	
	public Laptop(String marca, String modelo, Integer memoria, double precio){
		this.marca= marca;
		this.modelo=modelo;
		this.memoria=memoria;
		this.precio=precio;
		cuenta++;
	}
	
	public Laptop(String marca, String modelo, Integer memoria, Integer precio){
		this.marca=marca;
		this.modelo=modelo;
		this.memoria=memoria;
		this.precio = precio.doubleValue();
		cuenta++;
		}
	public String getMarca(){
		return marca;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public Integer getMemoria(){
		return memoria;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public void setMarca(String marca){
		this.marca=marca;
	}
	
	public void setModelo(String modelo){
		this.modelo=modelo;
	}
	
	public void setMemoria(Integer memoria){
		this.memoria=memoria;
	}
	
	public void setMemoria(double memoria){
		this.memoria=new Integer((int)memoria);
	}
	
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	
	public void setPrecio(int precio){
		this.precio=(double)precio;
	}
	
	public static Integer getCuenta(){
		Integer cuenta1=new Integer(cuenta);
		return cuenta1;
	}
	
	public static double getCuenta(char sn){
		return (double)cuenta;
	}
	
	
	}