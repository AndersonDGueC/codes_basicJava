package marcg;
import java.io.*;
import java.util.*;
public class ManArch {
	
	public static void main(String [] args) throws IOException{
		String s;
		String m;
		//int t;
		String t;
		String l;
		String q;
		String y;
		
		StringTokenizer sst;
		System.out.println("Hola");
		File fichero = new File("/home/anderson/d.txt");
		//System.out.println(fichero.getAbsolutePath());
		FileReader fr=new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		PrintWriter sal=new PrintWriter(new FileWriter("/home/anderson/Escritorio/importar_ventas.txt"));
		PrintWriter salErr=new PrintWriter(System.out,true);
		s=br.readLine();
		while(s!=null){
			try{
			sst=new StringTokenizer(s,",");
			m=sst.nextToken();
			l=sst.nextToken();
			t=sst.nextToken();
			q=sst.nextToken();
			y=sst.nextToken();
			
			sal.println(m+","+l+","+y);
			
			}
			catch(NoSuchElementException nsee){
				salErr.println("No Hay Elementos completos"+s+nsee.toString());
			}
			s=br.readLine();
			
		}
		sal.close();
		System.out.println(s);
	}
}
