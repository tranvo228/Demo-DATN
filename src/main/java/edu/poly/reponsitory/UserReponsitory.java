package edu.poly.reponsitory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.poly.model.user;

@Repository
public interface UserReponsitory extends CrudRepository<user, String>{
//	List<user> findByName(String name);
}
