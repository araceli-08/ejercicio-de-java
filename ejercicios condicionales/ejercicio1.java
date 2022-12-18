/**
 * 
 */
package condicionales;

import java.util.Scanner;

/**

 *
 */
public class ejercicio1 {

	/**

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in)) {
			double unidades, precio,compra ;
	        System.out.print(" unidades: ");
	        unidades= in.nextDouble();
	        in.nextLine();
	        precio=25;
            if (unidades <= 25) {
            	precio = 27;
            }else{
            	 precio = 23;
            	 compra=unidades*precio;
            	 System.out.print("precio" +precio);
            	 System.out.print(" comprar"+compra);
            	 {
	}

}
		}

	}
}
	
	
	
