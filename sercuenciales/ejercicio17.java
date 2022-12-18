package sercuenciales;

import java.util.Scanner;

public class ejercicio17 {

	public ejercicio17() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try (// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in)) {
					double donacion,centrosalud,comedorinfantil ,escuelainfantil, asilo;
			        System.out.print("Ingresa el monto de donacion : ");
			        donacion = in.nextDouble();
			       
			        
			        in.nextLine();
			        centrosalud=donacion*0.25 ;
			        System.out.println("el sentro dee salud resivira s/: " + centrosalud);
			        comedorinfantil=donacion*0.35;
			        System.out.println("el comedor infantil recibe s/: " + comedorinfantil);
			        escuelainfantil=donacion*0.25;
			        System.out.println("la escuela infantil recibe s/: " + escuelainfantil);
			        asilo=donacion*0.15;
			        System.out.println("el asilo de ancianos recibe s/ : " + asilo );
	
	
	
}
}
}