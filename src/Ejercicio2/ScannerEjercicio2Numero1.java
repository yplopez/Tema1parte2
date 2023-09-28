package Ejercicio2;

import java.util.Scanner;

public class ScannerEjercicio2Numero1 {
public static void main(String[] args) {
	
	//Declaro la constante del valor de las manzanas
	final float VALOR_MANZANAS = 2.35f;
	
	//Declaro la constante del valor de las peras
	final float VALOR_PERAS = 1.95f;
	
	//Declaro la variable de cantidad en kilos de manzanas
	float cantidadManzanas;
	
	//Declaro la variable de cantidad en kilos de peras
	float cantidadPeras;
	
	//Declaro la variable que calcula el precio final
	float precioFinal;
		
	//Creo el Scanner
	Scanner sc = new Scanner(System.in);
	
	//Pido cantidad de kilos de Manzanas
	System.out.println("Por favor digite la cantidad de kilos de manzanas: ");
	
	//Leo la cantidad digitada en teclado
	cantidadManzanas = sc.nextFloat();
	
	//Pido cantidad de kilos de Peras
	System.out.println("Por favor digite la cantidad de kilos de peras: ");
	
	//Leo la cantidad digitada en teclado
	cantidadPeras = sc.nextFloat();
	
	//Calculo valor final
	precioFinal= VALOR_MANZANAS*cantidadManzanas + VALOR_PERAS*cantidadPeras;
	
	//Muestro el precio final
	System.out.println("El valor total a pagar es: " + precioFinal);
	
	
	
	
	
	
}
}
