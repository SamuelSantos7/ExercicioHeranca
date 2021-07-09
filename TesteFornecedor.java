package familia28;

public class TesteFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

			
				// TODO Auto-generated method stub
				boolean direcao = true;
				
				Fornecedor thiagopedroso = new Fornecedor("Thiago Pedroso","Rua Mauricio Jacquey,321","12345678912",974543322,18,10000,1000);
				Fornecedor leticiamaria = new Fornecedor("Letícia Maria","Rua das Hortências,58","1234567891",81124550,19,15000,5);
				
				thiagopedroso.imprimirInfo();
				System.out.println("\n");
				thiagopedroso.validarCpf();
				System.out.println("\n");
				thiagopedroso.obterSaldo();
				
				System.out.println("\n");
				System.out.println("\n");
				leticiamaria.imprimirInfo();
				System.out.println("\n");
				leticiamaria.validarCpf();
				System.out.println("\n");
				leticiamaria.obterSaldo();
				
				if(direcao == false)
				{
					System.out.println("\nParabéns May, você está na direção certa...");
				}
				else
				{
					System.out.println("\nCuidado May, você não pode perder a direção...");
				}
			}

		

	}


