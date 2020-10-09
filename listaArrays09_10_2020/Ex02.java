package listaArrays09_10_2020;

import java.util.Scanner;

public class Ex02 {
	public static void main(String args[])
	{
		
	Scanner ler = new Scanner (System.in);
	
	int[] vetor = new int[6];
	int x=0 , somap=0 , contp=0 , conti=0,a=0;
	
	for(x=0;x<6;x++)
	{
		
	System.out.println("Insira valor: ");
	vetor[a]= ler.nextInt();
		
	
	
	if(a%2==0)
	{
		contp++;
		somap=somap+a;
		
	}
	else
	{
		conti++;
	}
	
	
	
	}
	   	System.out.println("Soma dos numeros pares: "+somap);
		System.out.println("Qtde numeros ímpares: "+conti);
			
	
	}
	
}
