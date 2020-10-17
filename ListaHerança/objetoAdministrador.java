package listaPOO;

public class objetoAdministrador {
	public static void main(String args [])
	{
		administrador guilherme = new administrador("Guilherme", "Av Brasil", "123251911", 26, 941030905, 500);
		administrador rubens = new administrador("Rubens", "Av Jamaica", "35632365832", 25, 976523256, 5000);
		
		
		guilherme.imprimirDados();
	
		guilherme.setAtrendereco("Av Colombia");
		
		guilherme.imprimirDados();
		
		rubens.imprimirDados();
		
	
	}
	
}
