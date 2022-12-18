/**
 * 
 */
package condicionales;

import java.util.Scanner;

/**
 * @author Jhon
 *
 */
public class ejercicio14 {

	/**

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner in = new Scanner(System.in);
				Scanner in1 = new Scanner(System.in)) {
		int dia_de_la_semana;
        System.out.print("Ingresa el valor de dia de la semana: ");
        dia_de_la_semana = in1.nextInt();
        in1.nextLine();
        if(dia_de_la_semana==1)
            System.out.println("Lunes");
        if(dia_de_la_semana==2)
            System.out.println("Martes");
        if(dia_de_la_semana==3)
            System.out.println("Mi\u00E9rcoles");
        if(dia_de_la_semana==4)
            System.out.println("Jueves");
        if(dia_de_la_semana==5)
            System.out.println("Viernes");
        if(dia_de_la_semana==6)
            System.out.println("S\u00E1bado");
        if(dia_de_la_semana==7)
            System.out.println("Domingo");
        if(dia_de_la_semana<1||dia_de_la_semana>7)
            System.out.println("D\u00EDa no v\u00E1lido");
    }

}

	}


