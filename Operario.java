package familia28;

public class Operario extends Pessoa {//minha classe Operario vai herdar todas as características da classe Pessoa
	
	//declaração dos atributos da classe Operario
	private double valorProducao;
	private double comissao;
	
	//criar o construtor da classe Operario
	public Operario(String nome,String endereco,String cpf,int telefone,int idade,double valorProducao,double comissao)
	{
		super(nome,endereco,cpf,telefone,idade);//passar os parâtros para a minha super classe
		this.valorProducao = valorProducao;//inicializando os atributos da classe Operario
		this.comissao = comissao;
	}

	
	//declaração dos métodos getters and setters
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	//criar os métodos específicos da classe Operario
	public void imprimirInfo()
	{
		System.out.println("\nNome do operario: "+getNome()+"\n"+"CPF: "+getCpf()
		+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"
		+"Endereço: "+getEndereco()+"\n"
		+"\nValor monetário total dos artigos produzidos por "+getNome()+": "+valorProducao
		+"\nPorcentagem (sem o %) da comissão deste artigo: "+comissao);
	}
	
	public void calcularSalario()
	{
		double valorTotal = valorProducao + (valorProducao * (comissao/100));
		System.out.println("\nO valor total a ser recebido pelo operário: "+getNome()
		+" é igual a: "+valorTotal);
	}
	
	public void validarCpf()
	{
		if(getCpf().length()!=11)
		{
			System.out.println("\n--CPF Inválido!!!");
		}
		else
		{
			System.out.println("\n--CPF Válido!!!");
		}
	}
}

