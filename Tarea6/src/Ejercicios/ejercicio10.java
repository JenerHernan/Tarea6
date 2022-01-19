package Ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam, max, min;
		
		System.out.print("Introduce el tamanyo del array: ");
		tam = Integer.parseInt(sc.nextLine());
		
		System.out.print("Introduce el minimo del rango: ");
		min = Integer.parseInt(sc.nextLine());
		
		System.out.print("Introduce el maximo del rango: ");
		max = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int arr[] = introducirNumeros(tam,min,max);
		
		mostrarNumeros(arr,tam);
		
	}

	public static void mostrarNumeros(int[] arr,int tam) {
		int mayor = arr[0];
		System.out.print("Los numeros son: ");
		for(int i = 0; i < tam; i++) {
			if(arr[i] > mayor)
				mayor = arr[i];
			System.out.print(i + ":" + arr[i] + " ");
		}
		System.out.print("\nEl mayor de todo es: " + mayor);
	}
	
	public static int[] introducirNumeros(int tam,int min, int max) {
		int arr[] = new int[tam];
		for(int i = 0; i < tam; i++){
			int aux;
			do
				aux = (int) Math.floor(Math.random() * (max - min + 1) + min);	
			while(!esPrimo(aux));
			arr[i] = aux;
		}
		return arr;
	}
	
	public static Boolean esPrimo(int numero) {
		int cont = 0;
		for(int i = 1; i <= numero; i++)
			if(numero % i == 0)
				cont++;
		return cont <= 2;
	}
}

