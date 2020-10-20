package animais;

public class animal {
//Atributos
	private String nome;
	private int idade;
	private String onomatopeia;
	private String acao;
//Construtor
	public animal(String nome, int idade, String onomatopeia, String acao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.onomatopeia = onomatopeia;
		this.acao = acao;
	}
//Métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getOnomatopeia() {
		return onomatopeia;
	}
	public void setOnomatopeia(String onomatopeia) {
		this.onomatopeia = onomatopeia;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public void iniciaAnimal(){
		System.out.println("O animal se chama: "+this.getNome()+", tem "+this.getIdade()+" anos, faz: "+this.getOnomatopeia()+" e ele "+this.getAcao());
	//	System.out.println("AUAU");
	}
	public void iniciaSom() {
		System.out.println("EMITE O SOM: "+this.getOnomatopeia());
	}
	
}
