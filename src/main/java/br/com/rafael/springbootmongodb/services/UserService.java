package br.com.rafael.springbootmongodb.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafael.springbootmongodb.domain.User;
import br.com.rafael.springbootmongodb.repository.UserRepositry;

@Service
public class UserService {
	
	@Autowired
	private UserRepositry repo;
	
	public List<User> findAll(){
		
		return repo.findAll();
		
	}

}
