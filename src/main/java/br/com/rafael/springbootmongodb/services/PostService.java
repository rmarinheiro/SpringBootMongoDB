package br.com.rafael.springbootmongodb.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafael.springbootmongodb.domain.Post;
import br.com.rafael.springbootmongodb.domain.User;
import br.com.rafael.springbootmongodb.repository.PostRepository;
import br.com.rafael.springbootmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	

	
	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		
		return post.orElseThrow(()-> new ObjectNotFoundException("Objeto Não Encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}
	
	

}
