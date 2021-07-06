package Anayr;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int valor,contpar=0,contimpar=0;
	       
	       byte x;
		
	       
		  Scanner leia = new Scanner(System.in);

	      for(x=1;x<=10;x++)
	{
		System.out.println("\nEntre com um valor: ");
		valor = leia.nextInt();
		
		if(valor%2==0)
		{
			contpar++;
		}
		else
		{
			contimpar++;
		}
	}
	      System.out.println("\nQuantidade de números pares: "+contpar);
	      System.out.println("\nQuantidade de números ímpares: "+contimpar);
	}

}
