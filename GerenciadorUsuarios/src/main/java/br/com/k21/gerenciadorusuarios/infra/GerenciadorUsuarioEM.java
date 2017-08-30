package br.com.k21.gerenciadorusuarios.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class GerenciadorUsuarioEM {

	private static final GerenciadorUsuarioEM INSTANCE = new GerenciadorUsuarioEM();

	private EntityManager em;
	private GerenciadorUsuarioEM() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("GerenciadorUsuarioH2");
        this.em = factory.createEntityManager();
	}

	public static GerenciadorUsuarioEM getInstance() {
		return INSTANCE;
	}

	public EntityManager getEntityManager() {
		return em;
	}
	
}
