package arregDat;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class TrabajoEmplead {
	int data[][];
	double promediotri[];
	double promedioven[];
	int cantidad;
	String[] nomtrab;
	String[] trimestre = {"Primero","Segundo","Tercero","Cuarto"};
	public TrabajoEmplead(){
		
		
		System.out.println("Ingrese la cantidad de trabajadores");
		Scanner d= new Scanner(System.in);
		cantidad=d.nextInt();	
		nomtrab=new String[cantidad];
		data=new int[cantidad][4];
		promedioven=new double[cantidad];
		promediotri=new double[4];
		for(int i=0;i<cantidad;i++){
			int c=i+1;
		System.out.println(c+" Ingrese el nombre");
		Scanner s= new Scanner(System.in);
		nomtrab[i]=s.next();
	}
		System.out.println("Comience a ingresar las cantidad para los Trimestres");
		for(int k=0;k<cantidad;k++){
			for(int j=0; j<4;j++){
				int a=j+1;
		System.out.println("Ingrese el valor para "+a+" Trimestre");
				Scanner q=new Scanner(System.in);
				data[k][j]=q.nextInt();
				promedioven[k]+=data[k][j];
			}
			promedioven[k]=promedioven[k]/4;
			}
		
		for(int o=0;o<4;o++){
			int h=o+1;
			for(int l=0;l<cantidad;l++){
				promediotri[o]+=data[l][o];
			}
			promediotri[o]=promediotri[o]/cantidad;
			System.out.println("Promedio por trimestre: "+h +promediotri[o]);
		}
		for(int r=0;r<cantidad;r++){
			System.out.println(nomtrab[r]);
			for(int t=0;t<4;t++){
				System.out.println(trimestre[t]+" "+data[r][t]);
			}
			System.out.println("promedio por vendedor: " +promedioven[r]);
		}
	 }
public static void main(String [] args){
	TrabajoEmplead m=new TrabajoEmplead();
	
}
}
