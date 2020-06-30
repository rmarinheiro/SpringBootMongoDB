package br.com.rafael.springbootmongodb.resource;



import java.net.URI;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.rafael.springbootmongodb.domain.Post;
import br.com.rafael.springbootmongodb.domain.User;
import br.com.rafael.springbootmongodb.dto.UserDTO;
import br.com.rafael.springbootmongodb.services.PostService;
import br.com.rafael.springbootmongodb.services.UserService;

@RestController
@RequestMapping(value="/posts")
public class PostResource {
	
	@Autowired
	private PostService postService;
	
	
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Post> findById(@PathVariable String id){
		Post obj = postService.findById(id);
		
		return ResponseEntity.ok().body(obj);
		
		
	}
	
	

}
