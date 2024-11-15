package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
        String nombre = input.nextLine();
        System.out.print("Introduce tu apellido: ");
        String apellido= input.nextLine();
		System.out.println(nombre +" "+apellido);
		
		
		
		input.close();
		
	}

}
