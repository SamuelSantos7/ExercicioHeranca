package familia28;

public class Fornecedor extends Pessoa{//vai herdar da classe Pessoa
	
	//declaração dos atributos da classe Fornecedor
	private double valorCredito;
	private double valorDivida;
	
	//declaração do método especial Construtor
	
	public Fornecedor(String nome,String endereco,String cpf,int telefone,int idade,double valorCredito,double valorDivida)
	{
		super(nome,endereco,cpf,telefone,idade);//passar os parâtros para a minha super classe
		this.valorCredito = valorCredito;//inicializando os atributos da classe Operario
		this.valorDivida = valorDivida;
	}

	//criar os métodos getters and setters
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	//criação dos métodos específicos da classe
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do fornecedor: "+getNome()+"\n"+"CPF: "+getCpf()
		+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"
		+"Endereço: "+getEndereco()+"\n"
		+"\nValor do crédito do fornecedor: "+getNome()+": "+valorCredito
		+"\nValor da divida foi de: "+valorDivida);
	}
	
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
	
	public void obterSaldo()
	{
		double diferencacredito = valorCredito - valorDivida;
		System.out.println("\nO saldo referente ao fornecedor é igual a: "+diferencacredito);
	}

}
