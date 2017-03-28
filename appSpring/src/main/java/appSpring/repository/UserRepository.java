package appSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import appSpring.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByName(String name);
	
	User findById(Integer id);

}
