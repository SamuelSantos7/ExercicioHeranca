package familia28;

public class Cachorro extends Animal {

	private String latir;
	private String correr;
	
	
	public Cachorro (String nome, int idade, double peso, String latir, String correr) {
		super(nome, idade, peso);
		this.latir = latir;
		this.correr = correr;
		
	}


	public String getLatir() {
		return latir;
	}


	public void setLatir(String latir) {
		this.latir = latir;
	}


	public String getCorrer() {
		return correr;
	}


	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void imprimirInfo() {
		System.out.println("\nSeu animal: " + getNome() + " com " + getIdade() + " anos " + " \npesando: " + getPeso() + " Kg" 
	+ "\nCom o latido: " + getLatir() + " \n e corrida: " + getCorrer());
		
	}
}
