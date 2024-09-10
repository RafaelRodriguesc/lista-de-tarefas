package br.com.cdb.listadetarefas;

import java.util.Scanner;

public class Main {
	private static Scanner input = new Scanner(System.in);
	private static Tarefas tarefas = new Tarefas();

	public  void main(String[] args) {
		int opcao;

		do {
			exibirMenu();
			opcao = input.nextInt();
			processarOpcao(opcao);
		} while (opcao != 5);

		input.close();
	}

	public static void exibirMenu() {
		System.out.println("=========================   MENU   ========================");
		System.out.println("Utilize as teclas [ 1 2 3 4 5 ] para navegar no sistema");
		System.out.println("");
		System.out.println("[1] Adicionar Tarefa");
		System.out.println("[2] Remover Tarefa");
		System.out.println("[3] Listar Tarefas");
		System.out.println("[4] Listar Tarefas em Ordem Alfabética");
		System.out.println("[5] Sair");
	}

	public static void processarOpcao(int opcao) {
		int interacao = 1;
		switch (opcao) {
		case 1:
			tarefas.adicionarTarefa();
			while (interacao == 1) {
				System.out.println("[1] Adicionar outra tarefa");
				System.out.println("[2] Voltar");
				interacao = input.nextInt();
				if (interacao == 1) {
					tarefas.adicionarTarefa();
				}
				while (interacao != 1 && interacao != 2) {
					System.out.println("comando inválido! Por favor digite [1] ou [2]");
					interacao = input.nextInt();
				}
			}

			break;
		case 2:
			tarefas.removerTarefa();
			while (interacao == 1) {
				System.out.println("[1] Remover outra tarefa");
				System.out.println("[2] Voltar");
				interacao = input.nextInt();
				if (interacao == 1) {
					tarefas.removerTarefa();
				}
				while (interacao != 1 && interacao != 2) {
					System.out.println("comando inválido! Por favor digite [1] ou [2]");
					interacao = input.nextInt();
				}
			}
			break;
		case 3:
			tarefas.listarTarefas();
			aguardarEnter();
			break;
		case 4:
			tarefas.listarTarefasEmOrdemAlfabetica();
			aguardarEnter();
			break;
		case 5:
			tarefas.encerrar();
			System.out.println("Encerrando o programa...");
			break;
		default:
			System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
		}
	}
	
	public static void aguardarEnter() {
		System.out.println("");
        System.out.println("Pressione Enter para voltar ao menu...");
        input.nextLine(); 
        input.nextLine(); 
    }
}
