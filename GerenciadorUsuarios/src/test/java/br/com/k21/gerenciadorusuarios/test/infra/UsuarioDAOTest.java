package br.com.k21.gerenciadorusuarios.test.infra;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import java.util.List;

import org.junit.Test;

import br.com.k21.gerenciadorusuarios.infra.UsuarioDAO;
import br.com.k21.gerenciadorusuarios.model.Usuario;

public class UsuarioDAOTest {

	private UsuarioDAO dao = new UsuarioDAO();

	@Test
	public void incluir() {
		Usuario usuario = new Usuario();
		usuario.setNome("Avelino F. Gomes Filho");
		usuario.setLogin("avelino");
		usuario.setEmail("avelino@k21.com.br");

		this.dao.incluir(usuario);

		assertThat(usuario.getId(), greaterThan(0L));
	}

	@Test
	public void consultar() {
		Usuario usuario = new Usuario();
		usuario.setNome("Thor");
		usuario.setLogin("thor");
		usuario.setEmail("thor@marvel.com");

		this.dao.incluir(usuario);
		List<Usuario> usuarios = this.dao.listar();

		assertThat(usuarios.size(), greaterThan(0));
	}

}
