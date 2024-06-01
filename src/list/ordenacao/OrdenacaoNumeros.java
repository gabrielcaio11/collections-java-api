package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	List<Integer> numList;
	
	public OrdenacaoNumeros() {
		numList = new ArrayList<>();
	}
	public void adcionarNumero(int num) {
		numList.add(num);
		
	}
	public List<Integer> ordenarAscendente() {
		List<Integer> ordenarAscendente = new ArrayList<>(numList);
		Collections.sort(ordenarAscendente);
		return ordenarAscendente;
	}
	public List<Integer> ordenarDecendente() {
		List<Integer> ordenarDecendente = new ArrayList<>(numList);
		Collections.sort(ordenarDecendente,Collections.reverseOrder());
		return ordenarDecendente;
	}
	
	public static void main(String[] args) {
		OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
		ordenacaoNumeros.adcionarNumero(1);
		ordenacaoNumeros.adcionarNumero(14);
		ordenacaoNumeros.adcionarNumero(17);
		ordenacaoNumeros.adcionarNumero(22);
		ordenacaoNumeros.adcionarNumero(60);
		ordenacaoNumeros.adcionarNumero(34);
		ordenacaoNumeros.adcionarNumero(35);
		
		System.out.println(ordenacaoNumeros.numList);
		System.out.println(ordenacaoNumeros.ordenarAscendente());
		System.out.println(ordenacaoNumeros.ordenarDecendente());
		
	}
}
