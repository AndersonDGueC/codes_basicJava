import java.util.Scanner;
public class TiquetsTest {
public static void main(String [] args){
	
	Tiquets one = new Tiquets();
	System.out.println("Bienvenido a la sucursal aerea");
	System.out.println("ingrese el numero de dias que desea estar");
	Scanner dia = new Scanner(System.in);
	one.setNumeroDias(dia.nextInt());
	System.out.println("ingrese el numero de km a recorrer");
	Scanner km = new Scanner(System.in);
	one.setDistanciaRecor(km.nextFloat());
	System.out.println("El valor del pasaje es: "+one.calculoValorPasaje());
}
}
