/**
 * 
 */
package condicionales;

import java.util.Scanner;

/**
 *
 */
public class ejercicio7 {

	/**
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try (// TODO Auto-generated method stub
					Scanner in = new Scanner(System.in)) {
				double primer_numero,segundo_numero,tercer_numero,medio,xtem;
		        
		        System.out.print("Ingresa el primer numero : ");
		        primer_numero= in.nextDouble();
		        System.out.print("Ingrese el segundo: ");
		        segundo_numero= in.nextDouble();
		        System.out.print("Ingrese el tercero : ");
		        tercer_numero= in.nextDouble();
		        
		        in.nextLine();
		        if (primer_numero>segundo_numero){ 
		        	   medio=primer_numero;
		        	   xtem=segundo_numero ;
			}else{ 
				medio=(segundo_numero);
						 xtem = primer_numero;
						if (medio > tercer_numero) 
						   medio = tercer_numero;
						if (medio < xtem)
						   medio = xtem;
						System.out.print(medio);
						
			}
		        		   
		        	 
}
}
}
	
