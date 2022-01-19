package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio4 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero para realizar el factorial"));
		
		JOptionPane.showMessageDialog(null, calcularFactorial(numero));
	}

	public static int calcularFactorial(int num) {
		int resultado = 1;
		for(int i = 1; i <= num; i++)
			resultado *= i;
		
		return resultado;
	}
}
