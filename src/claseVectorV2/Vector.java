package claseVectorV2;

import java.util.Random;
import java.util.Scanner;

public class Vector {
	private int[] v;
	
	public int getV(int n) {
		return v[n-1];
	}
	public void setV(int n, int valor) {
		this.v[n-1] = valor;
	}
	public Vector(int n) {
		v = new int[n];
	}
	public int length() {
		return v.length;
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
	
	@Override
	public String toString() {
		String s = "\n";
		for (int i = 0; i < v.length; i++) {
			s += v[i] + "\t";
		}
		s += "\n";
		return s;
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
	
	public void generarV(int limInferior, int limSuperior) {
		Random r = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = r.nextInt(limSuperior + 1 - limInferior) + limInferior;
		}
	}
	
	public void leerV(Scanner sc) {
		System.out.println();
		for (int i = 0; i < v.length; i++) {
			System.out.print("V[" + (i+1) + "]= ");
			v[i] = sc.nextInt();
		}
	}
	public int minimo() {
		int min = v[0];
		for (int i = 0; i < v.length; i++) {
			if (v[i] < min) {
				min = v[i];
			}
		}
		return min;
	}

	public int maximo() {
		int may = v[0];
		for (int i = 0; i < v.length; i++) {
			if (v[i] > may) {
				may = v[i];
			}
		}
		return may;
	}
	
	public float desvEst() {
		return (float) Math.sqrt(varianza());
	}

	public float varianza() {
		double prom = promedio();
		float suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma += (v[i] - prom) * (v[i] - prom);
		}
		return suma / (v.length-1);
	}

}
