package listaPOO;

public class empregado extends pessoa {
//Atributos
	private int codSetor;
	private double salarioBase;
	private double imposto;
	
//Construtor
	public empregado (String paranome,String paraendereco, String paracpf, int paraidade, int paratelefone, int codSetor, double salarioBase, double imposto)
	{
		super(paranome, paraendereco, paracpf, paraidade, paratelefone);
		this.codSetor = codSetor;
		this.imposto = imposto;
		this.salarioBase = salarioBase;
	}
// Metodos

	public int getCodSetor() {
		return codSetor;
	}

	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public void calcularSalario() {
		System.out.println(this.getAtrnome()+" do setor "+this.codSetor+" tem salário base de: R$"+this.salarioBase+" com imposto de "+this.imposto+"%");
		System.out.println("Portanto, "+this.getAtrnome()+" receberá no final do mes total de: R$"+(this.salarioBase - (this.salarioBase*this.imposto/100))+".");
	} 
	
}
