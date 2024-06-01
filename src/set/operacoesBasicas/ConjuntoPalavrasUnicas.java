package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<Palavra> palavraSet;

	public ConjuntoPalavrasUnicas() {
		palavraSet = new HashSet<>();
	}
	public void adcionarPalavra(String palavra) {
		palavraSet.add(new Palavra(palavra));
	}
	public void removerPalavra(String palavra) {
		for (Palavra p : palavraSet) {
			if (p.getPalavra()== palavra) {
				palavraSet.remove(p);
				break;
			}
		}
	}
	public boolean verificarPalavra(String palavra) {
		for (Palavra p : palavraSet) {
			if (p.getPalavra()== palavra) {
				
				return true;
			}
		}
		return false;
	}
	public void exibirPalavrasUnicas() {
		System.out.println(palavraSet);
	}
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
		
		
		conjuntoPalavrasUnicas.adcionarPalavra("gabriel");
		conjuntoPalavrasUnicas.adcionarPalavra("gabriel caio");
		conjuntoPalavrasUnicas.adcionarPalavra("gabriel");
		conjuntoPalavrasUnicas.adcionarPalavra("gabriel caio");
		
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
		
		conjuntoPalavrasUnicas.removerPalavra("gabriel caio");
		
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
	}
	
	
}
