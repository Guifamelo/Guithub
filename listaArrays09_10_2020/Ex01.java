package listaArrays09_10_2020;

import java.util.Scanner;

public class Ex01 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int[] vetor= {1,0,5,-2,-5,7};
		int soma = 0,x,soma2=0, soma3=0, soma4=0;
		
		for(x=0;x<6;x++)
		{	
		soma=vetor[x];
		soma2=soma2+soma;
		}
		
		soma3=vetor[0]+vetor[1]+vetor[5];
				
		System.out.println("A soma é : " +soma2);
		System.out.println("V0+V1+V5= " +soma3);
		
		
		System.out.println("Agora V4 tem valor = 100");
		vetor[4]=100;
		
	
		System.out.println(vetor);
		for(int i : vetor)
		{
			
		
		System.out.println(i);
		}
	}

}
