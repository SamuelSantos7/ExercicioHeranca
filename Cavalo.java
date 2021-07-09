package familia28;

public class Cavalo extends Animal {
	private String rugir;
	private String empinar;
	
	public Cavalo (String nome, int idade, double peso, String rugir, String empinar) {
		super(nome, idade, peso);
		this.rugir = rugir;
		this.empinar = empinar;
		
	}

	public String getRugir() {
		return rugir;
	}

	public void setRugir(String rugir) {
		this.rugir = rugir;
	}

	public String getEmpinar() {
		return empinar;
	}

	public void setEmpinar(String empinar) {
		this.empinar = empinar;
	}
	
	public void imprimirInfo() {
		System.out.println("\nSeu animal: " + getNome() + " com " + getIdade() + " anos " + " \npesando: " + getPeso() + " Kg" 
	+ "\nCom o rangido: " + getRugir() + " \n e corrida: " + getEmpinar());
		
	}
}
