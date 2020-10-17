package listaPOO;

public class administrador extends pessoa {
	private double atrAjudaDeCusto;
	
	public administrador(String paranome, String paraendereco, String paracpf, int paraidade, int paratelefone, double paraajudadecusto) 
	{
		super(paranome, paraendereco, paracpf, paraidade, paratelefone);
		// TODO Auto-generated constructor stub

		this.atrAjudaDeCusto = paraajudadecusto;
	}
	
	
	public void imprimirDados() {
		System.out.println("Nome: "+ super.getAtrnome() +"Idade: "+super.getAtridade()+" Mora em: "+super.getAtrendereco()+" CPF: "+super.getAtrcpf()+" Telefone: "+super.getAtrtelefone()+"Recebe bolsa de :"+this.getAtrAjudaDeCusto());
	}

	public double getAtrAjudaDeCusto() {
		return atrAjudaDeCusto;
	}

	public void setAtrAjudaDeCusto(double atrAjudaDeCusto) {
		this.atrAjudaDeCusto = atrAjudaDeCusto;
	}
	
}
