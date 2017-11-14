package is.hi.byrjun.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import is.hi.byrjun.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	
	Login save (Login notandi);
	
	List<Login> findAll();
	
	/*
	@Modifying
	@Query(value = "SELECT p FROM Login WHERE p.userinn = :ID")
    Login findAllWithID3(String ID);
	*/
	
	Login findById(int i);
	
}