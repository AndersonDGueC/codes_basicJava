/*
 * @Autor Anderson Danilo Guerrero Calpa
 */

import java.util.Scanner;
public class TestEquip {
public static void main(String [] args){
	boolean ver=true;
	AlmacenBul al=new AlmacenBul();
	while(ver){
		System.out.println("Bienvenido a nuestro sistema de equipaje");
		System.out.println("ingrese el peso del equipaje");
		Scanner peso= new Scanner(System.in);
		
			
			al.agregarPaq(peso.nextFloat());
		System.out.println("Desea continuar ingresando valor del peso del equipaje");
		System.out.println("Si 1 y No 0");
		Scanner dec = new Scanner(System.in);
		if(dec.nextInt() == 1){
			ver = true;
		}
		else{
			ver = false;
			
			al.imprimir();
			System.out.println("El numero de bultos ingresados "+al.tam());
			System.out.println("El valor maximo es: "+al.maxPesoBulto());
			System.out.println("El valor minimo es: "+al.minPesoBulto());
			System.out.println("El peso total es: "+al.getPesoAcumBultos());
			System.out.println("El promedio del peso es: "+al.promPeso());
		}
	}

	}
}
