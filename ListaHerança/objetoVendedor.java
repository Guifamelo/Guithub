package listaPOO;

public class objetoVendedor {
	public static void main(String args[]) {
		
		vendedor guilherme = new vendedor("Guilherme", "Av Angentina", "123251911", 36, 941030905, 500,10);
		vendedor rubens = new vendedor ("Rubens","Av Peru", "35812345678", 35, 970707070, 1000,15 );
		
		guilherme.imprimirDadosVendedor();
		rubens.imprimirDadosVendedor();
				
		guilherme.vendaProduto();		
	}

}
