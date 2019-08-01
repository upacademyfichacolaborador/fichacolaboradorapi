package io.altar.projetoFichaColaborador.services;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;

import io.altar.projetoFichaColaborador.business.EmailBusiness;
import io.altar.projetoFichaColaborador.business.TokenBusiness;
import io.altar.projetoFichaColaborador.business.UserBusiness;
import io.altar.projetoFichaColaborador.models.Token;

@Path("token")
public class TokenSevices {
	
	@Context
	private UriInfo context;
	
	@Inject
	private UserBusiness ub;
	
	@Inject
	private EmailBusiness eb;
	
	@Inject
	private TokenBusiness tg;
	
	@GET
	@Path("checkTokenGenerator")
	@Produces(MediaType.APPLICATION_JSON)
	public Token checkTokenGenerator() {
		return tg.generateNewToken("email@gmail.com");
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public Response validateToken(String token) {
		System.out.println("Token Value:" + token);
		if(tg.isValid(token)) {
			return Response.status(Status.OK).entity("Token Valido").build();
		}
		else {
			return Response.status(Status.UNAUTHORIZED).build();
		}
		
	}
	
//	@GET
//	@Path("checkTimeToken")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String checkTimeToken() {
//		tg.isValid();
//		return null;
//	}

}
