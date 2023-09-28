package Ejercicio2;

import java.util.Scanner;

public class ScannerEjercicio2Numero4 {

	public static void main(String[] args) {
		// Declaro variable lluvia
		boolean lluvia;
		
		//Declaro variable Tareas Finalizadas
		boolean tareaFin;
		
		//Declaro variable ir a biblioteca
		boolean biblioteca;

		//Declaro variable salir a la calle
		boolean salirCalle;
		
		//Creo el Sacnner
		Scanner sc = new Scanner(System.in);
		
		//Pregunto al usuario si llueve
		System.out.println("Responde true o false si: ¿Esta lloviendo?");
		
		//Leo la respuesta digitada
		lluvia = sc.nextBoolean();
		
		//Pregunto si ha hecho las tareas
		System.out.println("¿Terminaste las tareas?");
		
		//Leo la respuesta digitada
		tareaFin = sc.nextBoolean();
		
		//Pregunto si debe ir a la biblioteca
		System.out.println("¿Debes ir a la biblioteca?");
				
		//Leo la respuesta digitada
		biblioteca = sc.nextBoolean();
		
		//Doy instrucción a variable salirCalle
		salirCalle = biblioteca || (!lluvia && tareaFin);
		
		//Imprimo en pantalla si puede o no salir
		System.out.println(salirCalle ? "Puede salir" : "No puede salir");
		
		//cierro es Scanner
		sc.close();
		
		
		
		
	}

}
