package claseVector;

import java.util.Scanner;

public class PruebaVector2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("número de elementos: ");
		int n = sc.nextInt();
		
		Vector notas = new Vector(n);
		
		notas.leerV(sc);
		notas.mostrarV();
		System.out.println("producto: " + notas.producto());
		System.out.println("Med. Geom.: " + notas.mediaGeometrica());
	}

}
