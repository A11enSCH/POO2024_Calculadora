package POO2024_Calculadora;

import Operaciones.*;
import java.util.Scanner;

public class POO2024_Calculadora {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese el primer n�mero: ");
	        double num1 = scanner.nextDouble();
	        
	        System.out.print("Ingrese el segundo n�mero: ");
	        double num2 = scanner.nextDouble();
	        
	        System.out.print("Ingrese la operaci�n (+, -, *, /, ^, !: ");
	        char operador = scanner.next().charAt(0);
	        
	        Operacion operacion;
	        
	        switch (operador) {
	            case '+':
	                operacion = new Suma();
	                break;
	            case '-':
	                operacion = new Resta();
	                break;
	            case '*':
	                operacion = new Multiplicacion();
	                break;
	            case '/':
	                operacion = new Division();
	                break;
	            case '^':
	                operacion = new Potencia();
	                break;
	            case '!':
	                operacion = new Factorial();
	                break;
	            default:
	                System.out.println("Operaci�n no v�lida");
	                return;
	        }
	        
	        double resultado = operacion.calcular(num1, num2);
	        System.out.println("El resultado es: " + resultado);
	        
	       scanner.close();
	       }
}