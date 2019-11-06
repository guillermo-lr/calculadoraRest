package com.servicios;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("calculadora")
@Produces("text/plain")
public class Calculadora {

	
	
	@GET
	@Path("/hola")
	public String hola() {
		
		
		return "hola";
		
	}
	
	@GET
	@Path("/sumar/{primerDigito}/{segundoDigito}")
	public int sumar(@PathParam("primerDigito") int a, @PathParam("segundoDigito") int b) {
		
		int resultado = a+b;
		return resultado;
		
	}
	
	
	@GET
	@Path("/restar/{primerDigito}/{segundoDigito}")
	public int restar(@PathParam("primerDigito") int a, @PathParam("segundoDigito") int b) {
		
		int resultado = a-b;
		
		
		return resultado;
		
	}
	
	@GET
	@Path("/dividir/{primerDigito}/{segundoDigito}")
	public int dividir(@PathParam("primerDigito") int a, @PathParam("segundoDigito") int b) {
		
		int resultado = a/b;
		return resultado;
		
	}
	
	@GET
	@Path("/multiplicar/{primerDigito}/{segundoDigito}")
	public int multiplicar(@PathParam("primerDigito") int a, @PathParam("segundoDigito") int b) {
		
		int resultado = a*b;
		return resultado;
		
	}
}
