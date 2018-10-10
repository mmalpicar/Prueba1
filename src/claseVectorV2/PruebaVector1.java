package claseVectorV2;

import java.util.Scanner;

public class PruebaVector1 {

	
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("número de elementos: ");
		int n = sc.nextInt();
		
		Vector v = new Vector(n);
		v.generarV(100);
		System.out.println(v);
		System.out.println("longitud: " +v.length());
	}
	
	

}
