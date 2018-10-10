package claseVectorV2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LanzaDado2 {

	
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.print("número de lanzamientos: ");
		int n = sc.nextInt();
		Random r = new Random();
		
		int[] v = new int[7];
		for (int i = 0; i < n; i++) {
			v[1 + r.nextInt(6)]++;
		}
		System.out.println(Arrays.toString(v));
	}

}
