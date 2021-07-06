package laçosderepetição;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class laçsosososososos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=0,med=0,mult=0,soma=0;
	Scanner leia= new Scanner (System.in);
			
		do {
			System.out.println("Escreva um numero:");
			n=leia.nextInt();
			
			if(n % 3==0) { 
				
				soma=soma+n;
				
				mult++;
				System.out.println("Esse é o numero:"+n);
				
			}
									
			}while(n!=0);			
		
		med=soma/mult;
		
		
		System.out.println("A media dos numeros digitados multiplos de 3 é:"+med);
		System.out.println("Quantidades de numeros multiplos: "+mult);
	
	}
	
	

}
