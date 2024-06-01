package list.ordenacao;

public class Inteiros implements Comparable<Integer>{
	public Integer num;
	
	public Inteiros() {
		
	}

	@Override
	public int compareTo(Integer i) {
		
		return Integer.compare(num, i);
	}
}
