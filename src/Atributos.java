import java.util.Scanner;

public class Atributos {	
	Scanner sc = new Scanner(System.in);

	public final void atributos1() {
		System.out.println("********************************************** { - Atributos - } **********************************************\r\n");
		System.out.println("* Atributos basicamente sera tudo que pode ser atribuido ao Objeto (Carro)\n\r"
				+ "     Nosso Carro possui as seguintes atribuições ou caracteristicas\n"
				+ "			Atributos:\r\n"
				+ "		 	- Modelo      ( Civic )\r\n"
				+ "		 	- Marca       ( Honda )\r\n"
				+ "		 	- Ano         ( 2020 )\r\n"
				+ "		 	- Cor         ( vermelho )\r\n"
				+ "		 	- Potencia    ( 190 Hp )\r\n"
				+ "		 	- Consumo     ( 15km-L )\r\n"
				+ "		 	- Qtd Portas  ( 4 )\r\n"
				+ "		 	- Etc         ( Etc..etc )\r\n");
		}
	
	
	public final void atributos2() {
		System.out.println("********************************************** { - Resumo de Atributos - } **********************************************\r\n");
		System.out.println("   Voce pode ter infinitos atributos dentro da sua classe. \n"
				+ "   Cada Objeto tem seus proprios atributos e ainda podem Herdar outros atributos de outros objetos \n"
				+ "   Mas este tema iremos ver um pouco mais para a frente la em [ Herança]	 \n\r");
		}
	
	public final void atributos3() {
		System.out.println("********************************************** { - Definindo o tipo de atributos - } **********************************************\r\n");
		System.out.println("   Neste momento em que voce esta definindo os seus atributos, voce deve tambem definir que tipo de atributo ele sera.\n"
				+ "      Tipos de atributos : [ String, Interg, Long , Double, Date....]\n "
			+ "		Atributos:\r\n"
			+ "		 - Modelo      ( String   )      (   Civic        )\r\n"
			+ "		 - Marca       ( String   )      (   Honda        )\r\n"
			+ "		 - Ano         ( Interger )      (   2020         )\r\n"
			+ "		 - Cor         ( String   )      (   Vermelho     )\r\n"
			+ "		 - Potencia    ( Double   )      (   190 Hp       )\r\n"
			+ "		 - Consumo     ( Double   )      (   15km-L       )\r\n"
			+ "		 - Qtd Portas  ( Interger )      (   4            )\r\n"
			+ "		 - Etc         ( Etc..etc )      (   ....       )\r\n"
			+ "  Exemplo de como devera ficar :\n"
			+ "    - String modelo = \'civic'\n"
			+ "    - Integer ano = \'2020'\n\r");
	}
	
	public final void quest() {
		System.out.println("********************************************** { - Vamos Rever um pouco do que ja vimos ! - } **********************************************\r\n");
	}
	
	public final void quest1() {
		
		System.out.println("1º Questao:");
		System.out.println("     Em Java POO podemos dizer que tudo pode ser um Objeto ?");
		System.out.println("       [ S ] - Sim  ");
		System.out.println("       [ N ] - Nao  ");
		
		char quest1 = sc.next().charAt(0);
		
		if (quest1 == 's' || quest1 == 'S' ) {
			System.out.println("     Parabens ");
		} else {
			System.out.println("     Ops, acho que seria bom revermos novamente ");
			quest1();
		}		
		
	}

	public final void quest2() {
		System.out.println("2º Questao:");
		System.out.println("      Quantos objetos podemos ter em nosso programa Java-POO");
		System.out.println("       [ 1 ] - Apenas 1  ");
		System.out.println("       [ 2 ] - Somente 2  ");
		System.out.println("       [ 3 ] - Podemos ter ate 10 Objetos  ");
		System.out.println("       [ 4 ] - Infinitos objetos  ");
		
		String quest2 = sc.next();
		
		switch(quest2) {
		case "1":
				System.out.println("     Opção errada vamos tentar novamente \n");
				quest2();
			break;
		case "2":
			System.out.println("     Opção errada vamos tentar novamente \n");
			quest2();
			break;
		case "3":
			System.out.println("     Opção errada vamos tentar novamente \n");
			quest2();
			break;
		case "4":
			System.out.println("     Parabens Podemos ter quantos Objetos forem nescessarios \n");
			break;
		default:
			System.out.println("Opção Invalida... vamos tentar novamente \n");
			quest2();
		}
	
	}

	
	public final void quest3() {
		System.out.println("3º Questao:");
		System.out.println("      Podemos dizer que Atributos sao :");
		System.out.println("       [ 1 ] - Atributo seria todas as características  do nosso Objeto  ");
		System.out.println("       [ 2 ] - Atributo define o nome do nosso Objeto  ");
		System.out.println("       [ 3 ] - Devemos evitar os atributos  ");
		System.out.println("       [ 4 ] - Atributos atribui atribuimentos dentro do atributos do programa de forma agil  ");
		
		String quest3 = sc.next();
		
		switch(quest3) {
		case "1":
				System.out.println("     Parabens Atributos basicamente sera tudo que pode ser atribuido ao Objeto \n");				
				break;
		case "2":
			System.out.println("     Ops opção errada vamos tentar novamente \n");
			quest3();
			break;
		case "3":
			System.out.println("     Ops opção errada  vamos tentar novamente \n");
			quest3();
			break;
		case "4":
			System.out.println("     Ops opção errada vamos tentar novamente \n");
			quest3();
			break;
		default:
			System.out.println("     Ops opção invalida!!!  vamos tentar novamente \n");
			quest3();
		}

	}
	
}
