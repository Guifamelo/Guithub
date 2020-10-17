package listaPOO;

public class pessoa {
	private String atrnome;
	private String atrendereco;
	private String atrcpf;
	private int atridade;
	private int atrtelefone;
	
	
	public pessoa(String paranome, String paraendereco,String paracpf,int paraidade, int paratelefone)
	{
		super();
		
		this.atrnome = paranome;
		this.atrendereco = paraendereco;
		this.atrcpf = paracpf;		
		this.atridade = paraidade;
		this.atrtelefone = paratelefone;
		
		
		
	}


	public String getAtrnome() {
		return atrnome;
	}


	public void setAtrnome(String atrnome) {
		this.atrnome = atrnome;
	}


	public String getAtrendereco() {
		return atrendereco;
	}


	public void setAtrendereco(String atrendereco) {
		this.atrendereco = atrendereco;
	}


	public String getAtrcpf() {
		return atrcpf;
	}


	public void setAtrcpf(String atrcpf) {
		this.atrcpf = atrcpf;
	}
	
	public void verificacpf()
	{
		if(getAtrcpf().length()!= 11)
		{
			System.out.println("CPF INVALIDO!");
		}
		else
		{
			
		}
		
		
	}
	


	public int getAtridade() {
		return atridade;
	}


	public void setAtridade(int atridade) {
		this.atridade = atridade;
	}


	public int getAtrtelefone() {
		return atrtelefone;
	}


	public void setAtrtelefone(int atrtelefone) {
		this.atrtelefone = atrtelefone;
	}


}
