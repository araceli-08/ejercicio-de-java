package sercuenciales;

import java.util.Scanner;

public class ejercicio7 {

	public ejercicio7() {
		// TODO Auto-generated constructor stub
	}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
						try (// TODO Auto-generated method stub
						Scanner in = new Scanner(System.in)) {
							double BASE,AREA,PERIMETRO , ALTURA;
					        System.out.print("Ingresa LA BASE DEL RECTANGULO: ");
					        BASE = in.nextDouble();
					        System.out.print("Ingresa ALTURA: ");
					        ALTURA = in.nextDouble();
					        
					        in.nextLine();
					        AREA=(BASE*ALTURA);
					        System.out.println("AREA DEL RECTANGULO: " + AREA);
					        PERIMETRO=2*(BASE+ALTURA);
					        System.out.println("PERIMETRO: " + PERIMETRO);
	
						}
			}
}
