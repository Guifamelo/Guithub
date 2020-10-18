package listaPOO;

import java.util.Scanner;

public class operario extends pessoa {
// Atributos	
	private double valorProducao;
	private double comissao;
//Construtor
	public operario (String paranome,String paraendereco, String paracpf, int paraidade, int paratelefone, double valorProducao, double comissao)
	{
		super (paranome, paraendereco, paracpf, paraidade, paratelefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
//Metodos
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public void vencimentoFimdoMes() {
		Scanner ler = new Scanner (System.in);
		int a;
		System.out.println("Quantas peças o "+this.getAtrnome()+" Produziu este mês?");
		a= ler.nextInt();
		System.out.println("Por ter produzido "+a+ " peça(s), "+ this.getAtrnome()+ " receberá no final do mês: R$"+(this.getValorProducao()+(a*this.getComissao()/100)*this.getValorProducao()));
		
	}
}
