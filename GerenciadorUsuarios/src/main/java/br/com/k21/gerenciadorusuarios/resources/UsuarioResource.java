package br.com.k21.gerenciadorusuarios.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.k21.gerenciadorusuarios.infra.UsuarioDAO;
import br.com.k21.gerenciadorusuarios.model.Usuario;

@Path("/usuario")
public class UsuarioResource {

	private UsuarioDAO dao = new UsuarioDAO();
	@Path("/novo")
	@PUT
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
	@Consumes(MediaType.APPLICATION_JSON) 
	public Response novo(String usuarioJSON) {
		try {
			Usuario usuario = new Gson().fromJson(usuarioJSON, Usuario.class);
			this.dao.incluir(usuario);
			return Response.status(Response.Status.CREATED).entity("Usuario inserido com sucesso.").build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}
}
