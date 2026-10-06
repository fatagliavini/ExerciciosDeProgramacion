import java.util.*;

public class EjercicioCalculadoraJorgeFabrizio{
	public static void main(String[] args) {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese la temperatura en grados Celsius: ");
		double celsius = scanner.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println("La temperatura en fahrenheit es: " + fahrenheit);
		System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
		fahrenheit = scanner.nextDouble();
		celsius = (fahrenheit - 32) * 5/9;
		System.out.println("La temperatura en Celsius es: " + celsius);
		
		System.out.println();
		System.out.print ("Ingrese el radio del circulo: ");	
		double radio = scanner.nextDouble();
		final double PI = 3.14159;
		double area = PI * Math.pow(radio, 2);
		double perimetro = 2 * PI * radio;
		System.out.println ("El area del circulo es: " + area);
		System.out.println ("el perimetro del circulo es: " + perimetro);
		
		System.out.println();
		System.out.print ("Ingrese la base del cuadrado: ");	
		double base = scanner.nextDouble();
		area = radio * radio;
		perimetro = 4 * radio;
		System.out.println ("El area del cuadrado es: " + area);
		System.out.println ("el perimetro del cuadrado es: " + perimetro);
		
		System.out.println();
		System.out.print ("Ingrese la base del triangulo: ");	
		base = scanner.nextDouble();
		System.out.print ("Ingrese la altura del triangulo: ");	
		double altura = scanner.nextDouble();
		System.out.print ("Ingrese el lado 1 del triangulo: ");	
		double lado1 = scanner.nextDouble();
		System.out.print ("Ingrese el lado 2 del triangulo: ");	
		double lado2 = scanner.nextDouble();
		area = (base * altura) / 2;
		perimetro = base + lado1 + lado2;
		System.out.println ("El area del triangulo es: " + area);
		System.out.println ("el perimetro del triangulo es: " + perimetro);
		
		System.out.println();
		System.out.print ("Ingrese el base pequeña (arriba) del trapecio: ");	
		double basePequeña = scanner.nextDouble();
		System.out.print ("Ingrese el base grande (abajo) del trapecio: ");	
		double baseGrande = scanner.nextDouble();
		System.out.print ("Ingrese la altura del trapecio: ");	
		altura = scanner.nextDouble();
		System.out.print ("Ingrese el lado del trapecio: ");	
		lado1 = scanner.nextDouble();
		area = (basePequeña + baseGrande) / 2 * altura;
		perimetro = basePequeña + baseGrande + lado1 + lado1;
		System.out.println ("El area del trapecio es: " + area);
		System.out.println ("el perimetro del trapecio es: " + perimetro);
		
		System.out.println();
		System.out.print ("Ingrese el numero entero 1: ");	
		int num1 = scanner.nextInt();
		System.out.print ("Ingrese el numero entero 2: ");	
		int num2 = scanner.nextInt();
		System.out.print("Suma: " + num1 + " + " + num2 + " = ");
		System.out.println(num1 + num2);
		System.out.print("Resta: " + num1 + " - " + num2 + " = ");
		System.out.println(num1 - num2);
		System.out.print("Multiplicacion: " + num1 + " * " + num2 + " = ");
		System.out.println(num1 * num2);
		System.out.print("Divison: " + num1 + " / " + num2 + " = ");
		System.out.println(num1 / num2);
		System.out.print("Resto: " + num1 + " % " + num2 + " = ");
		System.out.println(num1 % num2);
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("Ingrese un número entre 1 y 3 (0 para salir): ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0 :
				break;
			case 1 :
				System.out.println("Seleccionaste opcion 1.");
				break;
			case 2 :	
				System.out.println("Seleccionaste opcion 2.");
				break;
			case 3 :	
				System.out.println("Seleccionaste opcion 3.");
				break;
			default:	
				System.out.println("Numero no válido");
				break;
			}
		} while (opcion != 0);
		
		System.out.println("Ingresse un numero para ver su tabla de multiplicar: ");
		int numero = scanner.nextInt();
			System.out.println("---Tabla del" + numero+ "---");
		for (int i=1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero+ " X " + i + " = " + resultado);
		}
		System.out.println("Ingresa un numero para calcular su factorial: ");
		long factorial = 1;
		int i = 1;
		while (i<= numero) {
			factorial = factorial * i;
			System.out.println("El factorial de:" + numero + "es:" + factorial);
			
			
		}
		
	}	
	
	
	
	
	
	
	
}