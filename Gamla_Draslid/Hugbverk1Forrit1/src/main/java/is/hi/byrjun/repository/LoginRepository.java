package is.hi.byrjun.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import is.hi.byrjun.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	
	Login save (Login notandi);
	
	List<Login> findAll();
		
}