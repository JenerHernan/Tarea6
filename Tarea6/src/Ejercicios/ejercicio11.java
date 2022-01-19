package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la dimension de los arrays: ");
		size = Integer.parseInt(sc.nextLine());
		
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		int arr3[] = new int[size];
		
		arr1 = llenarArray(size);
		arr2 = arr1;
		
		arr2 = llenarArray(size);
		arr3 = multArrays(arr1,arr2,size);
		
		for(int i = 0; i < size; i++)
			System.out.println("Posicion " + i + " de arr1 es " + arr1[i] + " de arr2 es " + arr2[i] + " y de arr3 es " + arr3[i]);
		
		
	}

	static public int[] multArrays(int[] arr1, int[] arr2, int size) {
		int sol[] = new int[size];
		
		for(int i = 0; i < size; i++)
			sol[i] = arr1[i] * arr2[i];
		
		return sol;
	}
	
	static public int[] llenarArray(int size) {
		Random random = new Random();
		int sol[] = new int[size]; 
		
		for(int i = 0; i < size; i++)
			sol[i] = random.nextInt(10);
		
		return sol;
	}
}
