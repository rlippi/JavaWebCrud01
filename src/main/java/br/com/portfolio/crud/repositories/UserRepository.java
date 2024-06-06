package br.com.portfolio.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolio.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	// esta interface já herda tudo do JPA Repository, por isso não é necessário configurações

}
