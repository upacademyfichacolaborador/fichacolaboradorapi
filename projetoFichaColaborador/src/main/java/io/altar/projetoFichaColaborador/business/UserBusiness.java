package io.altar.projetoFichaColaborador.business;

import java.time.Instant;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import io.altar.projetoFichaColaborador.models.User;
import io.altar.projetoFichaColaborador.repositories.EntityRepository;
import io.altar.projetoFichaColaborador.repositories.UserRepository;

public class UserBusiness {

	@Inject
	private EntityRepository<User> eR;

	@Inject
	private UserRepository uR;
	@Inject
	private LoginBusiness lB;

	public void createUser(User user) {

		System.out.println(user.getPassword());

		user.setPassword(lB.hashPassword(user.getPassword()));

		eR.create(user);
	}

	public Response updateUser(User user) {
		User userTry = lB.getCurrentUser();
		if (userTry.getRole() == "owner") {
			if (user.getId() == userTry.getId()) {
				if (user.getUsername() != userTry.getUsername() || user.getRole() != userTry.getRole()) {
					return Response.status(Response.Status.FORBIDDEN).entity("Nao pode alterar estes dados").build();
				} else {
					String hashedPassword = lB.hashPassword(user.getPassword());
					user.setPassword(hashedPassword);
					user.setModified(Instant.now());
					eR.update(user);
					return Response.status(Response.Status.OK).entity(user).build();
				}
			}
		} else if (user.getId() != userTry.getId()) {
			return Response.status(Response.Status.FORBIDDEN).entity("Nao tem permissao para fazer essas alteracoes")
					.build();
		} else {
			if (user.getUsername() != userTry.getUsername() || user.getRole() != userTry.getRole()) {
				return Response.status(Response.Status.FORBIDDEN)
						.entity("Nao tem permissao para fazer essas alteracoes").build();
			} else {
				String hashedPassword = lB.hashPassword(user.getPassword());
				user.setPassword(hashedPassword);
				user.setModified(Instant.now());
				eR.update(user);
				return Response.status(Response.Status.OK).entity(user).build();
			}
		}
		return null;
	}

	public Response getUserById(long id) {

		//boolean valid = uR.countUserExistsById(id);
		User user = eR.getEntityById(id);
//		if (valid) {
		if (user!=null) {
//			User user = eR.getEntityById(id);
			return Response.accepted().entity(user).build();
		} else {
			return Response.status(Response.Status.NO_CONTENT).entity("Esse utilizador nao existe").build();
		}
	}

	public Response getAllUsers() {
		List<User> tempAllUsers = eR.getAll();

		if (tempAllUsers != null) {
			return Response.accepted().entity(tempAllUsers).build();
		} else {
			return Response.status(Response.Status.NO_CONTENT).build();
		}
	}

	public Response removeUser(long id) {

		User user = lB.getCurrentUser();

		boolean valid = uR.countUserExistsById(id);

		if (valid) {
			User userToRemove = eR.getEntityById(id);
			if (user.getRole() != "owner") {
				return Response.status(Response.Status.FORBIDDEN)
						.entity("Nao tem permissao para eliminar este utilizador").build();

			} else if (user.getId() == userToRemove.getId()) {
				return Response.status(Response.Status.FORBIDDEN)
						.entity("Nao tem permissao para eliminar este utilizador").build();
			} else {
				eR.remove(id);
				return Response.status(Response.Status.OK).entity(user).build();
			}
		} else {
			return Response.status(Response.Status.FORBIDDEN).entity("O utilizador que esta a tentar apagar nao existe")
					.build();
		}

	}

}
