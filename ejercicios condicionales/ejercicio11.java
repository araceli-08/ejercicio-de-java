/**
 * 
 */
package condicionales;

import java.util.Scanner;

/**
 * @author Jhon
 *
 */
public class ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try (Scanner in = new Scanner(System.in);
				Scanner in1 = new Scanner(System.in)) {
		double nota_de_fisica, nota_de_historia, nota_de_matematica, propina;
        System.out.print("Ingresa el valor de nota de fisica: ");
        nota_de_fisica = in1.nextDouble();
        in1.nextLine();
        System.out.print("Ingresa el valor de nota de historia: ");
        nota_de_historia = in1.nextDouble();
        in1.nextLine();
        System.out.print("Ingresa el valor de nota de matematica: ");
        nota_de_matematica = in1.nextDouble();
        in1.nextLine();
        propina=0;
        if(nota_de_matematica>=17)
            propina=propina+nota_de_matematica*3;
        else
            propina=propina+nota_de_matematica;
        if(nota_de_fisica>=15)
            propina=propina+nota_de_fisica*2;
        else
            propina=propina+nota_de_fisica*0.5;
        if(nota_de_historia>=15)
            propina=propina+nota_de_historia*1.5;
        else
            propina=propina+nota_de_historia*0.3;
        System.out.println("Valor de propina: " + propina);
    }

}
	}


