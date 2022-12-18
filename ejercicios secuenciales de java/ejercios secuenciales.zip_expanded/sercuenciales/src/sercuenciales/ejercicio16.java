package sercuenciales;

import java.util.Scanner;

public class ejercicio16 {

	public ejercicio16() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			double horasTrab,tarifaHor,sueldoBas ,montoBoni,sueldoBru,montoDesc,sueldoNet ;
	        System.out.print("horas de trabajo : ");
	        horasTrab= in.nextDouble();
	        System.out.print("tarifa de  horas : ");
	        tarifaHor= in.nextDouble();
	        
	        in.nextLine();
	        sueldoBas=horasTrab*tarifaHor ;
	        System.out.println("el sueldo basico : " +sueldoBas  );
	        montoBoni= 0.20*sueldoBas;
	        sueldoBru=sueldoBas+montoBoni;
	        System.out.println("el sueldo bruto: " + sueldoBru );
	        montoDesc = 0.10*sueldoBru;
	        sueldoNet=sueldoBru-montoDesc;
	        System.out.println("el nsueldo neto : " + sueldoNet);

	}

}
}
