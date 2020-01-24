package agenda;

/**
 * Representacao de um contato. Todo contato precisa ter um nome, sobrenome
 * e um telefone.
 * 
 * @author Ezequias Rocha
 *
 */
public class Contato {
	private String nome;
	private String sobrenome;
	private String telefone;

	/**
	 * Controi um contato a partir de seu nome, sobrenome e telefone.
	 * Nenhum dos atribitos deve ser nulo.
	 * Caso alguma das variaveis seja nula sera lancada uma excecao.
	 * 
	 * @param nome o nome do contato.
	 * @param sobrenome o sobrenome do contato.
	 * @param telefone o telefone do contato.
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		
		if (nome == null) {
			throw new NullPointerException("O nome nao pode ser nulo");
		} else if (nome.trim().equals("")) {
			throw new IllegalArgumentException("O nome nao pode ser nulo");
		} 
		
		if (sobrenome == null) {
			throw new NullPointerException("O sobrenome nao pode ser nulo");
		} else if (sobrenome.trim().equals("")) {
			throw new IllegalArgumentException("O sobrenome nao pode ser nulo");
		}
		
		if (telefone == null) {
			throw new NullPointerException("O telefone nao pode ser nulo");
		} else if (telefone.trim().equals("")) {
			throw new IllegalArgumentException("O telefone nao pode ser nulo");
		}
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

	public String getNome() {
		return this.nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.nome + " " + this.sobrenome;
	}
}
