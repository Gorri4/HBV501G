package is.hi.byrjun.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import is.hi.byrjun.model.Login;
/**
 * 
 * @author gudmundurorripalsson
 *	LoginRepositry interface fyrir Login gagnagrunn
 */
@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	
	Login save (Login notandi);
	
	List<Login> findAll();
	
	/*
	@Modifying
	@Query("update Login p set p.krossar=:ID where p.userinn=:User")
    Login findAllWithID3(int ID,String User);
	*/
	
	Login findById(int i);
	
}