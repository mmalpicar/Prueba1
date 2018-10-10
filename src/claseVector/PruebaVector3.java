package claseVector;

import java.util.Scanner;

public class PruebaVector3 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("número de elementos: ");
		int n = sc.nextInt();
		
		Vector vector = new Vector(n);
		
		vector.leerV(sc);
		vector.mostrarV();
		System.out.println("Suma de inversas: " + vector.sumaInv());
		System.out.println("Med. Armónica: " + vector.mediaArmonica());
	}

}
