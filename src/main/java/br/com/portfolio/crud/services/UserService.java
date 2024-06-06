package br.com.portfolio.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;

import br.com.portfolio.crud.entities.User;
import br.com.portfolio.crud.repositories.UserRepository;
import br.com.portfolio.crud.services.exceptions.ResourceNotFoundException;

@Service //registra essa classe como Serviço
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){ 		// método para encontrar todos os clientes
		return repository.findAll();
	}

	public User findById(Long id) {		//método para buscar o cliente por Id
		Optional<User> usuario = repository.findById(id);
		//return usuario.get(); --> substituir pela exception tratada
		return usuario.orElseThrow(() ->  new ResourceNotFoundException(id)); //adicionada expressão lambda
	}
	
	public User insert(User usuario) {	//método para inserir cliente
		return repository.save(usuario);
	}
	
	
	public void delete(Long id) {				//método para deletar cliente 
		
		try {									//agora apresenta o erro 204 (Content Not Found) ou invés do erro 500
		repository.deleteById(id);
		}
		catch (ResourceNotFoundException e) {
			
		}
	}
	
	
	public User update(Long id, User usuario ) {		//método para fazer update do cliente
		try {
			User cadastro = repository.getReferenceById(id); // agora apresenta o erro 404 (Not Found) ao invés do erro 500
			updateDados(cadastro, usuario);
			return repository.save(cadastro);
		}
		catch (RuntimeException e){										//Runtime Exception que é a mais comum
			throw new ResourceNotFoundException(id);
		}
	
	}
		
	
	private void updateDados(User cadastro, User usuario) {		//colocar no método apenas o que vamos permitir ser alterado
		cadastro.setNome(usuario.getNome());
		cadastro.setEmail(usuario.getEmail());
		cadastro.setTelefone(usuario.getTelefone());
	}
	
}
