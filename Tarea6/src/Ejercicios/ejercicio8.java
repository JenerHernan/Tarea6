package Ejercicios;
import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		
		numeros = introducirNumeros();
		mostrarNumeros(numeros);
		System.out.println();
	}

	public static void mostrarNumeros(int[] arr) {
		System.out.print("Los numeros son: ");
		for(int i = 0; i < 10; i++)
			System.out.print(i + ":" +  arr[i] + " ");
	}
	
	public static int[] introducirNumeros () {
		Scanner sc = new Scanner(System.in);
		int aux[] = new int [10];
		for(int i = 0; i < 10; i++) {
			System.out.print("Introduce un numero: ");
			aux[i] = Integer.parseInt(sc.nextLine());
		}
		sc.close();
		
		return aux;
	}
}
