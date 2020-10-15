package listaPOO;

public class Ex01ClienteObjeto {
	public static void main(String args[])
	{
		Ex01Cliente cliente01 = new Ex01Cliente("Guilherme ", "Faria ", " de Melo");
		System.out.println(cliente01.getnomeCompleto());
	}

}
