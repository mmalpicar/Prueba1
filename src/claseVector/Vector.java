package claseVector;

import java.util.Random;
import java.util.Scanner;

public class Vector {
	int[] v;
	
	public Vector(int n) {
		v = new int[n];
	}
	
	public double mediaArmonica(){
		return v.length/sumaInv();
	}
	public double sumaInv() {
		double sum = 0;
		for (int i = 0; i < v.length; i++) {
			sum += (double) 1/v[i];
		}
		return sum;
	}

	public double mediaGeometrica() {
		return Math.pow(producto(), (double)1/v.length);
	}
	
	public long producto() {
		long pro = 1;
		for (int i = 0; i < v.length; i++) {
			pro *= v[i];
		}
		return pro;
	}
	public double promedio() {
		return (double)suma()/v.length;
	}
	public int suma() {
		int sum = 0;
		for (int i = 0; i < v.length; i++) {
			sum += v[i];
		}
		return sum;
	}
	public void mostrarV() {
		System.out.println();
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + "\t");
		}
		System.out.println();
	}
	public void generarV(int rango) {
		Random r = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = r.nextInt(rango);
		}
	}
	
	public void leerV(Scanner sc) {
		System.out.println();
		for (int i = 0; i < v.length; i++) {
			System.out.print("V[" + (i+1) + "]= ");
			v[i] = sc.nextInt();
		}
	}
}
