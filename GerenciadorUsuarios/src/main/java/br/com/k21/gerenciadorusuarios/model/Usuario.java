package br.com.k21.gerenciadorusuarios.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = -4887004341408367111L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String login;

	private String nome;

	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return this.getNome();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Usuario)) {
			return false;
		}
		Usuario compare = (Usuario) obj;
		return this.getId().equals(compare.getId());
	}

	@Override
	public int hashCode() {
		final int seed = 13;
		int hashCode = 1;
		if (this.getLogin() != null) {
			hashCode = this.getId().hashCode();
		}

		return hashCode * seed;
	}
}
