package pila123;
import java.util.Stack;

public class pila {
	
	public static void main(String [] args){
		Stack<Libro> pila1 = new Stack<Libro>();
		Libro l1 = new Libro("The Art of Deception","Kevin Mitnic");
		Libro l2 = new Libro("Economisata Camuflado", "xxxx");
		
		pila1.push(l1);
		pila1.push(l2);
		
		System.out.println(pila1.peek().getTitulo());//ultimo elemento pero no lo elimina
		
		while(!pila1.isEmpty()){
			System.out.println(pila1.pop().getTitulo());//ultimo y elimna 
		}
		
	}
}
