/**
 * 
 */
package condicionales;

import java.util.Scanner;

/**
 *
 */
public class ejercicio25 {

	//ejercicio0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in)) {
			double montototal_vendido, sueldo;
	        
	        System.out.print(" montototal_vendido: ");
	        montototal_vendido= in.nextDouble();
	        in.nextLine();
            if (montototal_vendido>500) {
            	    sueldo=0.10*montototal_vendido+25*(montototal_vendido/500);
            }else{ 
            	 sueldo=0.10*montototal_vendido;
            	 System.out.print(" el sueldo de un vendedor"+sueldo);
            }
}
		}
}
	
	

	
