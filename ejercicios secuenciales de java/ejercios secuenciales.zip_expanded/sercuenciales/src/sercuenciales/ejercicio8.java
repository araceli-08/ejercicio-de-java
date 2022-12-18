package sercuenciales;

import java.util.Scanner;

public class ejercicio8 {

	public ejercicio8() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try (// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in)) {
					double RADIO,AREABASE,AREALATERAL ,AREATOTAL, ALTURA;
			        System.out.print("Ingresa EL RADIO : ");
			        RADIO = in.nextDouble();
			        System.out.print("Ingresa ALTURA: ");
			        ALTURA = in.nextDouble();
			        
			        in.nextLine();
			        AREABASE=3.141*(RADIO)*2 ;
			        System.out.println("AREA DELA BASE : " + AREABASE);
			        AREALATERAL=2*3.141*RADIO*ALTURA;
			        System.out.println("LA AREA LATERAL : " + AREALATERAL);
			        AREATOTAL=(2*(3.141*(RADIO)*2))*(2*3.141*RADIO*ALTURA);
			        System.out.println("EL AREA TOTAL : " + AREATOTAL);
}
	}
}
