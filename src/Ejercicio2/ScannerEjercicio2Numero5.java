package Ejercicio2;

import java.util.Scanner;

public class ScannerEjercicio2Numero5 {

	public static void main(String[] args) {
		// Declaro las variables de las notas
		int nota1;
		int nota2;
		int nota3;
		
		//Declaro la variable media
		int media;
		
		//Declaro media entera
		int mediaEntera;
		
		//Declaro media con decimal
		float mediaDecimal;
		
		//inicio el scanner
		Scanner sc = new Scanner (System.in);
		
		//Pido las notas al alumno
		System.out.println("Escribe tus notas ");
		
		//Leo la informacion digitada
		nota1 = sc.nextInt();
		nota2 = sc.nextInt();
		nota3 = sc.nextInt();
		
		//Doy valor para hallar mediaEntera
		mediaEntera=(nota1+nota2+nota3)/3;
		
		//Doy valor para calcular mediaDecimal
		mediaDecimal=(nota1+nota2+nota3)/3f;
		
		//muestro el promedio
		System.out.println("La media obtenida en el boletín es: " + mediaEntera + " Y La media en el expediente académico es: " + mediaDecimal);

	}

}
