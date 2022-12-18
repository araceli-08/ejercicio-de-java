package sercuenciales;

import java.util.Scanner;

public class ejercicio10 {

	public ejercicio10() {
		// TODO Auto-generated constructor stub

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try (// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in)) {
					double numero,numeroA,numeroB ,numeroC,numeroD,numeroalrevez;
			        System.out.print("Ingresa el NUMERO : ");
			        numero= in.nextDouble();
			       
			        
			        in.nextLine();
			        numeroA=(numero%10) ;
			        numeroB=(numero%100/10);		       
			        numeroC=(numero%1000/100);		        
			        numeroD=(numero%10);
			        numeroalrevez=numeroA+(numeroB*10)+(numeroC*100)+(numeroD*1000);
			        System.out.println("el numero al revez es : " + numeroalrevez );
	
}
}
}