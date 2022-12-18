/**
 * 
 */
package condicionales;

import java.util.Scanner;

/**
 * @author Jhon
 *
 */
public class ejercicio3 {

	/**
	 */
	// ejercicio35
		// TODO Auto-generated method stub
		 public static void main(String[] args){
		        try (Scanner in = new Scanner(System.in)) {
					int codigo_del_empleado;
					System.out.print("Ingresa el valor de codigo del empleado: ");
					codigo_del_empleado = in.nextInt();
					in.nextLine();
					if(codigo_del_empleado%2==0&&codigo_del_empleado%3==0&&codigo_del_empleado%5==0)
					    System.out.println("Administrativo");
					if(codigo_del_empleado%2!=0&&codigo_del_empleado%3==0&&codigo_del_empleado%5==0)
					    System.out.println("Directivo");
					if(codigo_del_empleado%2==0&&codigo_del_empleado%3!=0&&codigo_del_empleado%5!=0)
					    System.out.println("Vendedor");
					if(codigo_del_empleado%2!=0&&codigo_del_empleado%3!=0&&codigo_del_empleado%5!=0)
					    System.out.println("Seguridad");
				}
		        
}
}

