package sercuenciales;

	import java.util.Scanner;
	public class porcentajemujereshombres {

		 public static void main(String[] args) {
			// TODO Auto-generated method stub
				try (// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in)) {		       
		        double numtotal,numhombres,nummujeres,porcmujeres,porchombres;
		       
		        System.out.println("Ingrese el numero de hombres");
		        numhombres=in.nextInt();
		   
		        System.out.println("Ingrese el numero de mujeres");
		        nummujeres=in.nextInt();
		       
		      
		        numtotal=numhombres+nummujeres;
		       
		        porchombres=(100*numhombres)/numtotal;
		        porcmujeres=(100*nummujeres)/numtotal;
		       
		       
		       
		        System.out.println("El total de hombres y mujeres son : "+numtotal);
		        System.out.println(""+porchombres+"% de hombres");
		        System.out.println(""+porcmujeres+"% de mujeres");

		    }
		   

		}
	}


