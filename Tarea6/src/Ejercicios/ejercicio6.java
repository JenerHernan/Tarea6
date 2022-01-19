package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio6 {

	public static void main(String[] args) {
		int numero =Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
		
		JOptionPane.showMessageDialog(null, "Este numero tiene " + numeroCifras(numero) + " cifras");
	}

	public static int numeroCifras(int num) {
		int cifras = 1;
		for(int i = 10; num > i; i*=10)
			cifras++;
		return cifras;
	}
}
