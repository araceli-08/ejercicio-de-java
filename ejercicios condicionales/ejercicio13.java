/**
 * 
 */
package condicionales;

import java.util.Scanner;

/**
 * @author Jhon
 *
 */
public class ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner in = new Scanner(System.in);
				Scanner in1 = new Scanner(System.in)) {
		 double anticipo, costo_de_la_casa, ingresos, pago_mensual, pagos;
	        System.out.print("Ingresa el valor de costo de la casa: ");
	        costo_de_la_casa = in1.nextDouble();
	        in1.nextLine();
	        System.out.print("Ingresa el valor de ingresos: ");
	        ingresos = in1.nextDouble();
	        in1.nextLine();
	        if(ingresos>2000000)
	        {
	            anticipo=costo_de_la_casa*0.35;
	            pagos=7*12;
	        }
	        else
	        {
	            anticipo=costo_de_la_casa*0.2;
	            pagos=15*12;
	        }
	        pago_mensual=(costo_de_la_casa-anticipo)/pagos;
	        System.out.println("Valor de anticipo: " + anticipo);
	        System.out.println("Valor de pago mensual: " + pago_mensual);
	        System.out.println("Valor de pagos: " + pagos);
	    }

	}
	}


