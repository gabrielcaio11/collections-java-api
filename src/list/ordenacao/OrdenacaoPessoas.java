package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoas() {
		pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome,idade,altura));
	}
	public List<Pessoa> ordenaPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenaPorAltura() {
		
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorAltura,new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	public static void main(String[] args) {
		OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
		ordenacaoPessoa.adicionarPessoa("gabriel", 21, 1.81);
		ordenacaoPessoa.adicionarPessoa("caio", 21, 1.81);
		ordenacaoPessoa.adicionarPessoa("gabriel caio", 21, 1.8);
		ordenacaoPessoa.adicionarPessoa("gabriel 1", 28, 1.90);
		ordenacaoPessoa.adicionarPessoa("gabriel 2", 23, 1.63);
		
		System.out.println(ordenacaoPessoa.pessoaList);
		System.out.println(ordenacaoPessoa.ordenaPorAltura());
		System.out.println(ordenacaoPessoa.ordenaPorIdade());
	}

}
