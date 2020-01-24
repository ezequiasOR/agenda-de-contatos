package agenda;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Agenda contato = new Agenda();
		
		while (true) {
			
			System.out.print("(C)adastrar Contato\n"
					+ "(L)istar Contatos\n"
					+ "(E)xibir Contato\n"
					+ "(S)air\n"
					+ "\n"
					+ "Opção> ");
			String opcao = sc.nextLine().toUpperCase();
		
			if (opcao.equals("S")) {
				break;
			
			} else if (opcao.equals("C")) {       //CADASTRA CONTATO
				System.out.print("Posição: ");
				
				int posicao = sc.nextInt();
				sc.nextLine();
				
				if (posicao < 1 || posicao > 100) {
					System.out.println("POSIÇÃO INVÁLIDA!");
					System.out.println();
					continue;
				}
			
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				
				System.out.print("Sobrenome: ");
				String sobrenome = sc.nextLine();
				
				System.out.print("Telefone: ");
				String telefone = sc.nextLine();
				
				if (contato.cadastraContato(posicao, nome, sobrenome, telefone)) {
					System.out.println("CADASTRO REALIZADO!");
					System.out.println("");
				}
				
			} else if (opcao.equals("L")) {       //LISTAR CONTATO
				System.out.println(contato.listarContato());
				
			} else if (opcao.equals("E")) {      //EXIBIR CONTATO
				System.out.print("Contato> ");
				int posicao = sc.nextInt();
				sc.nextLine();
				
				System.out.println(contato.exibirContato(posicao));
				System.out.println("");
				
			} else if (!opcao.equals("C") && !opcao.equals("L") && !opcao.equals("E") && !opcao.equals("S")){
				System.out.println("OPÇÃO INVÁLIDA!");
				System.out.println();
			}
		}
	}
}
