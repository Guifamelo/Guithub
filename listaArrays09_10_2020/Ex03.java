package listaArrays09_10_2020;

import java.util.Scanner;

public class Ex03 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int[][] matriz = new int[3][3];
		int somaiorq10=0, contmaiorq=0,somatudo=0;
		
		for(int x=0;x<3;x++)
		{
			for(int y=0; y<3;y++)
			{
				System.out.println("Insira valor: ");
				matriz[x][y] = ler.nextInt();
				
				if(matriz[x][y]>10)
				{
					contmaiorq++;
					
					somaiorq10=somaiorq10+matriz[x][y];
					
				}
				somatudo=somatudo+matriz[x][y];
			}
		}
		
		System.out.printf("QTDE Números >10: %d e a soma deles é: %d ",contmaiorq,somaiorq10);
		System.out.printf("\nA soma de tudo é: %d ",somatudo);
	}	
}
