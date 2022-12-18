package sercuenciales;

import java.util.Scanner;

public class ejercicio18 {

	public ejercicio18() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			double cantidad_de_propruductos,precioUNITARIO,importe_compra ,primer_descuento,segundo_descuento,importe_a_pagar;
	        System.out.print("INGRESAR LA CANTIDAD DE UNIDADES ADQUERIDAS: ");
	        cantidad_de_propruductos= in.nextDouble();
	        System.out.print("Ingresa el PRECIO DEL ARTICULO : ");
	        precioUNITARIO= in.nextDouble();
	        
	        in.nextLine();
	        importe_compra=precioUNITARIO*cantidad_de_propruductos ;
	        System.out.println("el IMPORTE DE COMPRA: " + importe_compra );
	        primer_descuento=importe_compra*0.15;	
	        System.out.println("el PRIMER DECUENTO: " + primer_descuento );
	        segundo_descuento=(importe_compra-primer_descuento)+0.15;	
	        System.out.println("SEGUNDO DESCUENTO: " + segundo_descuento );
	        importe_a_pagar= importe_compra-primer_descuento -segundo_descuento;
	        System.out.println("IMPORTE A PAGAR : " + importe_a_pagar  );

	}

	}
}
