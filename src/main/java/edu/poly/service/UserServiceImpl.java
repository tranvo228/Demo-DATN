package edu.poly.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.model.user;
import edu.poly.reponsitory.UserReponsitory;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserReponsitory userRepository;
	
	@Override
	public user save(user entity) {
		return userRepository.save(entity);
	}

	@Override
	public List<user> saveAll(List<user> entities) {
		return (List<user>)userRepository.saveAll(entities);
	}

	@Override
	public Optional<user> findById(String id) {
		return userRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return userRepository.existsById(id);
	}

	@Override
	public List<user> findAll() {
		return (List<user>)userRepository.findAll();
	}

	@Override
	public List<user> findAllById(List<String> ids) {
		return (List<user>)userRepository.findAllById(ids);
	}
	
//	@Override
//	public List<user> findByName(String name) {
//		return userRepository.findByName("%" + name + "%");
//	}

	@Override
	public long count() {
		return userRepository.count();
	}

	@Override
	public void deleteById(String id) {
		userRepository.deleteById(id);
	}

	@Override
	public void delete(user entity) {
		userRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<user> entities) {
		userRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		userRepository.deleteAll();
	}
}
