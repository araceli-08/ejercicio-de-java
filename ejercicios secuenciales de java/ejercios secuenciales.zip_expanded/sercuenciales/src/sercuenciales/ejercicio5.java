package sercuenciales;

import java.util.Scanner;

public class ejercicio5 {

	public ejercicio5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try (// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in)) {
					double capacidadGB,capacidadMB,capacidadKB , capacidadB;
			        System.out.print("Ingresa capacidad GB: ");
			        capacidadGB = in.nextDouble();
			        
			        in.nextLine();
			        capacidadMB=capacidadGB*1024;
			        System.out.println("CAPACIDA MB: " + capacidadMB);
			        capacidadKB=capacidadMB*1024;
			        System.out.println("CAPACIDA KB: " + capacidadKB);
			        capacidadB=capacidadKB*1024;
			        System.out.println("CAPACIDA B: " + capacidadB);
			      
			}

		}
		}

