package br.com.portfolio.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{  //lança exceções que o compilador não nos obriga a tratar

	private static final long serialVersionUID = 1L;
	
	//Construtor para passar a mensagem personalizada
	public ResourceNotFoundException (Object id) {
		super("Não foi localizado o usuário com a Id: " + id); //chamada com a mensagem tratada para o construtor pai
	}
	


}
