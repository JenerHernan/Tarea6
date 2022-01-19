package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros quieres generar"));
		int rango1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce donde comienza el rango"));
		int rango2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce donde finaliza el rango"));
		
		for(int i = 0; i < n; i++)
			System.out.println(generarNumeroAleatorio(rango1,rango2));
	}
	
	public static int generarNumeroAleatorio(int rango1, int rango2) {
		return (int)Math.floor(Math.random() * (rango2 - rango1 + 1) + rango1);
	}
}
