package listaPOO;

public class objetoProdutoEletronico {
	public static void main(String args[])
	{
		produtoEletronico notebook = new produtoEletronico(8,500,"i7","GForce920M");
		produtoEletronico computadorErick = new produtoEletronico(32,1000,"i7","GForceGTX1050");
		produtoEletronico computadordoJapa = new produtoEletronico(16,10000,"Raisen5","AMDRX550");
		produtoEletronico computadordoRubens = new produtoEletronico(12,12000,"i7","PL");
		
		
		
		
		notebook.mostraTela();
		computadorErick.mostraTela();
		computadordoJapa.mostraTela();
	}
		
}
