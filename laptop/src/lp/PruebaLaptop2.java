package lp;
import java.util.Scanner;
public class PruebaLaptop2 {
	Laptop [] lt= new Laptop[3];
	
	
	public PruebaLaptop2(){
		
	lt[0]=new Laptop();
	lt[1]=new Laptop();
	lt[2]=new Laptop();
	
	
	}
	
	public void setDatos(){
		
		for(int i=0;i<lt.length;i++){
			int q=i+1;
		System.out.println("ingrese marca "+q+"\n");
		Scanner datm=new Scanner(System.in);
		lt[i].setMarca(datm.next());
		System.out.println("ingrese modelo "+q+"\n");
		Scanner datm2=new Scanner(System.in);
		lt[i].setModelo(datm2.next());
		System.out.println("ingrese el tamaño de memoria "+q+"\n");
		Scanner datm3=new Scanner(System.in);
		int dat4=datm3.nextInt();
		Integer dat44=new Integer(dat4);
		lt[i].setMemoria(dat44);
		System.out.println("ingrese precio "+q+"\n");
		Scanner datm4= new Scanner(System.in);
		lt[i].setPrecio(datm3.nextDouble());
		}
	}
	
	

	
	public void getDatos(){
		for(int i=0;i<lt.length;i++){
		System.out.println("Marca "+lt[i].getMarca()+"\n"+"Modelo "+lt[i].getModelo()+"\n"+
					"Memoria "+lt[i].getMemoria()+"\n"+"Precio "+lt[i].getPrecio()+"\n");
		}
	}
	
	
	public void editarData(){
		boolean v=true;
		while(v){
		System.out.println("Desea hacer cambios en alguno de los objetos?");
		System.out.println("presione s=1 o n=0");
		Scanner dec=new Scanner(System.in);
		int dec1=dec.nextInt();
		
		if(dec1==1){
			System.out.println("Cual de los 3 unicos objetos que pudo crear \n");
			System.out.println("presion 1 , 2 o 3 , para seleccionar el objeto \n");
		    System.out.println("a seleccionar");
		    Scanner dati=new Scanner(System.in);
		    int j=dati.nextInt();
		    System.out.println("Elige una de las tres opciones \n");
		    System.out.println("1.Marca \n");
		    System.out.println("2.Modelo \n");
		    System.out.println("3.Memoria \n");
		    System.out.println("4.Precio \n");
		    System.out.println("5.Salir");
		    System.out.println("Marque uno de los números \n");
		    Scanner dat6= new Scanner(System.in);
		    if((dat6.nextInt())==1){
		    	System.out.println("ingrese el nombre de la marca");
		    	Scanner dat7=new Scanner(System.in);
		    	
		    	lt[j-1].setMarca(dat7.next());
		    }
		    else if(dat6.nextInt()==2){
		    	System.out.println("ingrese el nombre del modelo");
		    	Scanner dat8=new Scanner(System.in);
		    	
		    	lt[j-1].setModelo(dat8.next());
		    }
		    
		    else if(dat6.nextInt()==3){
		    	System.out.println("ingrese el nombre de la memoria");
		    	Scanner dat9= new Scanner(System.in);
		    	Integer dat99=new Integer(dat9.nextInt());
		    	lt[j-1].setMemoria(dat99);
		    }
		    else if(dat6.nextInt()==4){
		    	System.out.println("ingrese el precio");
		    	Scanner dat10=new Scanner(System.in);
		    	lt[j-1].setPrecio(dat10.nextDouble());
		    }
		    else {
		    	v=false;
		    }
		    
		}
		else{
			System.out.println("Fin del programa");
			v=false;
		}
		}
	}
	
	public void menuBienvenida(){
		boolean v0=false;
		while(!v0){
		System.out.println("Bienvenido a la base de datos de la tienda \n");
		System.out.println("Conteste si  desea llenar la informacion de los 3 articulos \n");
		System.out.println("con si o no (s=1/n=0)");
		Scanner dc=new Scanner(System.in);
		//System.out.println(dc.next());
		int g=dc.nextInt();
		
		if(g == 1){
			v0=true;
		}
		else{
			v0=false;
			System.out.println("Gracias por su atención");
		}
		
		}
		
		
	}
	public void datacuent(){
		System.out.println("Cuentas: \n"+lt[0].getCuenta()+
		"\n"+lt[1].getCuenta()+"\n"+
		lt[2].getCuenta()+"\n");
	}
	
	
public static void main(String [] args){
	boolean v2=true;
	while(v2){
	PruebaLaptop2 pru = new PruebaLaptop2();
	pru.menuBienvenida();
	pru.setDatos();
	pru.getDatos();
	pru.editarData();
	pru.getDatos();
	pru.datacuent();
	
	}
	
	
}

}
