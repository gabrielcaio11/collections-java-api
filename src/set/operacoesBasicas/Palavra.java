package set.operacoesBasicas;

import java.util.Objects;

public class Palavra {
	private String palavra;

	public Palavra(String palavra) {
		this.palavra = palavra;
	}

	public String getPalavra() {
		return palavra;
	}

	@Override
	public String toString() {
		return "Palavra: " + palavra;
	}

	@Override
	public int hashCode() {
		return Objects.hash(palavra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palavra other = (Palavra) obj;
		return Objects.equals(palavra, other.palavra);
	}
	
	
	
	

}
