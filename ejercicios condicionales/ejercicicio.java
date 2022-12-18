/**
 * 
 */
package condicionales;

import java.util.Scanner;

public class ejercicicio {

	/**
	 * @param args
	 */
	//ejercicio06
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in)) {
			double EDAD;
	        
	        System.out.print("Ingresa LA EDAD : ");
	        EDAD= in.nextDouble();
	        in.nextLine();
            if (EDAD>=18) {
	System.out.println("Uated es mayor de edad");
}
else
	System.out.println("Usted es menor de esda");

	}

}
}