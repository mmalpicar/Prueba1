package claseVectorV2;

import java.util.Scanner;

public class LanzaUnDado {

	
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("número de lanzamientos: ");
		int n = sc.nextInt();
		
		Vector v = new Vector(n);
		v.generarV(1,6);
		System.out.println(v);
		int cara1 = 0;
		int cara2 = 0;
		int cara3 = 0;
		int cara4 = 0;
		int cara5 = 0;
		int cara6 = 0;
		
		for (int i = 0; i < v.length(); i++) {
			switch (v.getV(i+1)) {
			case 1:
				cara1++;
				break;
			case 2:
				cara2++;
				break;
			case 3:
				cara3++;
				break;
			case 4:
				cara4++;
				break;
			case 5:
				cara5++;
				break;
			case 6:
				cara6++;
				break;
			default:
				break;
			}
		}
		System.out.println("cara 1: " + cara1);
		System.out.println("cara 2: " + cara2);
		System.out.println("cara 3: " + cara3);
		System.out.println("cara 4: " + cara4);
		System.out.println("cara 5: " + cara5);
		System.out.println("cara 6: " + cara6);
	}
}
