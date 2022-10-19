import java.util.Scanner;

public class Introducao {
	Atributos atributos = new Atributos();
	Metodos metodos = new Metodos();
	
	public final void javaPoo() {
		
		System.out.println("                Programa��o Orientada a Objetos\r\n"
				+ " Seria uma forma de aproximar o mundo real ao mundo da programa��o.\n"
				+ "   vamos pensar em um carro por exemplo:\n"
				+ "   Nosso Objeto em POO sera o Carro Podemos ter varios tipos de carros (objetos)\n"
				+ "   e todo carro tera seus atributos e seus metodos.\n\r"
				+ "          Veja abaixo como ficaria : \n"
				+ "          Classe : Carro ( Objeto) \r\n"
				+ " 	 	Atributos:               Metodos:\r\n"
				+ "		- modelo		             - acelerar ()\r\n"
				+ "		- marca		   	             - freiar   ()\r\n"
				+ "		- ano		    	         - buzinar  () \r\n"
				+ "		- cor\n\r"
				+ "   Vamos Entender um pouco mais sobre estes 2 topicos \n"
				+ "    -> Atributos \n"
				+ "    -> Metodos");
		atributos.atributos1();
		atributos.atributos3();
		atributos.atributos2();
//		metodos.metodos1();
		
	}

	public void pilaresJavaOO() {
		System.out.println("Os 4 pilares da Programa��o Orientada a Objetos sao : \r\n"
				+ " *  Abstra��o.\r\n"
				+ " *  Encapsulamento.\r\n"
				+ " *  Heran�a.\r\n"
				+ " *  Polimorfismo.\r\n");
	}
	public void abstracao() {
		System.out.println(" * 					Abstra��o");
		System.out.println("  A abstra��o de dados � a propriedade em virtude da qual apenas os detalhes \r\""
				+ "nessenciais s�o exibidos ao usu�rio. As unidades triviais ou n�o essenciais n�o s�o exibidas\n\r"
				+ " para o usu�rio Ex: um carro � visto como um carro ao inv�s de seus componentes individuais.");
	}
	public void encapsulamento() {
		System.err.println(" * 					Encapsulamento");
		System.out.println("O encapsulamento � um conceito da Programa��o Orientada a Objetos onde o estado\n\r"
				+ " de objetos (as vari�veis da classe) e seus comportamentos (os m�todos da classe) s�o agrupados\n\r"
				+ " em conjuntos segundo o seu grau de rela��o.");
	}
	
	public void heran�a() {
		System.out.println(" * 					Heran�a");
		System.out.println("  A heran�a � um mecanismo da Orienta��o a Objeto que permite criar novas classes a \n\r"
				+ "partir de classes j� existentes, aproveitando-se das caracter�sticas existentes na classe a ser \n\r"
				+ "estendida. Este mecanismo � muito interessante, pois promove um grande reuso e reaproveitamento de \n\r"
				+ "c�digo existente.");
	}
	
	public void polimorfismo() {
		System.out.println(" * 					Polimorfismo");
		System.out.println("  Polimorfismo � o princ�pio pelo qual duas ou mais classes derivadas de uma mesma \n\r"
				+ "superclasse podem invocar m�todos que t�m a mesma identifica��o (assinatura) mas comportamentos\n\r"
				+ " distintos, especializados para cada classe derivada, usando para tanto uma refer�ncia a um objeto do\n\r"
				+ " tipo da superclasse.");
	}
	
	public String case1() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" [ 1 ] - Abstra��o.\r\n"
				+ " [ 2 ] - Encapsulamento\r\n"
				+ " [ 3 ] - Heran�a\r\n"
				+ " [ 4 ] - Polimorfismo");
		String escolha = sc.next();
		return escolha;
	}
	
	public void exemplosCase1() {
		System.out.println("");
		System.out.println("Ex: um carro � visto como um carro ao inv�s de seus componentes individuais");		
		
	}
	
	public void exemplosEncapsulamento() {
		System.out.println("******************************** Exemplo : ************************************************************************");
		System.out.println(" \r\n"
				+ "Exemplo : public \r\n"
				+ "uma classe com seus atributos publicos \r\n"
				+ "voce pode instanciar essa classe em outra classe e alterar os seus atributos diretamente.\r\n"
				+ "\r\n"
				+ "Exemplo : private\r\n"
				+ "Voce ainda consegue estanciar essa classe em outra classe ok, porem agora voce ja nao mais conseguirar acessar ou\r\n"
				+ " visualiar todos os atributos diretamente da classe instanciada, voce acessara somente atraves de\r\n"
				+ " gets e sets   ");
		System.out.println("***************************************************************************************************************");
	}
	
	
	public void mostraIntroducao() {
		System.out.println("Os 4 pilares da Programa��o Orientada a Objetos\r\n"
				+ " *  Abstra��o.\r\n"
				+ " *  Encapsulamento.\r\n"
				+ " *  Heran�a.\r\n"
				+ " *  Polimorfismo.\r\n");
System.out.println(" O que e uma Classe em OO ?");
System.out.println(" Classe : e um elemente de um projeto de OO  que consegue expressar o que voce tem na vida real em variaveis");
System.out.println(" Exemplo: ");
System.out.println(" Veiculo :");
System.out.println("   |- Veiculo tem :");
System.out.println("   |--> Marca");
System.out.println("   |--> Modelo");
System.out.println("   |--> KM");
System.out.println("   |--> Renavam");
System.out.println("   |--> Numero de Chassi");
System.out.println("   |--> Cor");
System.out.println("   |--> Potencia");
System.out.println(" Cada um desses elementos compoem uma classe  ");
System.out.println("   CLASSES: ");
System.out.println("   |-->  Dentro de cada classe voce tera ");
System.out.println("   |--> Declara�oes das variaveis  ");
System.out.println("   |--> Construtores ");
System.out.println("   |--> Metodos");
System.out.println("   |--> Em resumo : varios elementos que faram com que a classe se torne viva ");
	}
}
