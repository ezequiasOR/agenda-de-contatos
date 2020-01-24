package agenda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaTest {
	
	private Agenda agenda;
	private String saida = "1 - Matheus Gaudencio\n"
						+ "2 - Matheus GODedencio\n"
						+ "3 - Joao Silva\n";
	@BeforeEach
	public void AgendaTestes() {
		agenda = new Agenda();
	}
	
	@Test
	public void testCadastraContato() {
		assertEquals(true, agenda.cadastraContato(1, "Matheus", "Gaudencio", "(83) 99999-0000"));
		assertEquals(true, agenda.cadastraContato(100, "Matheus", "Gaudencio", "(83) 99999-0000"));
		assertEquals(false, agenda.cadastraContato(0, "Matheus", "Gaudencio", "(83) 99999-0000"));
		assertEquals(false, agenda.cadastraContato(101, "Matheus", "Gaudencio", "(83) 99999-0000"));
		assertEquals(true, agenda.cadastraContato(1, "Lucio", "Nathaum", "(83) 6666-0000"));
	}
	
	@Test
	public void testListarContato() {
		agenda.cadastraContato(1, "Matheus", "Gaudencio", "(83) 99999-0000");
		agenda.cadastraContato(2, "Matheus", "GODedencio", "(83) 99999-0000");
		agenda.cadastraContato(3, "Joao", "Silva", "(83) 99999-0000");
		assertEquals(saida, agenda.listarContato());
		agenda.cadastraContato(4, "Joao", "Papagalli", "(83) 99999-0000");
		saida += "4 - Joao Papagalli\n";
		assertEquals(saida, agenda.listarContato());
	}

	@Test
	public void testExibirContato() {
		agenda.cadastraContato(1, "Matheus", "Gaudencio", "(83) 99999-0000");
		agenda.cadastraContato(2, "Matheus", "GODedencio", "(83) 99999-0000");
		agenda.cadastraContato(3, "Joao", "Silva", "(83) 99999-0000");
		assertEquals("Matheus Gaudencio - (83) 99999-0000", agenda.exibirContato(1));
		assertEquals("Matheus GODedencio - (83) 99999-0000", agenda.exibirContato(2));
		assertEquals("Joao Silva - (83) 99999-0000", agenda.exibirContato(3));
		assertEquals("POSIÃ‡ÃƒO INVÃ�LIDA!", agenda.exibirContato(50));
		assertEquals("POSIÃ‡ÃƒO INVÃ�LIDA!", agenda.exibirContato(100));
	}
}
