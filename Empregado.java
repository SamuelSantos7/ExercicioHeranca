package familia28;

import java.text.NumberFormat;

public class Empregado {

    private String nome;
	private double salario;
	
	public Empregado(String n, double s)//construtor    
	{	
		this.setNome(n);  //inicializa��o do atributo nome 
		this.setSalario(s); //inicializa��o do atributo sal�rio 
		
	}
// defini��o dos m�todos
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
		NumberFormat nf = NumberFormat.getCurrencyInstance();//pega a moeda corrente do pa�s
		nf.setMinimumFractionDigits(2); // formata a quantidade de casas depois da v�rgula
		String formatoMoeda = nf.format(salario);// formata a sa�da do meu valor monit�rio
		return formatoMoeda;// vou retornar o sal�rio j� formatado
	}

	public void imprimir1( ) {
		System.out.println(nome+ "t/t"+ "Sal�rio : "+this.formatarMoeda());
	}

	public void aumentarSalario(double percentual) {
		salario *= 1+ percentual/100; // sal�rio = sal�rio * (1+percentual/100)
		
	}

}
