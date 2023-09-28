package Ejercicio2;

import java.util.Scanner;

public class ScannerEjercicio2Numero2 {

	public static void main(String[] args) {
		// Declaro la variable mayor de edad
		boolean mayorEdad = true;
		
		//creo variable edad
		int edad;
		
		//Creo el scanner
		Scanner sc = new Scanner(System.in);
				
		//Pido que al usuario que escriba la edad
		System.out.println("Digite su edad: ");
				
		//Leo lo digitado en teclado
		edad = sc.nextInt();
		
		//doy valor a variable mayor de edad
		mayorEdad = edad>=18;
		
		//Muestro si es mayor de edad o no
		System.out.println(mayorEdad ? "Eres mayor de edad.":"Aun no eres mayor de edad.");
		
		//cierro el scanner
		sc.close();		

	}

}
