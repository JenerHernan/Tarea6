package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		String opcion = JOptionPane.showInputDialog("Que figura vas a usar?").toLowerCase();
		
		
		switch(opcion) {
			case "circulo":
				double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo"));
				JOptionPane.showMessageDialog(null, "El area del circulo es " + calcularAreaCirculo(radio));
				break;
			case "triangulo":
				double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triangulo"));
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
				JOptionPane.showMessageDialog(null, "El area del triangulo es " + calcularAreaTriangulo(base,altura));
				break;
			case "cuadrado":
				double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
				JOptionPane.showMessageDialog(null, "El area del cuadrado es " + calcularAreaCuadrado(lado));
				break;
		}
	}
	
	public static double calcularAreaCirculo(double radio) {
		return (Math.pow(radio, 2) * Math.PI); 
	}

	public static double calcularAreaTriangulo(double base, double altura) {
		return (base * altura / 2); 
	}
	
	public static double calcularAreaCuadrado(double lado) {
		return (lado * lado); 
	}
}
