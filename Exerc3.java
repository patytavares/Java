package Anayr;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int idade,menor=0, maior=0;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("/nEntre com a sua idade: ");
	idade = leia.nextInt();
	
	while (idade !=-99) {
	System.out.println("/nEntre com a sua idade: ");
	idade = leia.nextInt();
	
	if(idade<21)
	{
		menor++;
	}
	else if(idade>50)  {
		   maior++;
    }
	
	}
    
	System.out.println("\nNúmero de pesssoas com menos de 21 anos: " + menor);     
	System.out.println("\nNúmero de pesssoas com mais de 50 anos:: " + maior);     } }

	
	
		
	
	
	
	
			
			

	


