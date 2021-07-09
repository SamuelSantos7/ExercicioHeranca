package familia28;

public class TesteAnimaisgeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro dog = new Cachorro(" Akins ", 6, 12.06, "AAAAAAUU", " ------->" );
		Cavalo horse = new Cavalo(" Abayomi ", 3, 102.55, " ruuuuuuum ", " /////////////>");
		Preguica sid = new Preguica(" Sid ", 10, 03.55, " ___________> ", " ||||||||||>");
		
		dog.filhote();
		System.out.println("\n");
		dog.acimaDoPeso();
		System.out.println("\n");
		dog.imprimirInfo();
		System.out.println("\n");
		
		System.out.println("\n\t ***** outro animal**** ");
		
		
		
		horse.filhote();
		System.out.println("\n");
		horse.acimaDoPeso();
		System.out.println("\n");
		horse.imprimirInfo();
		System.out.println("\n");
		
		System.out.println("\n\t ***** outro animal**** ");
		
		
		
		sid.filhote();
		System.out.println("\n");
		sid.acimaDoPeso();
		System.out.println("\n");
		sid.imprimirInfo();
		System.out.println("\n");
		
		System.out.println("\n\t ***** outro animal**** ");
		

	
	}

}
