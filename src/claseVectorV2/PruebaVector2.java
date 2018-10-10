package claseVectorV2;

import java.util.Scanner;

public class PruebaVector2 {

	
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("número de elementos: ");
		int n = sc.nextInt();
		
		Vector v = new Vector(n);
		v.generarV(100);
		System.out.println(v);
		System.out.println("tamaño:     " + v.length());
		System.out.println("suma:       " + v.suma());
		System.out.println("promedio:   " + v.promedio());
		System.out.println("media geom. " + v.mediaGeometrica());
		System.out.println("media armón:" + v.mediaArmonica());
		System.out.println("Mayor:      " + v.maximo());
		System.out.println("Menor:      " + v.minimo());
		System.out.println("varianza:   " + v.varianza());
		System.out.println("desv. est.: " + v.desvEst());
	}

}
