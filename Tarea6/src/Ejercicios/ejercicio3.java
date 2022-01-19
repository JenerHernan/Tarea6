package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
		
		if(esPrimo(numero))
			System.out.println("El numero introducido es primo");
		else
			System.out.println("El numero introducido no es primo");
	}
	
	public static Boolean esPrimo(int numero) {
		int cont = 0;
		for(int i = 1; i <= numero; i++)
			if(numero % i == 0)
				cont++;
		return cont <= 2;
	}
}
