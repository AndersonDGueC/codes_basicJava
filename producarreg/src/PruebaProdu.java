import java.util.Scanner;
public class PruebaProdu {
	Producto [] p;
	String [][] lista;
	int m;
	String q;
	String w;
	String u;
	
	public void agregarProductos(){
		System.out.println("Ingrese la cantidad de productos que desea inventariar: \n");
		Scanner dat1=new Scanner(System.in);
		m= dat1.nextInt();
		p=new Producto[m];
		for (int i=0;i<p.length;i++){
			p[i]=new Producto();
			System.out.println("Ingrese nombre del producto \n");
			Scanner dat2=new Scanner(System.in);
			p[i].setNombre(dat2.next());
			System.out.println("Ingrese Id \n");
			Scanner dat3=new Scanner(System.in);
			p[i].setId(dat3.next());
			System.out.println("Ingrese el numero de serie \n");
			Scanner dat4=new Scanner(System.in);
			p[i].setNoSerie(dat4.nextInt());
			System.out.println("Ingrese el valor por unidad \n");
			Scanner dat5= new Scanner(System.in);
			p[i].setValor(dat5.nextDouble());
			System.out.println("Ingrese el proveedor \n");
			Scanner dat6= new Scanner(System.in);
			p[i].setProveedor(dat6.next());
			System.out.println("Ingrese la cantidad de ese tipo de producto \n");
			Scanner dat7=new Scanner(System.in);
			p[i].setCantidad(dat7.nextInt());
			
		}
		
		
			
	}
	
	public void imprimirInve(){
		lista=new String [m+1][3];
		lista[0][0]="Nombre producto";
		lista[0][1]="Identificación";
		lista[0][2]="Cantidad del producto";
		
		
		for(int j=0; j<p.length;j++){
			
			for(int s=0;s<3;s++){
				
				if(s==0){
				lista[j+1][s]=p[j].getNombre();
				q=p[j].getNombre();
				
				}
				else if(s==1){
				lista[j+1][s]=p[j].getId();
				w=p[j].getId();
				
				}
				else if(s==2){
				lista[j+1][s]=Double.toString(p[j].getCantidad());
				u=Double.toString(p[j].getCantidad());
				}
				
				}
			
		
	}
	for(int l=0;l<m+1;l++){
		for(int k=0;k<3;k++){
		System.out.print(lista[l][k]+" ");
		}
		System.out.println("");
	}
		
	}
	
public static void main(String [] args){
	
	PruebaProdu pb = new PruebaProdu();
	pb.agregarProductos();
	pb.imprimirInve();
}
}
