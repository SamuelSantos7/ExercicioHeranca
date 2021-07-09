package familia28;

public class Pessoa {//Superclasse ou também conhecida como classe mãe
	//declaramos os atributos da classe Pessoa
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	//quando declaro como private estou indicando que o meu atributo só será acessado pelos métodos da minha própria classe
	
	//estou montando o meu construtor, que serve para inicializar os meus atributos
	public Pessoa(String nome,String endereco,String cpf,int telefone,int idade)
	{
		super();//para indicar que os atributos são da super classe
		this.nome = nome;//inicialização dos meus atributos, vou passar o parâmetro para o atributo 
		this.endereco = endereco;//vou usar o this para diferenciar o meu atributo do meu parâmetro
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	//a partir daqui irei começar a criar os meus métodos getters and setters
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public int getTelefone() {
		return telefone;
	}



	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}


	// agora estamos criando os métodos específicos da classe Pessoa
	
	public void validarCpf()
	{
		if(getCpf().length()!=11)//length ele conta a quantidade de caracteres
		{
			System.out.println("\n--CPF Inválido!!!");
		}
		else
		{
			System.out.println("\n--CPF Válido!!!");
		}
	}
}

