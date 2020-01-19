import java.io.*;
import java.util.Scanner;
public class AplicacionBanco {

	



	
	public static void main(String[] args){
		Cliente arregloClientes[]=new Cliente[3];
		Cuenta arregloCuentas[]=new Cuenta [6];
		//Persona javier= new Persona("Javier", 24, 'M', 2324252);
		arregloClientes[0]=new Cliente("Javier Guzman",28,'M',123456, 123);
		arregloClientes[1]=new Cliente("Jose Benavidez",32,'M',654321, 456);
		arregloClientes[2]=new Cliente("Maria Bello",25,'F', 98765, 789);
		arregloCuentas[0]=new Cuenta(arregloClientes[0],2000.0);
		arregloCuentas[1]=new Cuenta(arregloClientes[0],1500.34);
		arregloCuentas[2]=new Cuenta(arregloClientes[2],1600);
		arregloCuentas[3]=new Cuenta(arregloClientes[2],525.76);
		arregloCuentas[4]=new Cuenta(arregloClientes[2],3500);
		arregloCuentas[5]=new Cuenta(arregloClientes[1],200);
	
		int usuario=0;
		int n=0;
		int m=0;
		int c=0;
		int d=0;
		int num=0;
		int num1=0;
		int id1=0;
		int [] numC=new int[4];
		int [] numD=new int[4];
		boolean rd=false;
		double cantidadI=0;
		double cantidadI2=0;
		System.out.println("Ingrese su número de usuario");
		Scanner entradaDato=new Scanner(System.in);
		usuario=entradaDato.nextInt();
		//System.out.println("Edad: "+arregloClientes[0].id);
		for(int i=0;i<arregloClientes.length;i++){
			if(usuario == arregloClientes[i].noUsuario){
			n=i;
					}
			else
			{
				m=m+1;
			}
			}
		if(m!=arregloClientes.length){
		System.out.println("Nombre: "+arregloClientes[n].nombre);
		System.out.println("Desea retirar escriba true");
		System.out.println("si quiere donar escriba false");
		Scanner entradaDato2=new Scanner(System.in);
		rd=entradaDato2.nextBoolean();
		if(rd==true){
			System.out.println("ingrese su Identidad");
			Scanner entradaDato6=new Scanner(System.in);
			id1=entradaDato6.nextInt();
			if(arregloClientes[n].id==id1){
				System.out.println("Corresponde al usuario");
				System.out.println("Ingrese cuanto desea retirar");
				Scanner entradaDato7=new Scanner(System.in);
				cantidadI2=entradaDato7.nextInt();
				for (int l=0; l<arregloCuentas.length;l++){
					if(arregloCuentas[l].titular==arregloClientes[n]){
					d=d+1;
					numD[d]=l;
					}
				}
				
				System.out.println("Usted posee este numero de cuentas"+d);
				System.out.println("a que cuenta desea retirar");
				for(int r=0; r<numD.length; r++){
					System.out.println(numD[r]);
				}
				Scanner entradaDato8 = new Scanner(System.in);
				num1=entradaDato8.nextInt();
				if(cantidadI2>arregloCuentas[num1].saldo){
					System.out.println("Ssldo insufiente");
				}
				else{
					arregloCuentas[num1].retiro(cantidadI2);
					System.out.println("Su saldo es:"+arregloCuentas[num1].getSaldo());
				}
			}
			else
			{
				System.out.println("No se ha reconocido al usuario");
			}
			
		
		}
		else{
			System.out.println("Ingrese la cantidad a depositar");
			Scanner entradaDato3=new Scanner(System.in);
			cantidadI=entradaDato3.nextInt();
			for(int s=0;s<arregloCuentas.length;s++){
				if(arregloCuentas[s].titular==arregloClientes[n]){
				c=c+1;	
				numC[c]=s;
				}
				
			}
			System.out.println("Usted posee esta cantidad de cuentas:"+c);
			System.out.println("las cuales son:");
			for(int t=0;t<numC.length;t++){
				System.out.println(numC[t]);
			}
			System.out.println("ingrese a que cuenta quiere depositar el dinero");
			Scanner entradaDato5=new Scanner(System.in);
			num=entradaDato5.nextInt();
			arregloCuentas[num].deposito(cantidadI);
			System.out.println("Su cantidad actual es:"+arregloCuentas[num].getSaldo());
			
			
		}
		}
		else{
		System.out.println("Usuario no identificado");
		}
	}
	
	
}
