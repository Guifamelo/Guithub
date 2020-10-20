package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class colecoes {

	public static void main(String args[]) {
		Collection<String> nomes = new ArrayList();
		nomes.add("Arthur");
		nomes.add("Catarina");
		nomes.add("Guga");
		nomes.add("Gui");
		nomes.add("Jun");
		nomes.add("Murilo");
		
	/*	for(String names : nomes) {
			System.out.println("Lista de presença: "+names);
		} */
	/*	Collection<String> nomes2 = Arrays.asList("Kauê","Matheus");
		nomes.addAll(nomes2);
		System.out.println("Lista de presença: "+nomes); */
	/*	System.out.println("Contem o nome Arthur? "+nomes.contains("Arthur"));
		if(nomes.contains("Arthur")==true) {
			System.out.println("PRESENTE PROF!");
		} */
		
	/*	System.out.println("Lista de presença: "+nomes);
		nomes.remove("Catarina");
		System.out.println("Lista de presença: "+nomes);
		nomes.clear();
		System.out.println("Lista de presença: "+nomes); */
/*	if(nomes.isEmpty()) {
		System.out.println("Lista de presença vazia.");
	}
	else {		
		System.out.println("Lista de presença: "+nomes);
	} */
		
	}
}
