package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		estoqueProdutosMap = new HashMap<>();
	}

	public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {

		estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
	}

	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}

	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getPreco() * p.getQuantidade();
			}
		}
		return valorTotalEstoque;
	}
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double valorProdutoMaisCaro = Double.MIN_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() > valorProdutoMaisCaro) {
					valorProdutoMaisCaro = p.getPreco();
					produtoMaisCaro = p;
				}
				
			}
		}
		return produtoMaisCaro;
		
	}
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double valorProdutoMaisBarato = Double.MAX_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() < valorProdutoMaisBarato) {
					valorProdutoMaisBarato = p.getPreco();
					produtoMaisBarato = p;
				}
				
			}
		}
		return produtoMaisBarato;
		
	}
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorValorTotal = null;
		double maiorValorProduto = Double.MIN_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() * p.getQuantidade() > maiorValorProduto) {
					maiorValorProduto = p.getPreco() * p.getQuantidade();
					produtoMaiorValorTotal = p;
				}
				
			}
		}
		return produtoMaiorValorTotal;
		
	}
	
	public static void main(String[] args) {
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		estoqueProdutos.adicionarProduto(1l, "laranja", 50, 8.6);
		estoqueProdutos.adicionarProduto(5l, "polidor", 560, 4.6);
		estoqueProdutos.adicionarProduto(6l, "maca", 50, 8.6);
		estoqueProdutos.adicionarProduto(3l, "uva", 450, 12.0);
		estoqueProdutos.adicionarProduto(2l, "mamao", 80, 8.6);
		estoqueProdutos.exibirProdutos();
		
		System.out.println("valor total do estoque: " + estoqueProdutos.calcularValorTotalEstoque());
		System.out.println("produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
		
		System.out.println("produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
		System.out.println("produto com maior valor (preco * quantidade) no estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
	}
}
