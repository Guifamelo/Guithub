package listaPOO;

public class testePessoa {
	public static void mais(String args[])
	{
		pessoa guilherme = new pessoa("Guilherme", 1014);
		vendedor leonardo = new vendedor ("Leonardo", 1015, 1000, 10);
		administrador laurent = new administrador ("Laurent", 1016, 500);
		pessoa guigui = new vendedor("Guigui", 1017,1000, 10);
		pessoa guiga = new administrador ("Guiga", 1018,700);
		
		System.out.println(guilherme.getMatricula());
		System.out.println(leonardo.getComissao());
		System.out.println(laurent.getAjudaDeCusto());
		System.out.println(guigui.getMatricula());		
	}
}

