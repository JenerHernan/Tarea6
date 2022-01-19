package Ejercicios;

import java.util.Scanner;
import java.util.ArrayList;


public class ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> correctos = new ArrayList<Integer>();
		int tam; 
		char digit;
		
		System.out.print("Introduce el tamanyo del array: ");
		tam = Integer.parseInt(sc.nextLine());
		
		System.out.print("Introduce el digito: ");
		digit = sc.nextLine().charAt(0);
		sc.close();
		
		int arr[] = introducirNumeros(tam,1,300);
		
		correctos = seleccionarNumeros(arr,tam,digit);
		
	}

	public static ArrayList<Integer> seleccionarNumeros(int[] arr, int tam, char digit) {
		ArrayList<Integer> buenos = new ArrayList<Integer>();
		
		System.out.print("Los numeros son: ");
		for(int i = 0; i < tam; i++) {
			String aux = String.valueOf(arr[i]);
			if(aux.charAt(aux.length() - 1) == digit) {
				System.out.print(i + ":" + arr[i] + " ");
				buenos.add(arr[i]);
			}
		}
		
		return buenos;
	}
	
	public static int[] introducirNumeros(int tam, int min, int max) {
		int arr[] = new int[tam];
		for(int i = 0; i < tam; i++)
			arr[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
		
		return arr;
	}
}
