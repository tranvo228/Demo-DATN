package edu.poly.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.poly.model.user;

@Service
public interface UserService {

	void deleteAll();

	void deleteAll(List<user> entities);

	void delete(user entity);

	void deleteById(String id);

	long count();

	List<user> findAllById(List<String> ids);

	List<user> findAll();

	boolean existsById(String id);

	Optional<user> findById(String id);

	List<user> saveAll(List<user> entities);

	user save(user entity);

//	List<user> findByName(String name);

}
