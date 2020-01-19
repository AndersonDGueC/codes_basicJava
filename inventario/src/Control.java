

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;

public class Control  {
	
	private List<Producto> listaProducto;
	private Producto pr;
	
	
	
	public Control(){
		this.listaProducto=new ArrayList<Producto>(2);
		pr=new Producto();
	}
	
	public void agregarProdu(){
		System.out.println("Agregue el nombre del producto: ");
		Scanner dat=new Scanner(System.in);
		pr.setNombre(dat.next());
		System.out.println("Agregue Id");
		Scanner dat1=new Scanner(System.in);
		pr.setId(dat1.next());
		System.out.println("Agregue el número de serie");
		Scanner dat2=new Scanner(System.in);
		pr.setNoSerie(dat2.nextInt());
		System.out.println("Agregue el valor por unidad");
		Scanner dat3=new Scanner(System.in);
		pr.setValor(dat3.nextDouble());
		System.out.println("Agregue al proveedor");
		Scanner dat4=new Scanner(System.in);
		pr.setProveedor(dat4.next());
		listaProducto.add(pr);
	}
	
	public Producto obtenerProductoLista(String id){
		Producto salida=new Producto();
		salida=null;
		for(Producto pr:listaProducto){
			if(pr.getId().equals(id)){
			salida=pr;
			break;
			}
			}
		return salida;
		
	}
	
	public int menuProducto(){
		System.out.println("Eige una de las opciones:");
		System.out.println("1.Modificar");
		System.out.println("2.Eliminar");
		Scanner dat3=new Scanner(System.in);
		return dat3.nextInt();
	}
	public void modificaProdu(Producto pr){
		boolean v= true;
		while(v){
		System.out.println("Elija que elemento modificar:");
		System.out.println("1.Nombre");
		System.out.println("2.Id");
		System.out.println("3.Número de serie");
		System.out.println("4.Valor");
		System.out.println("5.Proveedor");
		System.out.println("6.Cantidad");
		System.out.println("7.Salir");
		Scanner dat6=new Scanner(System.in);
		if(dat6.nextInt()==1){
			System.out.println("Ingrese el nombre");
			Scanner dat7=new Scanner(System.in);
			pr.setNombre(dat7.next());
		}
		else if(dat6.nextInt()==2){
			System.out.println("Ingrese el id ");
			Scanner dat8=new Scanner(System.in);
			pr.setId(dat8.next());
		}
		else if(dat6.nextInt()==3){
			System.out.println("Ingrese el número de serie");
			Scanner dat9=new Scanner(System.in);
			pr.setNoSerie(dat9.nextInt());
		}
		else if(dat6.nextInt()==4){
			System.out.println("Ingrese el valor");
			Scanner dat10=new Scanner(System.in);
			pr.setValor(dat10.nextDouble());
		}
		else if(dat6.nextInt()==5){
			System.out.println("Ingrese el Proveedor ");
			Scanner dat11=new Scanner(System.in);
			pr.setProveedor(dat11.next());
		}
		else if(dat6.nextInt()==6){
			System.out.println("Ingrese la cantidad ");
			Scanner dat12=new Scanner(System.in);
			pr.setCantidad(dat12.nextInt());
		}
		else if(dat6.nextInt()==7){
			v=false;
		}
		else{
			v=true;
		}
		}
	}
	
	public void eliminarProdu(Producto pr){
		listaProducto.remove(pr);
	}
	
	
	public void imprimirProductos(){
		System.out.println("Nombres  Identificacion  Cantidad");
		for(Producto pr:listaProducto){
			System.out.println(pr.getNombre()+" "+pr.getId()+" "+pr.getCantidad());
		}
	}
	
	public void menu(){
		boolean d=true;
		while(d){
		System.out.println("Bienvenido a nuestro Administrador ");
		System.out.println("Elija la opción respectivamente");
		System.out.println("1. Agregar producto");
		System.out.println("2.ver lista de productos");
		System.out.println("3.Buscar producto");
		System.out.println("4.Modificar caracteristicas del producto");
		System.out.println("5.Eliminar producto del inventario");
		Scanner dat10=new Scanner(System.in);
		if(dat10.nextInt()==1){
			agregarProdu();
		}
		else if(dat10.nextInt()==2){
			if(listaProducto.isEmpty()==true){
				System.out.println("No hay elementos en la lista");
			}
			else{
				imprimirProductos();
			}
		}
		else if(dat10.nextInt()==3){
			System.out.println("Ingrese el id del producto");
			Scanner dat15=new Scanner(System.in);
			Producto si;
			si=obtenerProductoLista(dat15.next());
			
			
		}
		else if(dat10.nextInt()==4){
			if(listaProducto.isEmpty()){
				System.out.println("No hay elementos en la lista");
			}
			else{
				System.out.println("Ingrese el id del producto");
				Scanner dat16=new Scanner(System.in);
				Producto su;
				su= obtenerProductoLista(dat16.next());
				modificaProdu(su);
			}
		}
		else if(dat10.nextInt()==5){
			System.out.println("Ingrese el id del producto que quiere eliminar");
			Scanner dat17=new Scanner(System.in);
			Producto sa;
			sa=obtenerProductoLista(dat17.next());
			eliminarProdu(sa);
		}
		else{
			d=false;
		}
		
		}
	}
	
	public static void main(String [] args){
		Control cs=new Control();
		cs.menu();
		
	}

}
