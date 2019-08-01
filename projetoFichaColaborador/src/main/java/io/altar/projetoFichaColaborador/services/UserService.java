package io.altar.projetoFichaColaborador.services;

import java.io.IOException;
import java.time.Instant;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import io.altar.projetoFichaColaborador.business.EmailBusiness;
import io.altar.projetoFichaColaborador.business.TokenBusiness;
import io.altar.projetoFichaColaborador.business.UserBusiness;
import io.altar.projetoFichaColaborador.models.Token;


@Path("user")
public class UserService {
	
	@Context
	private UriInfo context;
	
	@Inject
	private UserBusiness ub;
	
	@Inject
	private EmailBusiness eb;
	
	@Inject
	private TokenBusiness tg;
	
	@GET
	@Path("isOk")
	@Produces(MediaType.TEXT_PLAIN)
	public String healthCheck() {
		return "URI " + context.getRequestUri().toString() + " is OK!";
	}
	
	@GET
	@Path("checkEmail")
	@Produces(MediaType.TEXT_PLAIN)
	public String checkEmail() throws IOException {
		eb.sendEmail("pexofepawu@4alphapro.com",tg.generateNewToken());
		return "URI " + context.getRequestUri().toString() + " is OK!";
	}
	
	@GET
	@Path("checkTokenGenerator")
	@Produces(MediaType.APPLICATION_JSON)
	public Token checkTokenGenerator() {
		return tg.generateNewToken("email@gmail.com");
	}
	
//	@GET
//	@Path("checkTimeToken")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String checkTimeToken() {
//		tg.isValid();
//		return null;
//	}
//	
	
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public List<User> allUsers() {
//		return ub.getAll();
//	}
	
}
