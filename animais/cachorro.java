package animais;

public class cachorro extends animal{
//Atributos
	//-------------------//
//Construtor
	public cachorro (String nome,int idade, String onomatopeia,String acao) {
		super(nome, idade, onomatopeia, acao);
	}
//Métodos
/*		public void iniciaCachorro(){
		System.out.println("O animal se chama: "+super.getNome()+", tem "+super.getIdade()+" anos, faz: "+super.getOnomatopeia()+" e ele "+super.getAcao());
		System.out.println("AUAU");
	} */
	@Override
	public void iniciaAnimal() {
		System.out.println("Corre e mija por aí");
		}
	@Override
	public void iniciaSom() {
		System.out.println("AUAUAU");
		}
	
}

