package collections;

import java.util.*;

public class estoqueLoja {
	public static void main(String args[]) {
		Collection<String> estoque = new ArrayList();
		estoque.add("arroz");
		estoque.add("feij�o");
		estoque.add("macarr�o");
		estoque.add("leite");
		estoque.add("caf�");
		estoque.add("sal");
		estoque.add("a��car");
		
		System.out.println(estoque);
		Scanner ler = new Scanner (System.in);
		String adcProd, removeProd;
		System.out.println("Adicionar Produto: ");
		adcProd = ler.next().toLowerCase();
		estoque.add(adcProd);
		System.out.println("Remover Produto: ");		
		removeProd = ler.next().toLowerCase();
		estoque.remove(removeProd);
		System.out.println(estoque);
		
	}
}
