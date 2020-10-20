package collections;

import java.util.*;

public class listaAluno {
	public static void main(String args[]) {
		Set<aluno> conjunto = new HashSet<aluno>();
		aluno a = new aluno ("Gui","Eng Elétrica",7.5);
		aluno b = new aluno ("Guga","TI",8.0);
		aluno c = new aluno ("Arthur","Dev Games",9.0);
		aluno d = new aluno ("Jun","Geo",7.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		System.out.println(conjunto);
	
		
		
	}
}
