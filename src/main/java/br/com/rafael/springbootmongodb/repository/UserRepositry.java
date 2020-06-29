package br.com.rafael.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.rafael.springbootmongodb.domain.User;

@Repository
public interface UserRepositry extends MongoRepository<User, String> {

}
