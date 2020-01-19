/*
 * @Autor Anderson Danilo Guerrero Calpa
 */
import java.util.ArrayList;


public class AlmacenBul {
private float bultMaxPeso;
private float bultMinPeso;
private float promPesoBultos;
private float pesoAcumBultos;
private ArrayList<RecepTiq> almacen;


public AlmacenBul(){
	this.bultMaxPeso=0;
	this.bultMinPeso=0;
	this.promPesoBultos=0;
	this.pesoAcumBultos=0;
	this.almacen=new ArrayList<RecepTiq>();
}

public void agregarPaq(float peso){
	RecepTiq m = new RecepTiq(peso);
	almacen.add(m);
	
}

public int tam(){
	return almacen.size();
}

public float promPeso(){
	float cant= (float)almacen.size();
	return promPesoBultos=pesoAcumBultos/cant;
}

public float getPesoAcumBultos(){
	for(int i=0;i<almacen.size();i++){
		pesoAcumBultos+=almacen.get(i).getPesoBulto();
	}
	return pesoAcumBultos;
}

public float maxPesoBulto(){
	RecepTiq rq=null;
	float max=0;
	for(int i=0; i<almacen.size();i++){
		if(almacen.get(i).getPesoBulto()>max){
			rq=almacen.get(i);
			max=almacen.get(i).getPesoBulto();
		}
		
	}
	return bultMaxPeso=max;
}

public float minPesoBulto(){
	RecepTiq rt=null;
	float min=almacen.get(0).getPesoBulto();
	for(int i=0; i<almacen.size();i++){
		if(almacen.get(i).getPesoBulto()<min){
			rt=almacen.get(i);
		 min=almacen.get(i).getPesoBulto();
					}
	}
	return bultMinPeso=min;
}

public void imprimir(){
	for(int i=0;i<almacen.size();i++){
		System.out.println(almacen.get(i).getPesoBulto());
	}
	
}

}

