package claseVectorV2;

import java.util.Random;
import java.util.Scanner;

public class LanzaDosDados {

	
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.print("número de lanzamientos: ");
		int n = sc.nextInt();
		Random r = new Random();
		
		int[] v = new int[13];
		
		for (int i = 0; i < n; i++) {
			int dado1 = 1 + r.nextInt(6);
			int dado2 = 1 + r.nextInt(6);
			v[dado1 + dado2]++;
		}
		
		for (int i = 0; i < 13; i++) {
			System.out.println(i + ": " + v[i]);
		}
	}

}
