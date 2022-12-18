package sercuenciales;

import java.util.Scanner;

public class ejercicio3 {

	public ejercicio3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in)) {
					double segundotramo, primertramo , tercertramo,metros,pies,millas,yarda,totalmetros = 0;
			        System.out.print("Ingrese el primer tramo : ");
			        primertramo = in.nextDouble();
			        System.out.print("Ingrese el segundo  tramo : ");
			        segundotramo = in.nextDouble();
			        System.out.print("Ingrese el tercer tramo : ");
			        tercertramo = in.nextDouble();
			        in.nextLine();
			        
			
			        metros=primertramo*100.0;
			        pies=segundotramo/3.281;
			        millas=tercertramo*1609;
			        yarda=totalmetros*1094; 
			        System.out.println("Valor de yarda: " +yarda);
			        totalmetros=metros+pies+millas;
			        System.out.println("Valor toatal de metros: " +totalmetros);
	}
	}
}
