package familia28;

public class Pessoa {//Superclasse ou tamb�m conhecida como classe m�e
	//declaramos os atributos da classe Pessoa
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	//quando declaro como private estou indicando que o meu atributo s� ser� acessado pelos m�todos da minha pr�pria classe
	
	//estou montando o meu construtor, que serve para inicializar os meus atributos
	public Pessoa(String nome,String endereco,String cpf,int telefone,int idade)
	{
		super();//para indicar que os atributos s�o da super classe
		this.nome = nome;//inicializa��o dos meus atributos, vou passar o par�metro para o atributo 
		this.endereco = endereco;//vou usar o this para diferenciar o meu atributo do meu par�metro
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	//a partir daqui irei come�ar a criar os meus m�todos getters and setters
	
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


	// agora estamos criando os m�todos espec�ficos da classe Pessoa
	
	public void validarCpf()
	{
		if(getCpf().length()!=11)//length ele conta a quantidade de caracteres
		{
			System.out.println("\n--CPF Inv�lido!!!");
		}
		else
		{
			System.out.println("\n--CPF V�lido!!!");
		}
	}
}

