package familia28;

import java.text.NumberFormat;

public class Empregado {

    private String nome;
	private double salario;
	
	public Empregado(String n, double s)//construtor    
	{	
		this.setNome(n);  //inicialização do atributo nome 
		this.setSalario(s); //inicialização do atributo salário 
		
	}
// definição dos métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
		
		
	

	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();//pega a moeda corrente do país
		nf.setMinimumFractionDigits(2); // formata a quantidade de casas depois da vírgula
		String formatoMoeda = nf.format(salario);// formata a saída do meu valor monitário
		return formatoMoeda;// vou retornar o salário já formatado
	}

	public void imprimir1( ) {
		System.out.println(nome+ "t/t"+ "Salário : "+this.formatarMoeda());
	}

	public void aumentarSalario(double percentual) {
		salario *= 1+ percentual/100; // salário = salário * (1+percentual/100)
		
	}

}
