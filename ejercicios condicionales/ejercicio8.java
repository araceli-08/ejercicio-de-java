/**
 * 
 */
package condicionales;

import java.util.Scanner;

/**

 *
 */
public class ejercicio8 {

	/**

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try (// TODO Auto-generated method stub
						Scanner in = new Scanner(System.in)) {
					double primer_exsamen,segundo_examen,tercer_examen,propina;
			        
			        System.out.print("Ingresa el primer exsamen : ");
			        primer_exsamen= in.nextDouble();
			        System.out.print("Ingresa el segundo exsamen : ");
			        segundo_examen= in.nextDouble();
			        System.out.print("Ingresa el tercero exsamen : ");
			        tercer_examen= in.nextDouble();
			        
			        in.nextLine();

          propina=20;
               if 
               (primer_exsamen>13)
            propina=propina+5;
               if 
               (segundo_examen>13)
            propina=propina+5;
               if 
               (tercer_examen>13)
            propina=propina+5;
               
               }
			String propina = null;
			System.out.println("Valor de la propina"+propina);
		}

	}


