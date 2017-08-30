package br.com.k21.gerenciadorusuarios.test.infra;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.com.k21.gerenciadorusuarios.infra.GerenciadorUsuarioEM;

public class GerenciadorUsuarioEMTest {

	@Test
	public void obterEntityManager() {
		EntityManager em = GerenciadorUsuarioEM.getInstance().getEntityManager();

		assertThat(em, notNullValue());
	}
}
