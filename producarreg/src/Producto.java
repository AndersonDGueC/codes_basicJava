
public class Producto {
private String nombre;
private String id;
private int noserie;
private double valor;
private String proveedor;
private int cantidad;
public Producto(){
	this.nombre=null;
	this.id=null;
	this.noserie=0;
	this.valor=0;
	this.proveedor=null;
}


public void setNombre(String nombre){
	this.nombre=nombre;
}
public void setId(String id){
	this.id=id;
}
public void setNoSerie(int noserie){
	this.noserie=noserie;
}
public void setValor(double valor){
	this.valor=valor;
}
public void setProveedor(String proveedor){
	this.proveedor=proveedor;
}
public void setCantidad(int cantidad){
	this.cantidad=cantidad;
}
public String getNombre(){
	return nombre;
}

public String getId(){
	return id;
}

public int getNoSerie(){
	return noserie;
}

public double getValor(){
	return valor;
}

public String getProveedor(){
	return proveedor;
}
public double getCantidad(){
	return cantidad;
}



}

