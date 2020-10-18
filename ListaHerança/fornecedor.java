package listaPOO;

import java.util.Scanner;

public class fornecedor extends pessoa {
//ATRIBUTOS
	private double valorCredito;	//(correspondente ao créditomáximo atribuído ao fornecedor)
	private double valorDivida; //(montante da dívida para com o fornecedor).
//CONSTRUTOR
	public fornecedor (String paranome, String paraendereco, String paracnpj,int paraidade, int paratelefone, double valorCredito, double valorDivida)
	{
		super(paranome, paraendereco, paracnpj, paraidade, paratelefone);		
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;				
	}
//METODOS
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public void imprimirFornecedor()
	{
		System.out.println("Dados do fornecedor:");
		System.out.println("Fornecedor: "+super.getAtrnome()+" está localizado em:"+super.getAtrendereco());
		System.out.println("Nós temos R$"+this.getValorCredito()+" de crédito e devemos à ele: R$"+this.getValorDivida());
		
	}
	public void obterSaldo() //Diferença entre valorCredito e valorDivida
	{
		Scanner ler = new Scanner (System.in);
			
		System.out.println("Portanto o saldo total é de: R$"+(this.getValorCredito()-this.getValorDivida()));	
		System.out.println("Qual seu nv credito?");
		valorCredito = ler.nextDouble();
	
		System.out.println("Portanto o saldo total com o "+ this.getAtrnome() +"  é de: R$"+(this.getValorCredito()-this.getValorDivida())+"\n");
		
	}
	
}
