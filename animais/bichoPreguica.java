package animais;

public class bichoPreguica  extends animal{
	//Atributos
	//-------------------//
//Construtor
	public bichoPreguica (String nome,int idade, String onomatopeia,String acao) {
		super(nome, idade, onomatopeia, acao);
	}
//Métodos
/*		public void iniciaCachorro(){
		System.out.println("O animal se chama: "+super.getNome()+", tem "+super.getIdade()+" anos, faz: "+super.getOnomatopeia()+" e ele "+super.getAcao());
		System.out.println("AUAU");
	} */
	@Override
	public void iniciaAnimal() {
	System.out.println("Sobe nas árvores por aí.");
	}
	@Override
	public void iniciaSom() {
		System.out.println("Urrrgh");
	}

}
