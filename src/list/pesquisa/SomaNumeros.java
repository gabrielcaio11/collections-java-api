package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	List<Integer> intList;

	public SomaNumeros() {
		this.intList = new ArrayList<>();
	}

	public List<Integer> getIntList() {
		return intList;
	}

	@Override
	public String toString() {
		return "SomaNumeros [intList=" + intList + "]";
	}
	public void adicionarNumero(int numero) {
		intList.add(numero);
	}
	public int calcularSoma() {
		int soma = 0;
		for(int i : intList) {
			soma+=i;
		}
		return soma;
	}
	public int encontrarMaiorNumero() {
		int maiorNum = intList.get(0);
		for(int i : intList) {
			if(maiorNum<i) {
				maiorNum = i;
			}
		}
		return maiorNum;
	}
	public void exibirNumeros() {
		System.out.println(intList);
	}
	public static void main(String[] args) {
	    SomaNumeros somaNumeros = new SomaNumeros();
	    somaNumeros.adicionarNumero(5);
	    somaNumeros.adicionarNumero(10);
	    somaNumeros.adicionarNumero(15);
	    
	    System.out.println("Números: " );
	    somaNumeros.exibirNumeros();
	    System.out.println("Soma: " + somaNumeros.calcularSoma());
	    System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
	}
}
