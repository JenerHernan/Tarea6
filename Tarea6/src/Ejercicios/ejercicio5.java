package Ejercicios;

public class ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println(convertirBinario(127));

	}
	
	public static String convertirBinario(int numero) {
		String resultado = "";
		
		if(numero == 1)
			resultado = "1";
		else if(numero == 0)
			resultado = "0";
			else{ 
				while(numero >= 2) {
					resultado = numero % 2 + resultado;
					numero /= 2;
				}
				
				resultado = "1" + resultado;
			}
		
		return resultado;
	}
}
