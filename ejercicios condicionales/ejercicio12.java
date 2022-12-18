package condicionales;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner in = new Scanner(System.in);
				Scanner in1 = new Scanner(System.in)) {
				
		   int edad, estado_civil, informacion, sexo;
	        System.out.print("Ingresa el valor de informacion: ");
	        informacion = in1.nextInt();
	        in1.nextLine();
	        estado_civil=(informacion%10000-informacion%1000)/1000;
	        if(estado_civil==1)
	            System.out.println("Soltero");
	        if(estado_civil==2)
	            System.out.println("Casado");
	        if(estado_civil==3)
	            System.out.println("Viudo");
	        if(estado_civil==4)
	            System.out.println("Divorciado");
	        edad=(informacion%1000-informacion%10)/10;
	        sexo=informacion%10;
	        if(sexo==1)
	            System.out.println("Femenino");
	        if(sexo==2)
	            System.out.println("Masculino");
	        System.out.println("Valor de edad: " + edad);
	        System.out.println("Valor de estado civil: " + estado_civil);
	        System.out.println("Valor de sexo: " + sexo);
	    }

	}
	}


