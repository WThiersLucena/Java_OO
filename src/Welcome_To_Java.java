import java.util.Scanner;

public class Welcome_To_Java {

	public static void main(String[] args) {
//		Introducao intro = new Introducao(); // PODE APAGAR 
		Welcome_To_Java.inicioPrograma();

	}

	public static void inicioPrograma() {
		Introducao intro = new Introducao();
		Atributos atributos = new Atributos();
		Metodos metodos = new Metodos();
		Pilares pilares = new Pilares();
		Scanner input = new Scanner(System.in);

		Scanner sc = new Scanner(System.in);

		System.out.println("* ------------------------------------ *");
		System.out.println("*  Bem vindo ao Mundo Java             *");
		System.out.println("*  Deseja iniciar o programa ? (S/N)   * ");
		System.out.println("* ------------------------------------ *");

		char iniciar = sc.next().charAt(0);

		if (iniciar == 's' || iniciar == 'S') {
			System.out.println(" Otima escolha!");
			System.out.println(
					" Vamos juntos Desbravar esse incrivel mundo ? \n Como posso chamo-lo ?" + "\n Digite seu nome: ");
			String nome = sc.next();
			System.out.println("");
			intro.javaPoo();
			atributos.atributos1();
			atributos.atributos3();
			atributos.atributos2();
			atributos.quest();
			atributos.quest1();
			atributos.quest2();
			atributos.quest3();
			metodos.metodos();
			metodos.metodos1();
			pilares.pilaresJavaOO();

			System.out
					.println(" Iremos ver um a um todos eles. \n\r" + "     " + nome + " Por onde deseja começar ?\n");

			switch (pilares.case1()) {
			case "1":
				pilares.abstracao();
				System.out.println("Dejeva ver um exemplo ? (s/n)");
				char exemplo1 = sc.next().charAt(0);
				if (exemplo1 == 's' || exemplo1 == 'S') {
					pilares.exemplosCase1();

					System.out.println("Escolha um novo tema: ");

					switch (pilares.case1()) {
					case "1":
						System.out.println("Ja vimos um pouco sobre Abstração deseja rever ?");
						System.out.println("Dejeva ver um exemplo ? (s/n)");
						char revendo = sc.next().charAt(0);
						if (revendo == 's' || revendo == 'S') {
							System.out.println("Ex: Exemplificar o caso de pessoa com [nome cpf altura e por ai vai] ");
							System.out.println("Escolha um novo tema: ");
							switch (pilares.case1()) {
							case "1":
								System.out.println("Tema ja visto, sistema finalizado Obrigado Volte logo ?");
								break;
							case "2":
								pilares.encapsulamento();
								break;
							case "3":
								pilares.herança();
								break;
							case "4":
								pilares.polimorfismo();
								break;
							}
						} else {
							switch (pilares.case1()) {
							case "1":
								System.out.println("Tema ja visto, sistema finalizado Obrigado Volte logo ?");
								break;
							case "2":
								pilares.encapsulamento();
								break;
							case "3":
								pilares.herança();
								break;
							case "4":
								pilares.polimorfismo();
								break;
							}
						}
						;
						break;
					case "2":
						pilares.encapsulamento();
						break;
					case "3":
						pilares.herança();
						break;
					case "4":
						pilares.polimorfismo();
						break;
					}

				} else if (exemplo1 == 'n' || exemplo1 == 'N') {
					System.out.println(" Ok perfeito vamos para o proximo tema ?");
					switch (pilares.case1()) {
					case "1":
						System.out.println("Ja vimos um pouco sobre Abstração deseja rever ?");
						break;
					case "2":
						pilares.encapsulamento();
						break;
					case "3":
						pilares.herança();
						break;
					case "4":
						pilares.polimorfismo();
						break;
					}

				} else {
					System.out.println(" Voce digitou : [" + exemplo1 + "] Opção Invalida! ");
					System.out.println(" Vamos tentar novamente ?\n\r");
					Welcome_To_Java.inicioPrograma();
				}
				break;
			case "2":
				pilares.encapsulamento();
				System.out.println("Dejeva ver um exemplo ? (s/n)");
				char case2 = sc.next().charAt(0);
				if (case2 == 's' || case2 == 'S') {
					pilares.exemplosEncapsulamento();
					System.out.println("Escolha um novo tema: ");

				} else {
					switch (pilares.case1()) {
					case "1":
						pilares.abstracao();
						break;
					case "2":
						System.out.println("Tema ja visto, sistema finalizado Obrigado Volte logo ?");
						break;
					case "3":
						pilares.herança();
						break;
					case "4":
						pilares.polimorfismo();
						break;
					}
				}

				break;
			case "3":
				pilares.herança();
				break;
			case "4":
				pilares.polimorfismo();
				break;

			// DEFAULT
			default:
				System.out.println(" Desculpe opção invalida vamos tentar novamente...!\n");
				switch (pilares.case1()) {
				case "1":
					pilares.abstracao();
					break;
				case "2":
					pilares.encapsulamento();
					break;
				case "3":
					pilares.herança();
					break;
				case "4":
					pilares.polimorfismo();
					break;
				}
				break;
			}

			// FIM DO CASE

//				intro.mostraIntroducao(null, iniciar);
		} else if (iniciar == 'n' || iniciar == 'N') {
			System.out.println(" Ok, esperamos revê-lo em breve :-)");
		} else {
			System.out.println(" Voce digitou : [" + iniciar + "] Opção Invalida! ");
			System.out.println(" Vamos tentar novamente ?\n\r");
			Welcome_To_Java.inicioPrograma();
		}

	}

}
