package desafioGoDev;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Pessoas;

public class Principal {
	private static final Pessoas Id = null;
	private static List<Pessoas> listPessoas = new ArrayList<>();
	private static List<SalasdeEventos> listSalasdeEvetos = new ArrayList<>();
	private static Iterable<Pessoas> listSalasdeEvento;
	private static Object lotacao;
	private static Iterable<Pessoas> listSalaCafe;

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("-Escolha uma opção-");
			System.out.println("1. Pessoas");
			System.out.println("2. Salas de evento");
			System.out.println("3. Salas de cafe");
			System.out.println("6. Sair");
			int opcao = input.nextInt();

			switch (opcao) {
			case 6: {
				System.out.println("Bye");
				System.exit(0);
			}

			case 1: {
				menuPessoas(input);
				break;
			}

			case 2: {
				menuSalas(input);
				break;
			}
			case 3: {
				menuSalasCafe(input);
				break;
			}
			}
		}
	}
	private static int lerOpcaoMenuSalasCafe() {
		Scanner inputSalasCafe = new Scanner(System.in);
		System.out.println("-Escolha uma opção-");
		System.out.println("1. Cadastrar");
		System.out.println("2. Listar");
		return inputSalasCafe.nextInt();
	}
	private static void menuSalasCafe(Scanner input) {
		int opcao = lerOpcaoMenuAcao();

		switch (opcao) {
		case 1: {
			cadastrarSalaCafe();
			break;
		}

		case 2: {
			listarSalaCafe();
			break;
		}

		default:
			System.out.println("Opção inválida");
		}

	}

	private static void listarSalaCafe() {
		System.out.println("=== Salas listadas ===");
		listSalaCafe.forEach(salacafe -> System.out.println(salacafe));
	}

	private static void cadastrarSalaCafe() {
		Scanner inputSalaCafe = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = inputSalaCafe.nextLine();
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = inputSalaCafe.nextLine();

		Pessoas pessoas = new Pessoas();
		pessoas.setNome(nome);
		pessoas.setSobrenome(sobrenome);
		System.out.println("Cadastro de Pessoas realizado com Sucesso.");
	}

	private static int lerOpcaoMenuSalas() {
		Scanner inputSalas = new Scanner(System.in);
		System.out.println("-Escolha uma opção-");
		System.out.println("1. Cadastrar");
		System.out.println("2. Listar");
		return inputSalas.nextInt();
	}

	private static void menuSalas(Scanner input) {
		int opcao = lerOpcaoMenuAcao();

		switch (opcao) {
		case 1: {
			cadastrarSalas();
			break;
		}

		case 2: {
			listar();
			break;
		}

		default:
			System.out.println("Opção inválida");
		}

	}

	private static void listarSalas() {
		System.out.println("=== Salas listadas ===");
		listSalasdeEvento.forEach(salasdeevento -> System.out.println(salasdeevento));

	}

	private static void cadastrarSalas() {
		Scanner inputSalas = new Scanner(System.in);
		System.out.println("Digite o nome da sala: ");
		String nome = inputSalas.nextLine();
		System.out.println("Digite a lotação: ");
		String lotação = inputSalas.nextLine();

		SalasdeEventos salasdeevento = new SalasdeEventos();
		salasdeevento.setNome(nome);
		salasdeevento.setLotação((String) lotacao);
		System.out.println("Cadastro de salas realizado com Sucesso.");
	}

	private static int lerOpcaoMenuAcao() {
		Scanner inputPessoas = new Scanner(System.in);
		System.out.println("-Escolha uma opção-");
		System.out.println("1. Cadastrar");
		System.out.println("2. Listar");
		return inputPessoas.nextInt();
	}

	private static void menuPessoas(Scanner input) {
		int opcao = lerOpcaoMenuAcao();

		switch (opcao) {
		case 1: {
			cadastrarPessoas();
			break;
		}
		
		case 3: {
			listar();
			break;
		}
		default:
			System.out.println("Opção inválida");
		}

	}

	private static void listar() {
		System.out.println("=== Pessoas listadas ===");
		listPessoas.forEach(pessoas -> System.out.println(pessoas));

	}

	private static void cadastrarPessoas() {
		Scanner inputUser = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = inputUser.nextLine();
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = inputUser.nextLine();

		Pessoas pessoas = new Pessoas();
		pessoas.setNome(nome);
		pessoas.setSobrenome(sobrenome);
		System.out.println("Cadastro de Pessoas realizado com Sucesso.");
	}
}