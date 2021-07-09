package familia28;
/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/
public class Animal {

	private String nome;
	private int idade;
	private double peso;
	
	public Animal(String nome, int idade, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		
	}

	
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public double getPeso() {
		return peso;
	}




	public void setPeso(double peso) {
		this.peso = peso;
	}




	public void filhote() {
		if(getIdade() > 3) {
			System.out.println("\nSeu animal não é mais filhote!");			
		}
		else {
			System.out.println("\nSeu animal é um filhotinho!!!");
		}
	}
	
	public void acimaDoPeso() {
		if(getPeso() > 100) {
			System.out.println("\nSeu animal está acima do peso!");			
		}
		else if (getPeso() < 5) {
			System.out.println("\nSeu animal está abaixo do peso!!!");
		}
		
		else {
			System.out.println("\nSeu animal está na pesagem normal!!");
		}
	}

}

