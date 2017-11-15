package is.hi.byrjun.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import is.hi.byrjun.model.Login;
import is.hi.byrjun.model.Spurningar;
/**
 * 
 * @author gudmundurorripalsson
 *	SpurningaRepository fyrir Spurninga gagnagrunn
 */
@Repository
public interface SpurningaRepository extends JpaRepository<Spurningar, Long>{
	
	Spurningar save (Spurningar spurningar);
	
	List<Spurningar> findAll();
		
	Spurningar findById(int i);
}
