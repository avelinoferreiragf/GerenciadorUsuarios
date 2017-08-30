package br.com.k21.gerenciadorusuarios.infra;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.k21.gerenciadorusuarios.model.Usuario;

public class UsuarioDAO {
	private EntityManager em = GerenciadorUsuarioEM.getInstance().getEntityManager();

	public void incluir(Usuario usuario) {
		this.em.getTransaction().begin();
		this.em.persist(usuario);
		this.em.getTransaction().commit();
	}

	public List<Usuario> listar() {
		String pql = "SELECT usuario FROM Usuario usuario";
		return this.em.createQuery(pql, Usuario.class).getResultList();
	}
}
