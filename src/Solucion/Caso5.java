package Solucion;

import java.util.*;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrCodigo= {"A-123", "A-456", "A-789", "A159"};
		String[] arrNombre= {"Joe Castillo", "Rosa Flores", "Alec Patiño", "Roberto Ramos"};
		int[] arrNota = {13, 8, 18, 10};
		
		String codigo = "";
		
		System.out.println("\n-------------------------------");
		System.out.println("Colegio Senati - Modulo de buscas");
		System.out.println("---------------------------------");
		
		System.out.print("Codigo a buscar: ");
		codigo = sc.nextLine();
		
		// Realizar la búsqueda del código en el arreglo arrCodigo
		int posicion= -1;
		
		for (int i = 0; i < arrCodigo.length; i++) {
			if (arrCodigo[i].equals(codigo)) {
				posicion = i;
				break;
			}
		}
		
		System.out.println("\nResultados");
		System.out.println("------------");
		
		if (posicion == -1) {
			// Código no se encontró
			System.out.println("\nCódigo no encontrado");
		} else {
			System.out.println("Datos del Participante");
			System.out.println("----------------------");
			System.out.println("Código....: " + arrCodigo[posicion]);
			System.out.println("Nombre....: " + arrNombre[posicion]);
			System.out.println("Nota....: " + arrNota[posicion]);
			
			if (arrNota[posicion] >= 11)
				System.out.println("Estado........: Aprobado");
			else
				System.out.println("Estado........: Desaprobado");

		}

	}

}
