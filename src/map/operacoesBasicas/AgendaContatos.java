package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;


import set.pesquisa.Contato;

public class AgendaContatos {
	private Map<String, Integer> agendaContatosMap;

	public AgendaContatos() {
		agendaContatosMap = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		agendaContatosMap.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!agendaContatosMap.isEmpty()) {
			agendaContatosMap.remove(nome);
		}
	}

	public void exibirContatos() {
		System.out.println(agendaContatosMap);
	}
	public Integer pesquisarPorNome(String nome) {
		if (agendaContatosMap.containsKey(nome)) {
			return agendaContatosMap.get(nome);
		}
		return null;
	}
	public static void main(String[] args) {
	    // Criando uma instância da classe AgendaContatos
	    AgendaContatos agendaContatos = new AgendaContatos();

	    // Exibindo os contatos no conjunto (deve estar vazio)
	    agendaContatos.exibirContatos();

	    // Adicionando contatos à agenda
	    agendaContatos.adicionarContato("João", 123456789);
	    agendaContatos.adicionarContato("Maria", 987654321);
	    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
	    agendaContatos.adicionarContato("Ana", 88889999);
	    agendaContatos.adicionarContato("Fernando", 77778888);
	    agendaContatos.adicionarContato("Carolina", 55555555);
	    agendaContatos.adicionarContato("Carolina", 66666666);
	    // se adcionar uma chave que ja existi , ela substituira o valor anterior
	    // Exibindo os contatos na agenda
	    agendaContatos.exibirContatos();

	    // Pesquisando contatos pelo nome
	    System.out.println("pesquisando pela chave (que nesse caso é maria) vai retorna o valor referente a essa chave se existir: " + agendaContatos.pesquisarPorNome("Maria"));

	    
	  }
}
