package sercuenciales;

import java.util.Scanner;

public class ejercicio15 {

	public ejercicio15() {
		// TODO Auto-generated constructor stub
	try (// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in)) {
		double dineroJUAN,dineroROSA,dineroDANIEL,dolaresDANIEL,capitalTOTAL,porcentajeJUAN,porcentajeROSA,porcentajeDANIEL;
        System.out.print("DINERO DE JUAN : ");
        dineroJUAN= in.nextDouble();
        System.out.print("DINERO DE ROSA : ");
        dineroROSA= in.nextDouble();
        System.out.print("DINERO DE DANIEL EN SOLES: ");
        dineroDANIEL = in.nextDouble();
        
        in.nextLine();
        dolaresDANIEL=dineroDANIEL/3 ;
        
        capitalTOTAL=dineroJUAN+dineroROSA+dolaresDANIEL;	
        System.out.println("LA CAPITAL TOTAL  : " + capitalTOTAL );

        porcentajeJUAN=(dineroJUAN*100)/capitalTOTAL;
        System.out.println("el PORCENTAJE DE JUAN : " + porcentajeJUAN );

        porcentajeROSA=(dineroROSA*100)/capitalTOTAL;
        System.out.println("el PORCENTAJE DE ROSA : " +  porcentajeROSA);

        porcentajeDANIEL=(dolaresDANIEL*100)/capitalTOTAL;
        System.out.println("el PORSENTAJE DE DANIEL : " + porcentajeDANIEL );

}
}
}