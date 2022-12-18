package sercuenciales;

import java.util.Scanner;

public class ejercico6 {

	public ejercico6() {
		
	}
		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
					try (// TODO Auto-generated method stub
					Scanner in = new Scanner(System.in)) {
						double RADIO,ALTURA,VOLUMEN , AREA;
				        System.out.print("Ingresa EL RADIO DEL CILINDRO: ");
				        RADIO = in.nextDouble();
				        System.out.print("Ingresa ALTURA: ");
				        ALTURA = in.nextDouble();
				        
				        in.nextLine();
				        AREA=2*3.141*RADIO*(RADIO+ALTURA);
				        System.out.println("AREA: " + AREA);
				        VOLUMEN=(3.141*(RADIO)*2)*ALTURA;
				        System.out.println("VOLUMEN: " + VOLUMEN);
				        
	}
		}
}

