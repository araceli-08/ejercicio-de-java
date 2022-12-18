package condicionales;

import java.util.Scanner;

public class ejercicio9 {

	public ejercicio9() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in)) {
			double codigo, importe_a_pagar, importe_de_la_compra, importe_del_descuento, precio_unitario;
	        double unidades_adquiridas;
	        System.out.print("Ingresa el valor de codigo: ");
	        codigo = in.nextDouble();
	        in.nextLine();
	        System.out.print("Ingresa el valor de unidades adquiridas: ");
	        unidades_adquiridas = in.nextDouble();
	        in.nextLine();
	        importe_del_descuento=0;
	        precio_unitario=0;
	        if(codigo==101)
	            precio_unitario=17.5;
	        if(codigo==102)
	            precio_unitario=25.0;
	        if(codigo==103)
	            precio_unitario=15.5;
	        importe_de_la_compra=precio_unitario*unidades_adquiridas;
	        if(unidades_adquiridas>=1&&unidades_adquiridas<=10)
	            importe_del_descuento=importe_de_la_compra*0.05;
	        if(unidades_adquiridas>=11&&unidades_adquiridas<=20)
	            importe_del_descuento=importe_de_la_compra*0.075;
	        if(unidades_adquiridas>=21)
	            importe_del_descuento=importe_de_la_compra*0.1;
	        importe_a_pagar=importe_de_la_compra-importe_del_descuento;
	        System.out.println("Valor de importe a pagar: " + importe_a_pagar);
	        System.out.println("Valor de importe de la compra: " + importe_de_la_compra);
	        System.out.println("Valor de importe del descuento: " + importe_del_descuento);
	        System.out.println("Valor de precio unitario: " + precio_unitario);
		}
	}

}

