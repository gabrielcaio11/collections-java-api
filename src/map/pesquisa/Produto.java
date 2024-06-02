package map.pesquisa;

public class Produto {
	
	private String nome;
	private long quantidade;
	private double preco;
	public Produto(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public long getQuantidade() {
		return quantidade;
	}
	public double getPreco() {
		return preco;
	}
	@Override
	public String toString() {
		return "{ Produto \nNome: " + nome + "\nQuantidade: " + quantidade + "\nPreco: " + preco + "}\n\n";
	}
	
	
	
}
