package sercuenciales;

import java.util.Scanner;

public class ejercicio2 {

	public ejercicio2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			double centimetros, metros, pies, pulgadas, yarda;
	        System.out.print("Ingresa el valor de metros: ");
	        metros = in.nextDouble();
	        
	        in.nextLine();
	        centimetros=metros*100;
	        System.out.println("Valor de centimetros: " + centimetros);
	        pulgadas=centimetros/2.54;
	        System.out.println("Valor de pulgadas: " + pulgadas);
	        pies=pulgadas/12;
	        System.out.println("Valor de pies: " + pies);
	        yarda=pies/3; 
	        System.out.println("Valor de yarda: " + yarda);
       
		}
		
	}
	
}
