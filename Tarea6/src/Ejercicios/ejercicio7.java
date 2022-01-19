package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio7 {

	public static void main(String[] args) {
		String moneda = "";
		double cantidad;
		
		cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de euros"));
		moneda = JOptionPane.showInputDialog("Introduce la moneda a convertir\n1.Dolares\n2.Yenes\n3.Libras").toLowerCase();
	
		calcularCambio(cantidad, moneda);
	}

	public static void calcularCambio(double cant, String moneda) {
		switch(moneda) {
			case "dolares":
				cant = cant * 1.28611;
				JOptionPane.showMessageDialog(null, "El cambio es " + cant + " dolares");
				break;
			case "libras":
				cant = cant * 0.86;
				JOptionPane.showMessageDialog(null, "El cambio es " + cant + " libras");
				break;
			case "yenes":
				cant = cant * 129.852;
				JOptionPane.showMessageDialog(null, "El cambio es " + cant + " yenes");
				break;
		}
	}
}
