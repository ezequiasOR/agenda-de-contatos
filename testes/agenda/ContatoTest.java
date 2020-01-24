package agenda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContatoTest {

	private Contato contatoBase;
	private Contato contatoIgual;
	private Contato contatoDiferente;

	@BeforeEach
	public void criaContato() {
		contatoBase = new Contato("Matheus", "Gaudencio", "2101-0000");
		contatoIgual = new Contato("Matheus", "Gaudencio", "2101-0000");
		contatoDiferente = new Contato("Joao", "Papagalli", "2101-0000");
	}

	@Test
	public void testNomeNulo() {
		try {
			Contato contatoInvalido = new Contato(null, "Gaudencio", "21010000");
			fail("Era esperado exceção ao passar código nulo");
		} catch (NullPointerException npe) {

		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testSobrenomeNulo() {
		try {
			Contato contatoInvalido = new Contato("Matheus", null, "21010000");
			fail("Era esperado exceção ao passar código nulo");
		} catch (NullPointerException npe) {

		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testTelefoneNulo() {
		try {
			Contato contatoInvalido = new Contato("Matheus", "Gaudencio", null);
			fail("Era esperado exceção ao passar código nulo");
		} catch (NullPointerException npe) {

		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testNomeVazio() {
		try {
			Contato contatoInvalido = new Contato("     ", "Gaudencio", "21010000");
			fail("Era esperado exceção ao passar código nulo");
		} catch (NullPointerException npe) {

		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testSobrenomeVazio() {
		try {
			Contato contatoInvalido = new Contato("Matheus", "     ", "21010000");
			fail("Era esperado exceção ao passar código nulo");
		} catch (NullPointerException npe) {

		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testTelefoneVazio() {
		try {
			Contato contatoInvalido = new Contato("Matheus", "Gaudencio", "     ");
			fail("Era esperado exceção ao passar código nulo");
		} catch (NullPointerException npe) {

		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testNomeCompleto() {
		assertEquals("Matheus Gaudencio", contatoBase.toString());
		assertEquals("Joao Papagalli", contatoDiferente.toString());
	}

	@Test
	public void testGetNome() {
		assertEquals("Matheus", contatoBase.getNome());
	}

	@Test
	public void testGetSobrenome() {
		assertEquals("Gaudencio", contatoBase.getSobrenome());
	}

	@Test
	public void testGetTelefone() {
		assertEquals("2101-0000", contatoBase.getTelefone());
	}

	@Test
	public void testContatosEquals() {
		assertEquals(contatoBase.equals(contatoIgual), true);
		assertEquals(contatoBase.equals(contatoDiferente), false);
	}
}
