package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	public void adcionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		for (Convidado c : convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoSet.remove(c);
				break;
			}
		}
	}

	public int contarConvidados() {
		return convidadoSet.size();

	}

	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}

	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

		System.out.println("total de convidados: " + conjuntoConvidados.contarConvidados());
		
		conjuntoConvidados.adcionarConvidado("gabriel", 1);
		conjuntoConvidados.adcionarConvidado("gabriel", 1);
		conjuntoConvidados.adcionarConvidado("gabriel caio", 2);
		conjuntoConvidados.adcionarConvidado("caio", 3);
		System.out.println("total de convidados: " + conjuntoConvidados.contarConvidados());
		conjuntoConvidados.exibirConvidados();
		conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
		System.out.println("total de convidados: " + conjuntoConvidados.contarConvidados());
		conjuntoConvidados.exibirConvidados();
	}

}
