package Ejercicio2;

import java.util.Scanner;

public class ScannerEjercicio2Numero3 {

	public static void main(String[] args) {
		// Declaro variable número par
		boolean numeroPar = true;
		
		//Creo variable número
		int numero;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido un número al usuario
		System.out.println("Escribe un número:");
		
		//Leo el número digitado en teclado
		numero = sc.nextInt();
		
		//Doy valor a variable numeroPar
		numeroPar = numero%2==0;
		
		//Muestro si el número es par o no
		System.out.println(numeroPar ?"Es número par.":"Es número impar.");
		
		//Cierro el Scanner
		sc.close();

	}

}
