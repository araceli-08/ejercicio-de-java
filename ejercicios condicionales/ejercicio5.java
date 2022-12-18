package condicionales;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in)) {
			double año;
	        
	        System.out.print(" año: ");
	        año = in.nextDouble();
	        in.nextLine();
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");
	}

}
}

