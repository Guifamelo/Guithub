package collections;

import java.util.Scanner;

public class tryCatch {
	public static void main(String args[]) {
	String  frase = null;
	String novaFrase = null;
	
	try {
		novaFrase= frase.toUpperCase();
	}
	catch (NullPointerException x) {
		System.out.println("A frase inicial é nula! ");
	}
	System.out.println("insira frase");
	Scanner ler = new Scanner (System.in);
	frase = ler.nextLine();
	System.out.println("frase inicial "+frase);
	novaFrase= frase.toUpperCase();
	System.out.println("frase final: "+novaFrase);
		
	}
}
