package listaPOO;

public class objetoFornecedor {
	public static void main(String args[]) 
	{
	fornecedor fornecedor01 = new fornecedor ("Felps", "Av. Santo Amaro", "246235464-1000",25,941030905,1000,4000);
	fornecedor fornecedor02 = new fornecedor ("Athos", "Diadema", "315623546-1000",25,941030905,2000,10);
	
	fornecedor01.imprimirFornecedor();
	fornecedor01.obterSaldo();
	
	fornecedor02.imprimirFornecedor();
	fornecedor02.obterSaldo();
	
	}
}
