package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome,preco,quantidade));
	}
	public void removerItem(String nome) {
		// caso tiver mais de uma descricao igual, so removerar a primeira
		List<Item> itemsParaRemover = new ArrayList<>();
		for (Item i : itemList) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				itemsParaRemover.add(i);
			}
		}
		itemList.removeAll(itemsParaRemover);

	}
	public double calcularValorTotal() {
		double soma = 0;
		for (Item i : itemList) {
			soma += i.getQuantidade() * i.getPreco();
		}
		return soma;
	}
	public void exibirItems() {
		System.out.println(itemList);
	}
	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adicionarItem("notebook 1",3000.0,2);
		carrinhoDeCompras.adicionarItem("notebook 1",3000.0,3);
		carrinhoDeCompras.adicionarItem("notebook 1",3000.0,4);
		carrinhoDeCompras.adicionarItem("notebook 2",3000.0,2);
		carrinhoDeCompras.adicionarItem("notebook 3",3000.0,2);
		
		carrinhoDeCompras.exibirItems();
		System.out.println("valor total: " + carrinhoDeCompras.calcularValorTotal());
		carrinhoDeCompras.removerItem("notebook 1");
		System.out.println("valor total: " + carrinhoDeCompras.calcularValorTotal());

	}
}
