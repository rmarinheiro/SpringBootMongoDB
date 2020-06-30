package br.com.rafael.springbootmongodb.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafael.springbootmongodb.domain.User;
import br.com.rafael.springbootmongodb.dto.UserDTO;
import br.com.rafael.springbootmongodb.repository.UserRepositry;
import br.com.rafael.springbootmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepositry repo;
	
	public List<User> findAll(){
		
		return repo.findAll();
		
	}
	
	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		return user.orElseThrow(()->new ObjectNotFoundException("Objeto não Encontrado" + id));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fronDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(),objDTO.getEmail());
	}

}
