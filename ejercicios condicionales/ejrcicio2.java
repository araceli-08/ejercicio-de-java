/**
 * 
 */
package condicionales;

import java.util.Scanner;

/**

 *
 */
public class ejrcicio2 {

	private static double importepagar;

	/**

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in)) {
			double unidades,importe,descuento;
	        
	        System.out.print("cantidad deproductos : ");
	        unidades= in.nextDouble();	
	        in.nextLine();
	        if (unidades >= 1) {
	        if (unidades<=50);
	         System.out.print("Se regalan 5 caramelos ");        
	        }else{
	        	if (unidades<50) {
	        	 if (unidades<= 100);
	        	System.out.print("Se regalan 10 caramelos ");  
	        	
		 }else{
	        	System.out.print("Se regalan 15 caramelos ");
	        importe= unidades*20;
	        if (importe > 700) {
	       descuento= importe*0.16;
	        }else {
	    	    descuento = importe*0.12;
	    	    setImportepagar(importe-descuento);  
              System.out.print("descuento {importe_a_pagar: ");
              {
            	  
              }
	       
	        }
		 }
	        }
		}
	}

	public static double getImportepagar() {
		return importepagar;
	}

	public static void setImportepagar(double importepagar) {
		ejrcicio2.importepagar = importepagar;
	}
}

		




		
