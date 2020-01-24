package agenda;

import java.util.Arrays;

/**
 * Representacao de uma agenda, que contem um array de Contato de tamanho 100,
 * que permite cadastrar contato, listar contato, exibir contato.
 * 
 * @author Ezequias Rocha
 *
 */
public class Agenda {

	Contato[] contatos = new Contato[100];
	private String saida = "";

	/**
	 * Cadastra um objeto contato em um array de 100 posicoes
	 * 
	 * @param posicao, inteiro que representa a posicao que sera cadastrada no
	 *    array (de 0 a 99).
	 * @param nome, representacao String do nome do contato.
	 * @param sobrenome, representacao String do sobrenome do contato.
	 * @param telefone, representacao String do telefone do contato.
	 * @return true se for cadastrado com sucesso e false caso contrario.
	 */
	public boolean cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		if (posicao < 1 || posicao > 100) {
			return false;
		} else {
			contatos[posicao - 1] = new Contato(nome, sobrenome, telefone);
			return true;
		}
	}

	/**
	 * Retorna uma String que representa a lista dos contatos que estao na agenda.
	 * 
	 * @return a representacao em String da agenda.
	 */
	public String listarContato() {
		this.saida = "";
		for (int i = 0; i < 100; i++) {
			if (contatos[i] != null) {
				saida += (i + 1) + " - " + contatos[i].toString() + System.lineSeparator();
			}
		}
		return saida;
	}

	/**
	 * Retorna uma String com o contato armazenado na posicao que foi passada, caso
	 * nao tenha nenhum contato cadastrado na posicao passada retorna "POSICAO
	 * INVALIDA"
	 * 
	 * @param posicao, int da posicao na lista (posicao-1)
	 * @return representacao String do contato ou "POSICAO INVALIDA"
	 */
	public String exibirContato(int posicao) {
		if (contatos[posicao - 1] != null) {
			String contato = contatos[posicao - 1].toString();
			return contato + " - " + contatos[posicao - 1].getTelefone();
		}
		return ("POSIÇÃO INVÁLIDA!");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (!Arrays.equals(contatos, other.contatos))
			return false;
		return true;
	}
}
