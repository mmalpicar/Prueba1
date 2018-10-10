package claseVector;

import java.util.Scanner;

public class PruebaVector1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número de elementos: ");
		int n =sc.nextInt();
		
		Vector v = new Vector(n);
		v.generarV(100);
		v.mostrarV();
		System.out.println("suma: " + v.suma());
		System.out.println("promedio: " + v.promedio());
		
		System.out.print("Número de notas: ");
		n =sc.nextInt();
		Vector notas = new Vector(n);
		notas.generarV(21);
		notas.mostrarV();
		System.out.println("suma: " + notas.suma());
		System.out.println("promedio: " + notas.promedio());
	}

}
