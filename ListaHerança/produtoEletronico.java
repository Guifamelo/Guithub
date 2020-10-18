package listaPOO;

public class produtoEletronico {
	private int atrMemoriaRam; 
	private int atrHd;
	private String atrProcessador;
	private String atrPlacadeVideo;
	
	public produtoEletronico (int paraMemoriaRam, int paraHd, String paraProcessador, String paraPlacadeVideo)
	{
		this.atrMemoriaRam = paraMemoriaRam;
		this.atrHd = paraHd;
		this.atrProcessador = paraProcessador;
		this.atrPlacadeVideo = paraPlacadeVideo;
		
				
	}
	
	public void mostraTela() {
		System.out.println("Seu Pc tem: "+getAtrMemoriaRam()+" de RAM\n"+getAtrHd()+" de HD\nProcessador é:"+getAtrProcessador()+"\nE a placa de vídeo é: "+getAtrPlacadeVideo());
		
	
	}

	public int getAtrMemoriaRam() {
		return atrMemoriaRam;
	}

	public void setAtrMemoriaRam(int atrMemoriaRam) {
		this.atrMemoriaRam = atrMemoriaRam;
	}

	public int getAtrHd() {
		return atrHd;
	}

	public void setAtrHd(int atrHd) {
		this.atrHd = atrHd;
	}

	public String getAtrProcessador() {
		return atrProcessador;
	}

	public void setAtrProcessador(String atrProcessador) {
		this.atrProcessador = atrProcessador;
	}

	public String getAtrPlacadeVideo() {
		return atrPlacadeVideo;
	}

	public void setAtrPlacadeVideo(String atrPlacadeVideo) {
		this.atrPlacadeVideo = atrPlacadeVideo;
	}

}
