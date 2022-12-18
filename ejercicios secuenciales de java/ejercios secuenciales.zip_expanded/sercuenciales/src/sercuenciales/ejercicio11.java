package sercuenciales;

import java.util.Scanner;

public class ejercicio11 {

	public ejercicio11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			double numero1,numero2,numero1_c1 ,numero1_c2,numero1_c3,numero2_c1,numero2_c2,numero2_c3;
	        System.out.print("Ingresa el NUMERO 1 : ");
	        numero1= in.nextDouble();
	        System.out.print("Ingresa el NUMERO 2 : ");
	        numero2= in.nextDouble();
	        
	        in.nextLine();
	        numero1_c1=numero1/100 ;
	        numero1_c2=numero1%100/10;		       
	        numero1_c3=numero1%10;
	        
	        numero2_c1=numero2/100 ;
	        numero2_c2=numero2%100/10;		       
	        numero2_c3=numero2%10;	
	        

	        numero1=(numero2_c3*100)+(numero1_c2*10)+(numero2_c1);
	        numero2=(numero1_c3*100)+(numero2_c2*10)+(numero1_c1);
	        System.out.println("el numero intercambiado 2 : " + numero1 );
	        System.out.println("el numero intercambiado  1 : " + numero2 );

	}

}
}
