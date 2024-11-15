package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
        int numero1 = input.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = input.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        
		
		
		input.close();

	}

}
