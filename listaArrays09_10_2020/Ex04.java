package listaArrays09_10_2020;

import java.util.Scanner;

public class Ex04 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
	
		float[][] matriz = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int opcao,x=0,y=0;
		
	//***********	 MATRIZ 1  **********
		for(x=0;x<2;x++)
		{
			for(y=0; y<2;y++)
			{
				System.out.println("Insira valor para M1: ");
				matriz[x][y] = ler.nextFloat();
							
			}
		}
		
		
		//***********	 MATRIZ 2  **********	
		
		for(x=0;x<2;x++)
		{
			for(y=0; y<2;y++)
			{
				System.out.println("Insira valor para M2: ");
				matriz2[x][y] = ler.nextFloat();
				
						
			}
		}		
		//*********************RESULTS
		
		System.out.println("Escolha uma opção: 1,2, ou 3, sendo respc. somar, sub ou Adc uma cte a cada matz");
		opcao= ler.nextInt();
		
		if(opcao==1 ||opcao==2 ||opcao==3)
		{
			if(opcao==1)
			{
				
				
				
				
				for(x=0;x<2;x++)
				{
					for(y=0; y<2;y++)
					{
						System.out.println("Matriz 3: ");
										
				
				
				
				
				
				
				matriz3[x][y] = matriz[x][y] + matriz2[x][y];
				System.out.println(matriz3[x][y]);
				
				
					}
				}
				
				
				
				
				
				
				
				
			}
		}
		
	}
}

