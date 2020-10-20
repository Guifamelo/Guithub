package collections;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class mapaAluno {
	public static void main(String args[]) {
		Map<String,aluno> mapa = new TreeMap<String,aluno>();
		
		aluno a = new aluno ("Gui","Eng Elétrica",7.5);
		aluno b = new aluno ("Guga","TI",8.0);
		aluno c = new aluno ("Arthur","Dev Games",9.0);
		aluno d = new aluno ("Jun","Geo",7.5);
		mapa.put("chave", a);
		mapa.put("Guga", b);
		mapa.put("chave2", c);
		mapa.put("Jun", d);
		
		
		System.out.println(mapa);
		System.out.println(mapa.get("chave2"));
		
		
		Collection<aluno> alunos = mapa.values();
		for(aluno x:alunos) {
			System.out.println(x);
		}
		
	}
}
