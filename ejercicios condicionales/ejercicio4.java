package condicionales;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try (Scanner in = new Scanner(System.in);
				Scanner in1 = new Scanner(System.in)) {
		        double cuota, descuento, dia_de_pago, importe_total_a_pagar, recargo;
		        System.out.print("Ingresa el valor de cuota: ");
		        cuota = in1.nextDouble();
		        in1.nextLine();
		        System.out.print("Ingresa el valor de dia de pago: ");
		        dia_de_pago = in1.nextDouble();
		        in1.nextLine();
		        descuento=0;
		        recargo=0;
		        if(dia_de_pago<=10)
		            descuento=cuota*0.02;
		        if(dia_de_pago<=10&&descuento<5)
		            descuento=5;
		        if(dia_de_pago>20)
		            recargo=cuota*0.03;
		        if(dia_de_pago>20&&recargo<10)
		            recargo=10;
		        importe_total_a_pagar=cuota-descuento+recargo;
		        System.out.println("Valor de descuento: " + descuento);
		        System.out.println("Valor de importe total a pagar: " + importe_total_a_pagar);
		        System.out.println("Valor de recargo: " + recargo);
		    }

		}
}

