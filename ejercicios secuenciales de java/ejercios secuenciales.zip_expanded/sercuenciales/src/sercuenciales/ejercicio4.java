package sercuenciales;

import java.util.Scanner;

public class ejercicio4 {

	public ejercicio4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			double pies,pulgadas,tpies,tpulgadas,totalcm,totalm;
	        System.out.print("Ingrese la cantidad de pies : ");
	        pies = in.nextDouble();
	        System.out.print("Ingrese el cantida de pulgadas  : ");
	        pulgadas = in.nextDouble();
	       
	        in.nextLine();
	        
	
	        tpies=pies*30.48;
	        tpulgadas=pulgadas*2.54;
	        totalcm=tpies+tpulgadas;
	        totalm=totalcm/100; 
	        System.out.println("total de talla en metros: " +totalm);
		}
		}
}
