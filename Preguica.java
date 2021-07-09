package familia28;

public class Preguica extends Animal {
	private String deitar;
	private String escalar;
	
	public Preguica(String nome, int idade, double peso, String deitar, String escalar) {
		super( nome, idade, peso);
		this.deitar = deitar;
		this.escalar = escalar;
		
	}

	public String getDeitar() {
		return deitar;
	}

	public void setDeitar(String deitar) {
		this.deitar = deitar;
	}

	public String getEscalar() {
		return escalar;
	}

	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}
	
	
	
	public void imprimirInfo() {
		System.out.println("\nSeu animal: " + getNome() + " com " + getIdade() + " anos " + " \npesando: " + getPeso() + " Kg" 
	+ "\nEle deita: " + getDeitar() + " \n e escala: " + getEscalar());
		
	}
}
