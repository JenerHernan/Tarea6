package Ejercicios;
import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam;
		
		System.out.print("Introduce el tamanyo del array: ");
		tam = Integer.parseInt(sc.nextLine());
		sc.close();
		
		int arr[] = introducirNumeros(tam,0,9);
		
		mostrarNumeros(arr,tam);
		
	}

	public static void mostrarNumeros(int[] arr,int tam) {
		int total = 0;
		System.out.print("Los numeros son: ");
		for(int i = 0; i < tam; i++) {
			System.out.print(i + ":" + arr[i] + " ");
			total += arr[i];
		}
		System.out.print("\nEl total es: " + total);
	}
	
	public static int[] introducirNumeros(int tam,int min, int max) {
		int arr[] = new int[tam];
		for(int i = 0; i < tam; i++)
			arr[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
		
		return arr;
	}
}
