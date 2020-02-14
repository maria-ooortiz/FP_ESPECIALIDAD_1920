package ejerciciosPsnt;

import java.util.Scanner;

public class mainejerciciosPS 
{
	public static void main(String [] args )
	{
		
		System.out.println("¿Que ejercicio quieres hacer?");
		int a;
		Scanner ejer = new Scanner (System.in);
		ejerciciosPseint objEjercicios= new ejerciciosPseint();
		a = ejer.nextInt();
		switch (a)
		{
			case 1:
				System.out.println("¿Que área es mayor?");
				objEjercicios.ejercicio1();
			break;
			
			case 2:
				System.out.println("Horas trabajadas.");
				objEjercicios.ejercicio2();
			break;	
			
			case 3:
				System.out.println("Intercambiar valores A y B ");
				objEjercicios.ejercicio3();
			break;
			
			case 4: 
				System.out.println("¿Que número es mayor?");
				objEjercicios.ejercicio4();
			break;
			
			case 5:
				System.out.println("Si el primero es negativo...");
				objEjercicios.ejercicio5();
			break;
			
			case 7:
				System.out.println("¿Que porcentaje de niños o niñas hay?");
				objEjercicios.ejercicio7();
			break;
			
			case 8:
				System.out.println("Descuento 15%");
				objEjercicios.ejercicio8();
			break;
			
			case 10:
				System.out.println("Precio matricula");
				objEjercicios.ejercicio10();
			break;
			
			case 11:
				System.out.println("Cambio de moneda");
				objEjercicios.ejercicio11();
			break;
			
			case 18:
				System.out.println("Cuadrado 9 siguientes");
				objEjercicios.ejercicio18();
			break;
			
			case 20:
				System.out.println("Tabla de multiplicar");
				objEjercicios.ejercicio20();
			break;
			
			case 22:
				System.out.println("Adivina la clave");
				objEjercicios.ejercicio22();
			break;
			
			case 34:
				System.out.println("Calculadora");
				objEjercicios.ejerciciocalcu();
			break;
			
			case 35:
				System.out.println("Conversión de números romanos.");
				objEjercicios.ejercicioromano();
			break;
			
			case 36:
				System.out.println("¿En qué estapa de la vida está?");
				objEjercicios.ejerciciosegun2();
			break;
			
			case 37:
				System.out.println("Área de la figura que quieras");
				objEjercicios.ejerciciosegun5();
			break;
			
			default:
				System.out.println("No es ningun ejercicio de PSeint");
			break;
				
		}
	}
}
