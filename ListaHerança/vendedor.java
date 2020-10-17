package listaPOO;

import java.util.Scanner;

public class vendedor extends pessoa {
	private double valorVenda;
	private double comissao;
	
	public vendedor (String paranome, String paraendereco, String paracpf, int paraidade, int paratelefone, double paravalorVenda, double paracomissao) 
	{
		super(paranome, paraendereco, paracpf, paraidade, paratelefone);
		this.valorVenda = paravalorVenda;
		this.comissao = paracomissao;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public void imprimirDadosVendedor()
	{
		System.out.println("O vendedor: "+super.getAtrnome()+" ele vendeu: R$"+this.getValorVenda()+" e terá comissão de: "+this.getComissao()+" deste valor");
	}
	
	public void vendaProduto()
	{
		Scanner ler = new Scanner (System.in);
		int a;
		
		System.out.println("Insira valor do produto: ");
		a = ler.nextInt();
		
	}
	
}
